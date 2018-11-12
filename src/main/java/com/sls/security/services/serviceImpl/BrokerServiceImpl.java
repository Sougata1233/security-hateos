package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.BrokerDao;
import com.sls.security.component.BrokerSuppMapDao;
import com.sls.security.component.SupplierMasterDao;
import com.sls.security.dto.BrokerDTO;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.SuppMapDTO;
import com.sls.security.entity.Broker;
import com.sls.security.entity.BrokerSuppMap;
import com.sls.security.entity.SupplierMaster;
import com.sls.security.services.BrokerService;

/*
 * Service implementation class for broker_master table
 */
@Service
public class BrokerServiceImpl implements BrokerService {
	
	@Autowired
	BrokerDao brokerDao;
	
	@Autowired
	BrokerSuppMapDao brokersuppDao;
	
	@Autowired 
	SupplierMasterDao supplierDao;

	/*
	 * (non-Javadoc)
	 * @see com.example.master.services.BrokerService#persistBroker(com.example.master.dto.BrokerDTO)
	 * saving data to the table broker_master
	 */
	@Override
	public ResponseEntity<BrokerDTO> persistBroker(BrokerDTO brokerDTO) {
		Broker broker = new Broker();
		broker.setAddress(brokerDTO.getAddress());
		broker.setBrokerName(brokerDTO.getBrokerName().toUpperCase());
		broker.setEmail(brokerDTO.getEmail());
		broker.setGst(brokerDTO.getGst());
		broker.setPan(brokerDTO.getPan());
		brokerDao.save(broker);
		
		List<SuppMapDTO> brokerSuppMapDTOs = brokerDTO.getSuppliers();
		List<BrokerSuppMap> brokersuppEmpList = new ArrayList<>();
		BrokerSuppMap brokersuppEmpEntity = new BrokerSuppMap();
		
		for(int i = 0 ; i < brokerSuppMapDTOs.size() ; i++) {
			String isMapped = null;
			System.out.println(brokerDTO.getIsMapped());
			long nextval = brokersuppDao.getNextVal();
			brokersuppEmpEntity.setMapId(nextval);
			brokersuppEmpEntity.setBrokerId(broker.getBrokerId());
			brokersuppEmpEntity.setSuppCode(brokerSuppMapDTOs.get(i).getId());
			brokersuppEmpEntity.setIsMapped("true");
			System.out.println(brokerSuppMapDTOs.get(i).getId());
			brokersuppEmpList.add(brokersuppDao.save(brokersuppEmpEntity));
		}
		
		return new ResponseEntity<BrokerDTO>(brokerDTO, HttpStatus.CREATED);
	}

	/*
	 * (non-Javadoc)
	 * @see com.example.master.services.BrokerService#populateOneBrokerDetails(long)
	 * fetching a single data from broker_master table
	 */
	@Override
	public BrokerDTO populateOneBrokerDetails(long id) {
		Broker broker = brokerDao.getBrokerById(id);
		BrokerDTO broker1 = new BrokerDTO();
		try {
			broker1 = prepareBrokerDTO(broker);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return broker1;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.example.master.services.BrokerService#populateBrokerList()
	 * fetching all datas from broker_master table
	 */
	@Override
	public List<BrokerDTO> populateBrokerList() {
		List<BrokerDTO> brokerEmpList = new ArrayList<>();
		try {
			List<Broker> brokerList = brokerDao.getAllBroker();
			brokerList.forEach(broker->{
				try {
					brokerEmpList.add(prepareBrokerDTO(broker));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return brokerEmpList;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.example.master.services.BrokerService#deleteBroker(long)
	 * deleting data from broker_master by it's id
	 */
	@Override
	public DeleteDTO deleteBroker(long id) {
		
		List<BrokerSuppMap> brokersupps = brokersuppDao.getByBrokerId(id);
		brokerDao.delete(id);
		
		for(int k = 0 ; k < brokersupps.size() ; k++) {
			brokersuppDao.delete(brokersupps.get(k).getMapId());
		}
		
		DeleteDTO deleteDTO = new DeleteDTO();
		deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
		
		return deleteDTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.example.master.services.BrokerService#updateBroker(com.example.master.dto.BrokerDTO)
	 * updating broker_master table
	 */
	@Override
	public ResponseEntity<BrokerDTO> updateBroker(BrokerDTO broker) {
		Broker brokerEntity = brokerDao.getBrokerById(broker.getBrokerId());
		brokerEntity.setAddress(broker.getAddress());
		brokerEntity.setBrokerName(broker.getBrokerName());
		brokerEntity.setEmail(broker.getEmail());
		brokerEntity.setGst(broker.getGst());
		brokerEntity.setPan(broker.getPan());
		brokerDao.save(brokerEntity);
		
		
		List<SuppMapDTO> brokerSuppList = broker.getSuppliers();
		List<BrokerSuppMap> brokersuppEmp = new ArrayList<>();
		BrokerSuppMap brokersuppmapEmp = new BrokerSuppMap();
		
		
		for(int i = 0 ; i < brokerSuppList.size() ; i++) {
			String suppcode = brokerSuppList.get(i).getId();
			
			BrokerSuppMap brokersuppList =
					brokersuppDao.getByBrokerIdAndSuppCode(broker.getBrokerId(), 
							broker.getSuppliers().get(i).getId());
			
			if(broker.getSuppliers().get(i).getIsMapped().equalsIgnoreCase("true") && brokersuppList!=null) {
				brokersuppList.setBrokerId(brokerEntity.getBrokerId());
				brokersuppList.setSuppCode(suppcode);
				brokersuppList.setIsMapped(broker.getSuppliers().get(i).getIsMapped());
				brokersuppEmp.add(brokersuppDao.save(brokersuppList));
			}else if(broker.getSuppliers().get(i).getIsMapped().equalsIgnoreCase("true") && brokersuppList==null) {
				BrokerSuppMap brokermapEmp = new BrokerSuppMap();
				brokermapEmp.setBrokerId(brokerEntity.getBrokerId());
				brokermapEmp.setSuppCode(suppcode);
				brokermapEmp.setIsMapped(broker.getSuppliers().get(i).getIsMapped());
				brokersuppEmp.add(brokersuppDao.save(brokermapEmp));
			}else if(broker.getSuppliers().get(i).getIsMapped().equalsIgnoreCase("false") && brokersuppList!=null) {
				brokersuppDao.delete(brokersuppList.getMapId());
			}
		}
		
		return new ResponseEntity<BrokerDTO>(broker, HttpStatus.CREATED);
	}
	
	
	/*
	 * preparing brokerDTO for fetching data 
	 */
	private BrokerDTO prepareBrokerDTO(Broker broker) throws Exception {
		BrokerDTO brokerDTO = new BrokerDTO();
		brokerDTO.setAddress(broker.getAddress());
		brokerDTO.setBrokerId(broker.getBrokerId());
		brokerDTO.setBrokerName(broker.getBrokerName());
		brokerDTO.setEmail(broker.getEmail());
		brokerDTO.setGst(broker.getGst());
		brokerDTO.setPan(broker.getPan());
		
		List<BrokerSuppMap> brokerSuppEnitty = brokersuppDao.getByBrokerId(broker.getBrokerId());
		List<String> suppcodes = new ArrayList<>();
		String suppcode;
		for(int k = 0 ; k < brokerSuppEnitty.size() ; k++) {
			suppcode = brokerSuppEnitty.get(k).getSuppCode();
			suppcodes.add(suppcode);
		}
		
		
		List<SupplierMaster> supplier1 = supplierDao.findBySuppType("J");
		long size = supplier1.size();
		List<SuppMapDTO> supplierEmpList = new ArrayList<>();
		System.out.println(brokerSuppEnitty);
		
		long start = Calendar.getInstance().getTimeInMillis();
		for(int i = 0; i<size; i++) {
			SuppMapDTO supplier = new SuppMapDTO();
			String isMapped = "false";
			
			if(suppcodes.contains(supplier1.get(i).getId())) {
				isMapped = "true";
			}else {
				isMapped = "false";
			}
			
			supplier.setIsMapped(isMapped);
			supplier.setId(supplier1.get(i).getId());
			supplier.setSuppName(supplier1.get(i).getsuppName());
			supplierEmpList.add(prepareSupplierDTO(supplier));
			
		}
		
		long end = Calendar.getInstance().getTimeInMillis();
    	System.out.println("start "+start+" end "+end);
    	System.out.println((end-start));
		
		brokerDTO.setSuppliers(supplierEmpList);
		
		return brokerDTO;
	}

	/*
	 * preparing Supplier mukam map DTO for fetching data
	 */
	private SuppMapDTO prepareSupplierDTO(SuppMapDTO supplier) {
		SuppMapDTO suppmapDTO = new SuppMapDTO();
		
		suppmapDTO.setId(supplier.getId());
		suppmapDTO.setSuppName(supplier.getSuppName());
		suppmapDTO.setIsMapped(supplier.getIsMapped());
		
		return suppmapDTO;
	}

}

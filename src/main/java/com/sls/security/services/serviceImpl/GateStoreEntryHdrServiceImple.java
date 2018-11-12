package com.sls.security.services.serviceImpl;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.GateStoreEntryDtlComponent;
import com.sls.security.component.GateStoreEntryHdrComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.GateStoreEntryRegHdrDTO;
import com.sls.security.dto.POLineItemDtlDTO;
import com.sls.security.entity.GateStoreEntryRegDtl;
import com.sls.security.entity.GateStoreEntryRegHdr;
import com.sls.security.services.GateStoreEntryHdrService;

@Service
public class GateStoreEntryHdrServiceImple implements GateStoreEntryHdrService {
	
	@Autowired
	GateStoreEntryHdrComponent storeentryhdrDao;
	
	@Autowired
	GateStoreEntryRegDtlServiceImpl storeentrydtlService;
	
	@Autowired
	GateStoreEntryDtlComponent gatestoredtlDao;
	
	
	
	@Override
	public List<GateStoreEntryRegHdrDTO> getAllGateStoreEntryHdrByDate(Date fromDate, Date toDate) {
		List<GateStoreEntryRegHdrDTO> storeentryhdr = new ArrayList<>();
		
		try {
			List<GateStoreEntryRegHdr> entryhdr = storeentryhdrDao.getGateStoreEntryRegHdrByDate(fromDate, toDate);
			entryhdr.forEach(hdr->{
				storeentryhdr.add(prepareStoreEntryHdrDTO(hdr));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return storeentryhdr;
	}


	@Override
	public List<GateStoreEntryRegHdrDTO> getAllGateStoreEntryRegHdr() {
		List<GateStoreEntryRegHdrDTO> storeentryhdr = new ArrayList<>();
		try {
			List<GateStoreEntryRegHdr> storeentruhdrEntity =  storeentryhdrDao.getAllGateStoreEntryRegHdr();
			storeentruhdrEntity.forEach(storehdr->{
				storeentryhdr.add(prepareStoreEntryHdrDTO(storehdr));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return storeentryhdr;
	}

	private GateStoreEntryRegHdrDTO prepareStoreEntryHdrDTO(GateStoreEntryRegHdr storehdr) {
		GateStoreEntryRegHdrDTO storeentryhdrDTO = new GateStoreEntryRegHdrDTO();
		List<GateStoreEntryRegDtl> entrydtl = gatestoredtlDao.getEntryDtlByHdrId(storehdr.getHdrId());
		
		storeentryhdrDTO.setChallanDate(storehdr.getChallanDate());
		storeentryhdrDTO.setChallanNo(storehdr.getChallanNo());
		storeentryhdrDTO.setDriverName(storehdr.getDriverName());
		storeentryhdrDTO.setHdrId(storehdr.getHdrId());
		storeentryhdrDTO.setInDate(storehdr.getInDate());
		storeentryhdrDTO.setInTime(storehdr.getInTime());
		storeentryhdrDTO.setOpenClose(storehdr.getOpenClose());
		storeentryhdrDTO.setOutDate(storehdr.getOutDate());
		storeentryhdrDTO.setOutTime(storehdr.getOutTime());
		storeentryhdrDTO.setPoNo(storehdr.getPoNo());
		storeentryhdrDTO.setRemarks(storehdr.getRemarks());
		storeentryhdrDTO.setSuppCode(storehdr.getSuppCode());
		storeentryhdrDTO.setSupplierName(storehdr.getSupplierName());
		storeentryhdrDTO.setUpdateBy(storehdr.getUpdateBy());
		storeentryhdrDTO.setVehicleNo(storehdr.getVehicleNo());
		storeentryhdrDTO.setPolineitems(populateEntryDtlDTO(entrydtl));
		
		return storeentryhdrDTO;
	}

	private List<POLineItemDtlDTO> populateEntryDtlDTO(List<GateStoreEntryRegDtl> entrydtl) {
		List<POLineItemDtlDTO> polineitems = new ArrayList<>();
		POLineItemDtlDTO polineitem = new POLineItemDtlDTO();
		
		entrydtl.forEach(dtl->{
			polineitem.setDept(dtl.getDept());
			polineitem.setHdrIdDtl(dtl.getHdrId());
			polineitem.setItemId(dtl.getItemCode());
			polineitem.setItemDesc(dtl.getItemDesc());
			polineitem.setReqQuantity(dtl.getReqQuantity());
			polineitems.add(polineitem);
		});
		
		return polineitems;
	}

	@Override
	public GateStoreEntryRegHdrDTO getGateStoreEntryRegHdrById(long id) {
		return prepareStoreEntryHdrDTO(storeentryhdrDao.getGateStoreEntryRegHdrById(id));
	}

	@Override
	public ResponseEntity<GateStoreEntryRegHdrDTO> saveGateStoreEntryRegHdr(GateStoreEntryRegHdrDTO storehdr) {
		GateStoreEntryRegHdr storeentryhdrEntity = new GateStoreEntryRegHdr();
		
		storeentryhdrEntity.setChallanDate(storehdr.getChallanDate());
		storeentryhdrEntity.setChallanNo(storehdr.getChallanNo());
		storeentryhdrEntity.setDriverName(storehdr.getDriverName());
		storeentryhdrEntity.setHdrId(storehdr.getHdrId());
		storeentryhdrEntity.setInDate(Date.valueOf(LocalDate.now()));
		storeentryhdrEntity.setInTime(Timestamp.valueOf(LocalDateTime.now()));
		storeentryhdrEntity.setOpenClose("2");
		storeentryhdrEntity.setOutDate(storehdr.getOutDate());
		storeentryhdrEntity.setOutTime(storehdr.getOutTime());
		storeentryhdrEntity.setPoNo(storehdr.getPoNo());
		storeentryhdrEntity.setRemarks(storehdr.getRemarks());
		storeentryhdrEntity.setSuppCode(storehdr.getSuppCode());
		storeentryhdrEntity.setSupplierName(storehdr.getSupplierName());
		storeentryhdrEntity.setUpdateBy(storehdr.getUpdateBy());
		storeentryhdrEntity.setVehicleNo(storehdr.getVehicleNo());
		
		storeentryhdrDao.saveGateStoreEntryRegHdr(storeentryhdrEntity);
		
		GateStoreEntryRegDtl storeentrydtl = new GateStoreEntryRegDtl();
		List<POLineItemDtlDTO> polineitems = storehdr.getPolineitems();
		System.out.println(polineitems.size());
		List<GateStoreEntryRegDtl> polineitemsEmp = new ArrayList<>();
		
		polineitems.forEach(polineitem->{
			System.out.println(polineitem);
			storeentrydtl.setDtlId(gatestoredtlDao.getSeq());
			storeentrydtl.setDept(polineitem.getDept());
			storeentrydtl.setHdrId(storeentryhdrEntity.getHdrId());
			storeentrydtl.setItemCode(polineitem.getItemId());
			storeentrydtl.setItemDesc(polineitem.getItemDesc());
			storeentrydtl.setOpenClose("2");
			storeentrydtl.setQuantity(polineitem.getQuantity());
			storeentrydtl.setReqQuantity(polineitem.getReqQuantity());
			storeentrydtl.setUom(polineitem.getUnitId());
			
			polineitemsEmp.add(storeentrydtl);
			gatestoredtlDao.saveGateStoreEntryRegDtl(storeentrydtl);
			
		});
		
//		gatestoredtlDao.saveGateStoreEntryRegDtl(polineitemsEmp);
		return new ResponseEntity<GateStoreEntryRegHdrDTO>(storehdr, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<GateStoreEntryRegHdrDTO> updateGateStoreEntryRegHdr(GateStoreEntryRegHdrDTO storehdr) {
		GateStoreEntryRegHdr storeentryhdrEntity = storeentryhdrDao.getGateStoreEntryRegHdrById(storehdr.getHdrId());
		
		storeentryhdrEntity.setChallanDate(storehdr.getChallanDate());
		storeentryhdrEntity.setChallanNo(storehdr.getChallanNo());
		storeentryhdrEntity.setDriverName(storehdr.getDriverName());
		storeentryhdrEntity.setHdrId(storehdr.getHdrId());
		storeentryhdrEntity.setInDate(Date.valueOf(LocalDate.now()));
		storeentryhdrEntity.setInTime(storehdr.getInTime());
		storeentryhdrEntity.setOpenClose("2");
		storeentryhdrEntity.setOutDate(storehdr.getOutDate());
		storeentryhdrEntity.setOutTime(storehdr.getOutTime());
		storeentryhdrEntity.setPoNo(storehdr.getPoNo());
		storeentryhdrEntity.setRemarks(storehdr.getRemarks());
		storeentryhdrEntity.setSuppCode(storehdr.getSuppCode());
		storeentryhdrEntity.setSupplierName(storehdr.getSupplierName());
		storeentryhdrEntity.setUpdateBy(storehdr.getUpdateBy());
		storeentryhdrEntity.setVehicleNo(storehdr.getVehicleNo());

		storeentryhdrDao.saveGateStoreEntryRegHdr(storeentryhdrEntity);
		
		GateStoreEntryRegDtl storeentrydtl = new GateStoreEntryRegDtl();
		List<POLineItemDtlDTO> polineitems = storehdr.getPolineitems();
		System.out.println(polineitems.size());
		List<GateStoreEntryRegDtl> polineitemsEmp = new ArrayList<>();
		
		polineitems.forEach(polineitem->{
			System.out.println(polineitem);
			storeentrydtl.setDtlId(gatestoredtlDao.getSeq());
			storeentrydtl.setDept(polineitem.getDept());
			storeentrydtl.setHdrId(storeentryhdrEntity.getHdrId());
			storeentrydtl.setItemCode(polineitem.getItemId());
			storeentrydtl.setItemDesc(polineitem.getItemDesc());
			storeentrydtl.setOpenClose("2");
			storeentrydtl.setQuantity(polineitem.getReqQuantity());
			storeentrydtl.setReqQuantity(polineitem.getReqQuantity());
			storeentrydtl.setUom(polineitem.getUnitId());
			
			polineitemsEmp.add(storeentrydtl);
			gatestoredtlDao.saveGateStoreEntryRegDtl(storeentrydtl);
			
		});
		
		return new ResponseEntity<GateStoreEntryRegHdrDTO>(storehdr, HttpStatus.CREATED);
	}

	@Override
	public DeleteDTO deleteGateStoreEntryRegHdr(long id) {
		storeentryhdrDao.deleteGateStoreEntryRegHdr(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;

	}

	
	

}

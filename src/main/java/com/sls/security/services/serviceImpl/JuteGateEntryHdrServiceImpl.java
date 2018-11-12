package com.sls.security.services.serviceImpl;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.ItemMasterDao;
import com.sls.security.component.JuteGateEntryDtlComponent;
import com.sls.security.component.JuteGateEntryHdrComponent;
import com.sls.security.component.JuteQualityPriceMasterComponent;
import com.sls.security.component.MukamDao;
import com.sls.security.component.MukamJuteComponent;
import com.sls.security.component.POLineItemComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteEntryDtlLineItemDTO;
import com.sls.security.dto.JuteEntryHeaderDTO;
import com.sls.security.entity.ItemMaster;
import com.sls.security.entity.JuteEntryHeader;
import com.sls.security.entity.JuteGateEntryDtl;
import com.sls.security.entity.JuteQualityPriceMaster;
import com.sls.security.entity.Mukam;
import com.sls.security.entity.MukamJute;
import com.sls.security.entity.POLineItem;
import com.sls.security.services.JuteGateEntryHdrService;

@Service
public class JuteGateEntryHdrServiceImpl implements JuteGateEntryHdrService {
	
	@Autowired
	JuteGateEntryHdrComponent juteEntryDao;
	
	@Autowired
	JuteGateEntryDtlComponent juteentrydtlDao;
	
	@Autowired
	POLineItemComponent polineitemDao;
	
	@Autowired
	MukamDao mukamDao;
	
	@Autowired
	MukamJuteComponent mukamjuteDao;
	
	@Autowired
	JuteQualityPriceMasterComponent pricemasterDao;
	
	@Autowired
	ItemMasterDao itemDao;

	@Override
	public List<JuteEntryHeaderDTO> getAllJuteGateEntryHeader() {
		List<JuteEntryHeaderDTO> entryHdrDtoList = new ArrayList<>();
		try {
			List<JuteEntryHeader> entryHdrList = juteEntryDao.getAllJuteEntryHeader();
			entryHdrList.forEach(hdr->{
				entryHdrDtoList.add(prepareJuteGateEntryDTO(hdr));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return entryHdrDtoList;
	}

	private JuteEntryHeaderDTO prepareJuteGateEntryDTO(JuteEntryHeader hdr) {
		JuteEntryHeaderDTO entryDTO = new JuteEntryHeaderDTO();
		
		entryDTO.setActualWeight(hdr.getActualWeight());
		entryDTO.setBrokerAddress(hdr.getBrokerAddress());
		entryDTO.setBrokerName(hdr.getBrokerAddress());
		entryDTO.setChalanDate(hdr.getChalanDate());
		entryDTO.setChalanNo(hdr.getChalanNo());
		entryDTO.setDriverName(hdr.getDriverName());
		entryDTO.setFinYear(hdr.getFinYear());
		entryDTO.setGrossWeight(hdr.getGrossWeight());
		entryDTO.setId(hdr.getId());
		entryDTO.setInDate(hdr.getInDate());
		entryDTO.setInTime(hdr.getInTime());
		entryDTO.setMrNo(hdr.getMrNo());
		entryDTO.setMukam(hdr.getMukam());
		entryDTO.setNetWeight(hdr.getNetWeight());
		entryDTO.setOpenClose(hdr.getOpenClose());
		entryDTO.setOutDate(hdr.getOutDate());
		entryDTO.setOutTime(hdr.getOutTime());
		entryDTO.setPoNo(hdr.getPoNo());
		entryDTO.setTransporter(hdr.getTransporter());
		entryDTO.setUpdateBy(hdr.getUpdateBy());
		entryDTO.setUpdateDateTime(hdr.getUpdateDateTime());
		entryDTO.setVehicleNo(hdr.getVehicleNo());
		entryDTO.setSuppCode(hdr.getSuppCode());
		entryDTO.setSupplierName(hdr.getSupplierName());
		
		List<JuteGateEntryDtl> juteEntryDtlEmpEntity = new ArrayList<>();
		JuteGateEntryDtl juteEntryEmpEntity = new JuteGateEntryDtl();
		List<JuteGateEntryDtl> polineitems = juteentrydtlDao.getJuteGateEntryDtlByHdrId(hdr.getId());
		
		List<JuteEntryDtlLineItemDTO> emptyJuteEntryDtlDTOs = new ArrayList<>();
		JuteEntryDtlLineItemDTO emptyJUteEntryDtlDTO = new JuteEntryDtlLineItemDTO();
		polineitems.forEach(lineitem->{
			emptyJuteEntryDtlDTOs.add(prepareEntryDtlDTO(lineitem));
		});
		
		entryDTO.setPolineitem(emptyJuteEntryDtlDTOs);
		
		/*Mukam mukams = mukamDao.findByMukamName(hdr.getMukam());
		List<MukamJute> mukammap = mukamjuteDao.findByMukamId(mukams.getId());
		List<String> itemcodes = mukammap.stream().distinct()
				.map(x -> (String)x.getItemJuteCode())
				.collect(Collectors.toList())
			;
		System.out.println("itemcodes "+itemcodes+" mukam id "+hdr.getMukam());*/
		
		return entryDTO;
	}

	private JuteEntryDtlLineItemDTO prepareEntryDtlDTO(JuteGateEntryDtl entrydtl) {
		JuteEntryDtlLineItemDTO juteentrydtl = new JuteEntryDtlLineItemDTO();
		
		juteentrydtl.setActualJuteTyp(entrydtl.getActualJuteTyp());
		juteentrydtl.setActualQuality(entrydtl.getActualQuality());
		juteentrydtl.setActualQuantity(entrydtl.getActualQuantity());
		juteentrydtl.setAdvisedJuteTyp(entrydtl.getAdvisedJuteTyp());
		juteentrydtl.setAdvisedQuality(entrydtl.getAdvisedQuality());
		juteentrydtl.setAdvisedQuantity(entrydtl.getAdvisedQuantity());
		juteentrydtl.setHdrId(entrydtl.getHdrId());
		juteentrydtl.setItemCode(entrydtl.getItemCode());
		juteentrydtl.setKgs(entrydtl.getKgs());
		juteentrydtl.setOpenClose(entrydtl.getOpenClose());
		juteentrydtl.setRemarks(entrydtl.getRemarks());
		juteentrydtl.setReceivedIn(entrydtl.getReceivedIn());
		juteentrydtl.setRemarks(entrydtl.getRemarks());
		juteentrydtl.setUom(entrydtl.getUom());
		
		return juteentrydtl;
	}

	@Override
	public ResponseEntity<JuteEntryHeaderDTO> saveJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr) {
		JuteEntryHeader juteentryhdrEntity = new JuteEntryHeader();
		Mukam mukams = mukamDao.findByMukamName(entryHdr.getMukam());
		
		juteentryhdrEntity.setActualWeight(entryHdr.getActualWeight());
		juteentryhdrEntity.setBrokerAddress(entryHdr.getBrokerAddress());
		juteentryhdrEntity.setBrokerName(entryHdr.getBrokerName());
		juteentryhdrEntity.setChalanDate(entryHdr.getChalanDate());
		juteentryhdrEntity.setChalanNo(entryHdr.getChalanNo());
		juteentryhdrEntity.setDriverName(entryHdr.getDriverName());
		juteentryhdrEntity.setFinYear(entryHdr.getFinYear());
		juteentryhdrEntity.setGrossWeight(entryHdr.getGrossWeight());
		juteentryhdrEntity.setId(entryHdr.getId());
		juteentryhdrEntity.setInDate(Date.valueOf(LocalDate.now()));
		juteentryhdrEntity.setInTime(Timestamp.valueOf(LocalDateTime.now()));
		juteentryhdrEntity.setMrNo(juteentrydtlDao.getMRSeq());
		juteentryhdrEntity.setMukam(String.valueOf(mukams.getId()));
		juteentryhdrEntity.setNetWeight(entryHdr.getNetWeight());
		juteentryhdrEntity.setOpenClose("2");
		juteentryhdrEntity.setOutDate(Date.valueOf(LocalDate.now()));
		juteentryhdrEntity.setOutTime(Timestamp.valueOf(LocalDateTime.now()));
		juteentryhdrEntity.setPoNo(entryHdr.getPoNo());
		juteentryhdrEntity.setTransporter(entryHdr.getTransporter());
		juteentryhdrEntity.setUpdateBy(entryHdr.getUpdateBy());
		juteentryhdrEntity.setUpdateDateTime(Timestamp.valueOf(LocalDateTime.now()));
		juteentryhdrEntity.setVehicleNo(entryHdr.getVehicleNo());
		juteentryhdrEntity.setSuppCode(entryHdr.getSuppCode());
		juteentryhdrEntity.setSupplierName(entryHdr.getSupplierName());
		
		juteEntryDao.save(juteentryhdrEntity);
		
		JuteGateEntryDtl entrydtlEntity = new JuteGateEntryDtl();
		List<JuteGateEntryDtl> juteentrydtls = new ArrayList<>();
		List<JuteEntryDtlLineItemDTO> polineitems = entryHdr.getPolineitem();
		
		
		System.out.println("Mukam "+mukams);
		List<MukamJute> mukammap = mukamjuteDao.findByMukamId(mukams.getId());
		System.out.println("mukam map "+mukammap.toString());
		/*List<String> itemcodes = mukammap.stream().distinct()
				.map(x -> (String)x.getItemJuteCode())
				.collect(Collectors.toList())
			;*/
		
//		System.out.println("itemcodes "+itemcodes);
		List<POLineItem> lineitem = polineitemDao.getpolineitemByPoNum(entryHdr.getPoNo());
		int size = polineitems.size();
		int size1 = lineitem.size();
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println("polineitemnum "+polineitems.get(i).getPolineitemnum());
			String itemcode = mukammap.get(i).getItemJuteCode();
			System.out.println("item code " +itemcode);
			String itemCode = null;
			List<JuteQualityPriceMaster> pricemaster = pricemasterDao.getPriceMasterByItemCode(itemcode);
//			System.out.println("pricemaster "+pricemaster.get(i).getJuteQuality());
				if(!pricemaster.isEmpty()) {
					if(pricemaster.get(i).getJuteQuality().equals(polineitems.get(i).getActualQuality())) {
						itemCode = itemcode;
					}
					
				}
				
			ItemMaster item = itemDao.findItemMasterById(itemcode);
			
			entrydtlEntity.setRecId(juteentrydtlDao.getSeq());
			entrydtlEntity.setActualJuteTyp(item.getitemDsc());
			entrydtlEntity.setActualQuality(polineitems.get(i).getActualQuality());
			entrydtlEntity.setActualQuantity(polineitems.get(i).getActualQuantity());
			entrydtlEntity.setAdvisedJuteTyp(item.getitemDsc());
			entrydtlEntity.setAdvisedQuality(polineitems.get(i).getAdvisedQuality());
			entrydtlEntity.setAdvisedQuantity(polineitems.get(i).getAdvisedQuantity());
			entrydtlEntity.setHdrId(juteentryhdrEntity.getId());
			entrydtlEntity.setIsPoAmment("0");
			entrydtlEntity.setItemCode(itemCode);
			entrydtlEntity.setOpenClose("2");
			entrydtlEntity.setPoLineItemNum(polineitems.get(i).getPolineitemnum());
			entrydtlEntity.setRemarks(polineitems.get(i).getRemarks());
			entrydtlEntity.setUom(polineitems.get(i).getUom());
			
			juteentrydtlDao.save(entrydtlEntity);
		}
		
		return new ResponseEntity<JuteEntryHeaderDTO>(entryHdr, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<JuteEntryHeaderDTO> updateJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr) {
		JuteEntryHeader juteentryhdrEntity = juteEntryDao.getJuteEntryHeaderById(entryHdr.getId());
		
		juteentryhdrEntity.setBrokerAddress(entryHdr.getBrokerAddress());
		juteentryhdrEntity.setChalanDate(entryHdr.getChalanDate());
		juteentryhdrEntity.setChalanNo(entryHdr.getChalanNo());
		juteentryhdrEntity.setId(entryHdr.getId());
		juteentryhdrEntity.setMrNo(entryHdr.getMrNo());
		juteentryhdrEntity.setMukam(entryHdr.getMukam());
		juteentryhdrEntity.setPoNo(entryHdr.getPoNo());
		juteentryhdrEntity.setVehicleNo(entryHdr.getVehicleNo());
		
		juteEntryDao.save(juteentryhdrEntity);
		return new ResponseEntity<JuteEntryHeaderDTO>(entryHdr, HttpStatus.CREATED);

	}

	@Override
	public DeleteDTO deleteJuteEntryHeader(long id) {
		juteEntryDao.delete(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;

	}

	@Override
	public JuteEntryHeaderDTO getJuteGateEntryHeaderById(long id) {
		JuteEntryHeader juteentryhdrEntity = new JuteEntryHeader();
		try {
			juteentryhdrEntity = juteEntryDao.getJuteEntryHeaderById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return prepareJuteGateEntryDTO(juteentryhdrEntity);
	}

	@Override
	public List<JuteEntryHeaderDTO> getAllJuteGateEntryHdrByDate(Date startDate, Date toDate) {
		List<JuteEntryHeaderDTO> entryhdr = new ArrayList<>();
		
		try {
			List<JuteEntryHeader> entryhdrEntity = juteEntryDao.getAllJuteEntryHeaderByDate(startDate, toDate);
			entryhdrEntity.forEach(hdr->{
				entryhdr.add(prepareJuteGateEntryDTO(hdr));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return entryhdr;
	}

}

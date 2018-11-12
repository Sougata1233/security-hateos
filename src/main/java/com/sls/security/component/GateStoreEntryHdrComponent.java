package com.sls.security.component;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.GateStoreEntryRegHdr;
import com.sls.security.repository.GateStoreEntryHdrRepository;

@Component
public class GateStoreEntryHdrComponent {
	
	@Autowired
	GateStoreEntryHdrRepository storeentryhdrRepository;
	
	@Transactional
	public List<GateStoreEntryRegHdr> getAllGateStoreEntryRegHdr(){
		return storeentryhdrRepository.findAll();
	}
	
	@Transactional
	public GateStoreEntryRegHdr getGateStoreEntryRegHdrById(long id) {
		return storeentryhdrRepository.findOne(id);
	}
	
	@Transactional
	public void saveGateStoreEntryRegHdr(GateStoreEntryRegHdr storeentryhdr) {
		storeentryhdrRepository.save(storeentryhdr);
	}
	
	@Transactional
	public void deleteGateStoreEntryRegHdr(long id) {
		storeentryhdrRepository.delete(id);
	}
	
	@Transactional
	public List<GateStoreEntryRegHdr> getGateStoreEntryRegHdrByDate(Date fromDate, Date toDate){
		return storeentryhdrRepository.findByInDateBetween(fromDate,toDate);
	}
	
	@Transactional
	public GateStoreEntryRegHdr getGateStoreEntryHdrByPoNoAndChallanNo(String poNo, long challanNo) {
		return storeentryhdrRepository.findByPoNoAndChallanNo(poNo, challanNo);
	}
	
	@Transactional
	public GateStoreEntryRegHdr getGateStoreEntryRegHdrByPoNo(String poNo) {
		return storeentryhdrRepository.findByPoNo(poNo);
	}

}

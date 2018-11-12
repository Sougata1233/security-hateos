package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.dto.POHeaderDTO;
import com.sls.security.entity.POHeader;
import com.sls.security.repository.POHeaderRepository;

@Component
public class POHeaderComponent {
	
	@Autowired
	POHeaderRepository pohdrRepository;
	
	@Transactional
	public List<POHeader> getAllPOHeader(){
		return pohdrRepository.findAll();
	}
	
	@Transactional
	public POHeader getPOHeaderById(String id) {
		return pohdrRepository.findOne(id);
	}
	
	@Transactional
	public void savePOHeader(POHeader pohdr) {
		pohdrRepository.save(pohdr);
	}
	
	@Transactional
	public void deletePOHeader(String id) {
		pohdrRepository.delete(id);
	}
	
	@Transactional
	public POHeader getPoHeaderBiIdAndSupplierCode(long id, String supplierId) {
		return pohdrRepository.findByIdAndSupplierId(id, supplierId);
	}

}

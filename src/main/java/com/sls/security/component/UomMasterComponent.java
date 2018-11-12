package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.UomMaster;
import com.sls.security.repository.UomMasterRepository;

@Component
public class UomMasterComponent {
	
	@Autowired
	UomMasterRepository uomRepository;
	
	@Transactional
	public List<String> getAllUomCodeExceptQNT(){
		return uomRepository.getAllUomCodeMaster();
	}
	
	@Transactional
	public List<UomMaster> getAllUomMaster(){
		return uomRepository.findAll();
	}

}

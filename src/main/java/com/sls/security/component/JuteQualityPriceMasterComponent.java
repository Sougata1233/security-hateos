package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.JuteQualityPriceMaster;
import com.sls.security.repository.JuteQualityPriceMasterRepository;

@Component
public class JuteQualityPriceMasterComponent {
	
	@Autowired
	JuteQualityPriceMasterRepository jutequalitypricemasterRepository;
	
	@Transactional
	public List<JuteQualityPriceMaster> getAllJuteQualityPriceMaster(){
		return jutequalitypricemasterRepository.findAll();
	}
	
	@Transactional
	public List<String> getAllJuteQuality(){
		return jutequalitypricemasterRepository.getAllJuteQuality();
	}
	
	@Transactional
	public List<JuteQualityPriceMaster> getPriceMasterByItemCode(String itemCode){
		return jutequalitypricemasterRepository.findByItemCode(itemCode);
	}

}

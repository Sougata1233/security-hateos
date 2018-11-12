package com.sls.security.services;

import java.util.List;

import com.sls.security.dto.JuteQualityPriceMasterDTO;

public interface JuteQualityPriceMasterService {
	
	List<JuteQualityPriceMasterDTO> getAllJuteQualityPriceMaster();
	List<String> getAllJuteQuality();

}

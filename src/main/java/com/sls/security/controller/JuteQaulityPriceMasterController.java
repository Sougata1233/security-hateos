package com.sls.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.dto.JuteQualityPriceMasterDTO;
import com.sls.security.services.serviceImpl.JuteQualityPriceMasterServiceImpl;

@RestController
@RequestMapping("quality")
public class JuteQaulityPriceMasterController {
	
	@Autowired
	JuteQualityPriceMasterServiceImpl qualityService;
	
	@GetMapping("/getAllQuality")
	public List<JuteQualityPriceMasterDTO> getAllJuteQualityPriceMaster(){
		return qualityService.getAllJuteQualityPriceMaster();
	}
	
	@GetMapping("/getAllJuteQuality")
	public List<String> getAllJuteQuality(){
		return qualityService.getAllJuteQuality();
	}

}

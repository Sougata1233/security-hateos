package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.services.serviceImpl.UomMasterServiceImpl;

@RestController
@RequestMapping("/uommaster")
public class UomMasterController {
	
	@Autowired
	UomMasterServiceImpl uomService;
	
	@GetMapping("/getuomcode")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<String> getAllUomCode(){
		return uomService.getAllUomCode();
	}

}

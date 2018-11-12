package com.sls.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.dto.POHeaderDTO;
import com.sls.security.dto.POSupplierDTO;
import com.sls.security.services.serviceImpl.POHeaderServiceImpl;

@RestController
@RequestMapping("poheader")
public class PoHdrController {
	
	@Autowired
	POHeaderServiceImpl pohdrService;
	
	@GetMapping("/getAllPoHdr")
	public List<POHeaderDTO> getAllPoHdr(){
		return pohdrService.getAllPOHeader();
	}
	
	@GetMapping("/getPoHdrById/{id}")
	public POHeaderDTO getPoHdrById(@PathVariable("id") String id) {
		return pohdrService.getPOHeaderById(id);
	}
	
	@GetMapping("/getPoSupplierBbyPoNum/{id}")
	public POSupplierDTO getPOSupplier(@PathVariable("id") String id) {
		return pohdrService.getPoSupplier(id);
	}

}

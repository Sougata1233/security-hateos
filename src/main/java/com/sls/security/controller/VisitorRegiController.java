package com.sls.security.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.VisitorRegiDTO;
import com.sls.security.services.serviceImpl.VisitorRegiServiceImpl;

@RestController
@RequestMapping("visitorRegister/")
public class VisitorRegiController {
	
	@Autowired
	VisitorRegiServiceImpl visitorService;
	
	@GetMapping("getAllVisitorByEntryDate/{fromDate}/{toDate}")
	public List<VisitorRegiDTO> getAllVisitorByEntryDate(@PathVariable("fromDate") Date fromDate,
															@PathVariable("toDate") Date toDate){
		return visitorService.getAllVisitorByEntryDate(fromDate, toDate);
	}
	
	@GetMapping("getAllVisitor")
	public List<VisitorRegiDTO> getAllVisitorRegis(){
		return visitorService.getAllVisitors();
	}
	
	@GetMapping("getVisitorById/{recId}")
	public VisitorRegiDTO getVisitorRegiById(@PathVariable("recId") long recId) {
		return visitorService.getVisitorRegiById(recId);
	}
	
	@PostMapping("saveVisitor")
	public ResponseEntity<VisitorRegiDTO> saveVisitor(@RequestBody VisitorRegiDTO visitor){
		visitorService.saveVisitor(visitor);
		return new ResponseEntity<VisitorRegiDTO>(visitor, HttpStatus.CREATED);
	}
	
	@PutMapping("updateVisitor")
	public ResponseEntity<VisitorRegiDTO> updateVisitor(@RequestBody VisitorRegiDTO visitor){
		visitorService.updateVisitor(visitor);
		return new ResponseEntity<VisitorRegiDTO>(visitor, HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteVisitor/{recId}")
	public DeleteDTO deleteVisitor(@PathVariable("recId") long recId) {
		visitorService.deleteVisitor(recId);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}

}

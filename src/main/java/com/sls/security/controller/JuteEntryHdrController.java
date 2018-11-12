package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteEntryHeaderDTO;
import com.sls.security.services.serviceImpl.JuteGateEntryHdrServiceImpl;

@RestController
@RequestMapping("juteentryhdr")
public class JuteEntryHdrController {
	
	@Autowired
	JuteGateEntryHdrServiceImpl juteentryhdrService;
	
	@GetMapping("/getAllJuteEntryHdrByDate/{fromDate}/{toDate}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<JuteEntryHeaderDTO> getAllJuteEntryHeaderByDate(@PathVariable("fromDate") Date fromDate,
																@PathVariable("toDate") Date toDate){
		return juteentryhdrService.getAllJuteGateEntryHdrByDate(fromDate, toDate);
	}
	
	@GetMapping("/getAllJuteEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<JuteEntryHeaderDTO> getAllJuteEntryHdr(){
		return juteentryhdrService.getAllJuteGateEntryHeader();
	}
	
	@GetMapping("/getAllJuteEntryHdrById/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public JuteEntryHeaderDTO getAllJuteEntryHdrById(@PathVariable("id") long id){
		return juteentryhdrService.getJuteGateEntryHeaderById(id);
	}
	
	@PostMapping("/saveJuteEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<JuteEntryHeaderDTO> saveJuteEntryHdr(@RequestBody JuteEntryHeaderDTO juteentryhdr) {
		juteentryhdrService.saveJuteGateEntryHeader(juteentryhdr);
		return new ResponseEntity<JuteEntryHeaderDTO>(juteentryhdr, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateJuteEntryHdr")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<JuteEntryHeaderDTO> updateJuteEntryHdr(@RequestBody JuteEntryHeaderDTO juteentryhdr) {
		juteentryhdrService.updateJuteGateEntryHeader(juteentryhdr);
		return new ResponseEntity<JuteEntryHeaderDTO>(juteentryhdr, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteJuteEntryHdr/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deleteJuteEntryHdr(@PathVariable("id") long id) {
		juteentryhdrService.deleteJuteEntryHeader(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}

}

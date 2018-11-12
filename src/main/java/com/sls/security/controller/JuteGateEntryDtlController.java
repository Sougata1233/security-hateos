package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

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
import com.sls.security.dto.JuteGateEntryDtlDTO;
import com.sls.security.services.serviceImpl.JuteGateEntryDtlServiceImpl;

@RestController
@RequestMapping("jutegateentrydtl")
public class JuteGateEntryDtlController {
	
	@Autowired
	JuteGateEntryDtlServiceImpl juteentrydtlService;
	
	@GetMapping("/getAllJuteEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<JuteGateEntryDtlDTO> getAllJuteEntryDtl(){
		return juteentrydtlService.getAllJuteEntryDtl();
	}
	
	@GetMapping("/getAllJuteEntryDtl/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public JuteGateEntryDtlDTO getAllJuteEntryDtlId(@PathVariable("id") long id){
		return juteentrydtlService.getOneJuteEntryDtl(id);
	}
	
	@PutMapping("/updateJuteEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<JuteGateEntryDtlDTO> updateJuteEntryDtl(@RequestBody JuteGateEntryDtlDTO juteentrydtl) {
		juteentrydtlService.updateJuteEntryDtl(juteentrydtl);
		return new ResponseEntity<JuteGateEntryDtlDTO>(juteentrydtl, HttpStatus.CREATED);
	}
	
	@PostMapping("saveJuteEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<JuteGateEntryDtlDTO> saveJuteEntryDtl(@RequestBody JuteGateEntryDtlDTO juteentrydtl) {
		juteentrydtlService.saveJuteEntryDtl(juteentrydtl);
		return new ResponseEntity<JuteGateEntryDtlDTO>(juteentrydtl, HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteJuteEntryDtl/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deleteJuteEntryDtl(@PathVariable("id") long id) {
		juteentrydtlService.deleteJuteEntryDtl(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}

}

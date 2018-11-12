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
import com.sls.security.dto.GateStoreEntryRegDtlDTO;
import com.sls.security.services.serviceImpl.GateStoreEntryRegDtlServiceImpl;

@RestController
@RequestMapping("storeentrydtl")
public class GateStoreEntryDtlController {
	
	@Autowired
	GateStoreEntryRegDtlServiceImpl storeentrydtlService;
	
	@GetMapping("/getAllStoreEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<GateStoreEntryRegDtlDTO> getAllStoreEntryDtl(){
		return storeentrydtlService.getAllGateStoreEntryRegDtl();
	}
	
	@GetMapping("/getAllStoreEntryDtl/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public GateStoreEntryRegDtlDTO getAllStoreEntryDtlById(@PathVariable("id") long id){
		return storeentrydtlService.getGateStoreEntryRegDtlById(id);
	}
	
	@PostMapping("/saveStoreEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<GateStoreEntryRegDtlDTO> saveStoreEntryDtl(@RequestBody GateStoreEntryRegDtlDTO storeentrydtl) {
		storeentrydtlService.saveGateStoreEntryRegDtl(storeentrydtl);
		return new ResponseEntity<GateStoreEntryRegDtlDTO>(storeentrydtl, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateStoreEntryDtl")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<GateStoreEntryRegDtlDTO> updateStoreDtl(@RequestBody GateStoreEntryRegDtlDTO storeentrydtl) {
		storeentrydtlService.updateGateStoreEntryRegDtl(storeentrydtl);
		return new ResponseEntity<GateStoreEntryRegDtlDTO>(storeentrydtl, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteStoreEntryDtl/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deleteStoreDtl(@PathVariable("id") long id) {
		storeentrydtlService.delete(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}

}

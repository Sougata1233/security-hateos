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
import com.sls.security.dto.POLineItemDTO;
import com.sls.security.services.serviceImpl.POLineItemServiceImpl;

@RestController
@RequestMapping("/polineitem")
public class POLineItemController {
	
	@Autowired
	POLineItemServiceImpl polineitemService;
	
	@GetMapping("/getlineitembyponum/{poId}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<POLineItemDTO> getLineItemByPONum(@PathVariable("poId") String poId) {
		return polineitemService.getLineItemByPoNum(poId);
	}
	
	@GetMapping("/getalllineitem")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<POLineItemDTO> getAllLineItem(){
		return polineitemService.getAllPOLineItem();
	}
	
	@PostMapping("/savelineitem")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<POLineItemDTO> saveLineitem(@RequestBody POLineItemDTO polineitem) {
		polineitemService.savePOLineItem(polineitem);
		return new ResponseEntity<POLineItemDTO>(polineitem, HttpStatus.CREATED);
	}
	
	@PutMapping("/updatepolineitem")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<POLineItemDTO> updatePoLineItem(@RequestBody POLineItemDTO polineitem) {
		polineitemService.updatePOLineItem(polineitem);
		return new ResponseEntity<POLineItemDTO>(polineitem, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletepolineitem/{id}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deletePOLineItem(@PathVariable("id") long id) {
		polineitemService.deletePOLineItem(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;
	}

}

package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

import java.util.Calendar;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.component.SupplierMasterDao;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.SupplierMasterDTO;
import com.sls.security.entity.SupplierMaster;
import com.sls.security.services.serviceImpl.SupplierMasterServiceImpl;


@RestController
@RequestMapping("/supplierMaster/")
public class SupplierMasterController {

    @Autowired
    SupplierMasterServiceImpl suppliermasterService;
    
    @Autowired
    SupplierMasterDao supplierDao;

    @CrossOrigin(origins = USER_HOST_SERVER)
    @PostMapping("/addSupplierMaster")
    public ResponseEntity<SupplierMasterDTO> persistSupplierMaster(@RequestBody SupplierMasterDTO suppliermasterDTO) {

    	SupplierMaster supplier = supplierDao.findBySuppName(suppliermasterDTO.getsuppName().toUpperCase());
    	
    	if(supplier!=null) {
    		suppliermasterService.persistSupplierMaster(suppliermasterDTO);
    		return new ResponseEntity<SupplierMasterDTO>(suppliermasterDTO, HttpStatus.CREATED);
    	}else {
    		return new ResponseEntity<SupplierMasterDTO>(suppliermasterDTO, HttpStatus.ALREADY_REPORTED);
    	}
    	

    }

    @CrossOrigin(origins = USER_HOST_SERVER)
    @PutMapping("updateSupplierMaster")
    public ResponseEntity<SupplierMasterDTO> updateSupplierMaster(@RequestBody SupplierMasterDTO suppliermasterDTO) {

    	suppliermasterService.updateSupplierMaster(suppliermasterDTO);
    	
	return new ResponseEntity<SupplierMasterDTO>(suppliermasterDTO, HttpStatus.CREATED);

    }

    @CrossOrigin(origins = USER_HOST_SERVER)
    @GetMapping("getAllSupplierMaster")
    public List<SupplierMasterDTO> populateSupplierMasterList() throws Exception {
	
    	long start = Calendar.getInstance().getTimeInMillis();
    	List<SupplierMasterDTO> fetch = suppliermasterService.populateSupplierMasterList();
    	long end = Calendar.getInstance().getTimeInMillis();
    	System.out.println("full time "+(end-start));
    	
    	return fetch;
    	
    }

    @CrossOrigin(origins = USER_HOST_SERVER)
    @GetMapping("getBySupplierMaster/{Id}")
    public SupplierMasterDTO populateOneSupplierMasterDetails(@PathVariable("Id") String Id) {
    
    	long start = Calendar.getInstance().getTimeInMillis();
    	SupplierMasterDTO fetch = suppliermasterService.populateOneSupplierMasterDetails(Id);
    	long end = Calendar.getInstance().getTimeInMillis();
    	System.out.println("full time "+(end-start));
    	
    	return fetch;
    	
    }

    @CrossOrigin(origins = USER_HOST_SERVER)
    @DeleteMapping("deleteSupplierMaster/{Id}")
    public DeleteDTO destroySupplierMaster(@PathVariable("Id") String Id) {

    	return suppliermasterService.destroySupplierMaster(Id);
    	
    }

	@CrossOrigin(origins = USER_HOST_SERVER)
	@GetMapping("getSupplierBySuppCode/{id}")
    public SupplierMasterDTO getSupplierBySuppCode(@PathVariable("id") String id) {
		return suppliermasterService.getSupplierBySuppCode(id);
	}

	@CrossOrigin(origins = USER_HOST_SERVER)
	@GetMapping("getSupplierBySuppName/{suppName}")
    public SupplierMasterDTO getSupplierBySuppNameAndSuppType(@PathVariable("suppName") String suppName) {
		return suppliermasterService.getSupplierBySuppName(suppName);
	}

	@CrossOrigin(origins = USER_HOST_SERVER)
	@GetMapping("getStoreSupplier")
    public List<SupplierMasterDTO> getStoreSupplier() {
		return suppliermasterService.getStoreSupplier();
	}

	@CrossOrigin(origins = USER_HOST_SERVER)
	@GetMapping("getJuteSupplier")
    public List<SupplierMasterDTO> getJuteSupplier() {
		return suppliermasterService.getJuteSupplier();
	}

   
    

    
}

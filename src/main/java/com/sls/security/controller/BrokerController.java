package com.sls.security.controller;

import static com.sls.security.constant.MasterManagementConstant.USER_HOST_SERVER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.component.BrokerDao;
import com.sls.security.dto.BrokerDTO;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.entity.Broker;
import com.sls.security.services.serviceImpl.BrokerServiceImpl;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/broker/")
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class BrokerController {
	
	@Autowired
	BrokerServiceImpl brokerService;
	
	@Autowired
	BrokerDao brokerDao;
	
	@GetMapping("getAllBroker")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public List<BrokerDTO> getAllBroker(){
		List<BrokerDTO> allBroker = brokerService.populateBrokerList();
		
		allBroker.forEach(broker->{
			long brokerId = broker.getBrokerId();
			Link selfLink = linkTo(BrokerController.class).slash(brokerId).withSelfRel();
		});
		
		return allBroker;
	}
	
	@GetMapping("getBrokerByBrokerId/{brokerId}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public BrokerDTO getBrokerByBrokerId(@PathVariable("brokerId") long brokerId) {
		return brokerService.populateOneBrokerDetails(brokerId);
	}
	
	@PostMapping("saveBroker")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<BrokerDTO> saveBroker(@RequestBody BrokerDTO brokerDTO){
		List<Broker> broker = brokerDao.getBrokerByBrokerName(brokerDTO.getBrokerName().toUpperCase());
		
		if(broker.isEmpty()) {
			brokerService.persistBroker(brokerDTO);
			return new ResponseEntity<BrokerDTO>(brokerDTO, HttpStatus.CREATED);
		}else {
			System.out.println("Entity Already Exists");
			return new ResponseEntity<BrokerDTO>(brokerDTO, HttpStatus.ALREADY_REPORTED);
		}
		
		
	}
	
	@PostMapping("updateBroker")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public ResponseEntity<BrokerDTO> updateBroker(@RequestBody BrokerDTO brokerDTO) {
		brokerService.updateBroker(brokerDTO);
		return new ResponseEntity<BrokerDTO>(brokerDTO, HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteBroker/{brokerId}")
	@CrossOrigin(origins = USER_HOST_SERVER)
	public DeleteDTO deleteBroker(@PathVariable("brokerId") long brokerId) {
		
    	return brokerService.deleteBroker(brokerId);
    	
	}

}

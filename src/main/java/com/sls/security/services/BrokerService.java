package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.BrokerDTO;
import com.sls.security.dto.DeleteDTO;

public interface BrokerService {

	public ResponseEntity<BrokerDTO> persistBroker(BrokerDTO brokerDTO);
	public BrokerDTO populateOneBrokerDetails(long id);
	public List<BrokerDTO> populateBrokerList();
	public DeleteDTO deleteBroker(long id);
	ResponseEntity<BrokerDTO> updateBroker(BrokerDTO broker);
	
}

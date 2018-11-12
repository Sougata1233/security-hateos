package com.sls.security.services;

import java.sql.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.FinishingDispatchRegHdrDTO;

public interface FinishingDispatchRegHdrService {

	List<FinishingDispatchRegHdrDTO> getAllFinishingDispatchRegHdr();
	FinishingDispatchRegHdrDTO getFinishingDispatchRegHdrById(long id);
	ResponseEntity<FinishingDispatchRegHdrDTO> saveFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finishingdispatch);
	ResponseEntity<FinishingDispatchRegHdrDTO> updateFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finishingdispatch);
	void deleteFinishingDispatchRegHdr(long id);
	List<FinishingDispatchRegHdrDTO> getAllFinishingDispatchByDate(Date fromDate, Date toDate);
	
}

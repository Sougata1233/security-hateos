package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.POLineItemDTO;

public interface POLineItemService {
	
	List<POLineItemDTO> getAllPOLineItem();
	POLineItemDTO getPOLineItemById(long id);
	ResponseEntity<POLineItemDTO> savePOLineItem(POLineItemDTO polineitem);
	ResponseEntity<POLineItemDTO> updatePOLineItem(POLineItemDTO polineitem);
	DeleteDTO deletePOLineItem(long id);
	List<POLineItemDTO> getLineItemByPoNum(String poId);

}

package com.sls.security.services;

import java.util.List;

import com.sls.security.dto.POHeaderDTO;
import com.sls.security.dto.POSupplierDTO;

public interface POHeaderService {
	
	List<POHeaderDTO> getAllPOHeader();
	POHeaderDTO getPOHeaderById(String id);
	void savePOHeader(POHeaderDTO pohdr);
	void updatePOHeader(POHeaderDTO pohdr);
	void deletePOHeader(String id);
	POSupplierDTO getPoSupplier(String id);
}

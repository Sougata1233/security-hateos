package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.GateStoreEntryRegDtlDTO;
import com.sls.security.entity.GateStoreEntryRegDtl;

public interface GateStoreEntryDtlService {
	
	List<GateStoreEntryRegDtlDTO> getAllGateStoreEntryRegDtl();
	GateStoreEntryRegDtlDTO getGateStoreEntryRegDtlById(long id);
	ResponseEntity<GateStoreEntryRegDtlDTO> saveGateStoreEntryRegDtl(GateStoreEntryRegDtlDTO gatestoreentrydtl);
	ResponseEntity<GateStoreEntryRegDtlDTO> updateGateStoreEntryRegDtl(GateStoreEntryRegDtlDTO gatestoreentrydtl);
	DeleteDTO delete(long id);
	
}

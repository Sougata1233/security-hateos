package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteGateEntryDtlDTO;

public interface JuteGateEntryDtlService {
	
	List<JuteGateEntryDtlDTO> getAllJuteEntryDtl();
	ResponseEntity<JuteGateEntryDtlDTO> saveJuteEntryDtl(JuteGateEntryDtlDTO jutenetrydtl);
	ResponseEntity<JuteGateEntryDtlDTO> updateJuteEntryDtl(JuteGateEntryDtlDTO juteentryDtl);
	DeleteDTO deleteJuteEntryDtl(long id);
	JuteGateEntryDtlDTO getOneJuteEntryDtl(long id);

}

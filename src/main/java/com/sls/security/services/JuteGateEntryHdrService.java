package com.sls.security.services;

import java.sql.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteEntryHeaderDTO;

public interface JuteGateEntryHdrService {

	List<JuteEntryHeaderDTO> getAllJuteGateEntryHeader();
	ResponseEntity<JuteEntryHeaderDTO> saveJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr);
	ResponseEntity<JuteEntryHeaderDTO> updateJuteGateEntryHeader(JuteEntryHeaderDTO entryHdr);
	DeleteDTO deleteJuteEntryHeader(long id);
	JuteEntryHeaderDTO getJuteGateEntryHeaderById(long id);
	List<JuteEntryHeaderDTO> getAllJuteGateEntryHdrByDate(Date startDate, Date toDate);
	
}

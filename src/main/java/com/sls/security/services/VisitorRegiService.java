package com.sls.security.services;

import java.sql.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.VisitorRegiDTO;

public interface VisitorRegiService {
	
	List<VisitorRegiDTO> getAllVisitors();
	VisitorRegiDTO getVisitorRegiById(long id);
	ResponseEntity<VisitorRegiDTO> saveVisitor(VisitorRegiDTO visitor);
	ResponseEntity<VisitorRegiDTO> updateVisitor(VisitorRegiDTO visitor);
	DeleteDTO deleteVisitor(long id);
	List<VisitorRegiDTO> getAllVisitorByEntryDate(Date startDate, Date toDate);
	

}

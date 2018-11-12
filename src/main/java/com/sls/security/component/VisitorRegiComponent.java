package com.sls.security.component;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.VisitorRegiEntity;
import com.sls.security.repository.VisitorRegiRepository;

@Component
public class VisitorRegiComponent {
	
	@Autowired
	VisitorRegiRepository visitorRepository;
	
	@Transactional
	public List<VisitorRegiEntity> getAllVisitors(){
		return visitorRepository.findAll();
	}
	
	@Transactional
	public VisitorRegiEntity getVisitorById(long id) {
		return visitorRepository.findOne(id);
	}
	
	@Transactional
	public void saveVisitor(VisitorRegiEntity visitor) {
		visitorRepository.save(visitor);
	}
	
	@Transactional
	public void deleteVisitor(long id) {
		visitorRepository.delete(id);
	}
	
	@Transactional
	public List<VisitorRegiEntity> getAllVisitorRegiEntityByDate(Date startDate, Date toDate){
		return visitorRepository.findByEntryDateBetween(startDate, toDate);
	}

}

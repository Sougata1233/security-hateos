package com.sls.security.component;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.FinishingDispatchRegHdr;
import com.sls.security.repository.FinishingDispatchRegHdrRepository;

@Component
public class FinishingDispatchRegHdrComponent {
	
	@Autowired
	FinishingDispatchRegHdrRepository finishingdispatchRepository;
	
	@Transactional
	public List<FinishingDispatchRegHdr> getAllFinishingDispatchRegHdr(){
		return finishingdispatchRepository.findAll();
	}
	
	@Transactional
	public FinishingDispatchRegHdr getFinishingDispatchRegHdrById(long id) {
		return finishingdispatchRepository.findOne(id);
	}
	
	@Transactional
	public void saveFinishingDispatchRegHdr(FinishingDispatchRegHdr finishingdispatch) {
		finishingdispatchRepository.save(finishingdispatch);
	}
	
	@Transactional
	public void deleteFinishingDispatchRegHdr(long id) {
		finishingdispatchRepository.delete(id);
	}
	
	@Transactional
	public List<FinishingDispatchRegHdr> getAllFinishingDispatchRegHdrByDate(Date fromDate, Date toDate){
		return finishingdispatchRepository.findByInDateBetween(fromDate, toDate);
	}

}

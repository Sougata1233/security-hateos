package com.sls.security.component;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.JuteEntryHeader;
import com.sls.security.repository.JuteGateEntryHdrRepository;

@Component
public class JuteGateEntryHdrComponent {
	
	@Autowired
	JuteGateEntryHdrRepository jutegatehdrRepository;
	
	@Transactional
	public List<JuteEntryHeader> getAllJuteEntryHeader(){
		return jutegatehdrRepository.findAll();
	}
	
	@Transactional
	public JuteEntryHeader getJuteEntryHeaderById(long id) {
		return jutegatehdrRepository.findById(id);
	}

	public void save(JuteEntryHeader juteentryhdrEntity) {
		
		jutegatehdrRepository.save(juteentryhdrEntity);
		
	}

	public void delete(long id) {
		jutegatehdrRepository.delete(id);
		
	}
	
	@Transactional
	public List<JuteEntryHeader> getAllJuteEntryHeaderByDate(Date startDate, Date toDate){
		return jutegatehdrRepository.findByInDateBetween(startDate, toDate);
	}

}

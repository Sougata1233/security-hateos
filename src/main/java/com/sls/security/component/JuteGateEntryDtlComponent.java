package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.dto.JuteGateEntryDtlDTO;
import com.sls.security.entity.JuteGateEntryDtl;
import com.sls.security.repository.JuteGateEntryDtlRepository;

@Component
public class JuteGateEntryDtlComponent {
	
	@Autowired
	JuteGateEntryDtlRepository juteEntryDtlRepository;
	
	@Transactional
	public List<JuteGateEntryDtl> getAllJuteGateEntryDtl(){
		return juteEntryDtlRepository.findAll();
	}
	
	public long getSeq() {
		return juteEntryDtlRepository.getNextSeriesId();
	}
	
	public long getMRSeq() {
		return juteEntryDtlRepository.getMRNextSeriesId();
	}

	@Transactional
	public void save(JuteGateEntryDtl entrydtlEntity) {
		juteEntryDtlRepository.save(entrydtlEntity);
		
	}
	
	@Transactional
	public JuteGateEntryDtl getJuteGateEntryDtlById(long id) {
		return juteEntryDtlRepository.findOne(id);
		
	}

	@Transactional
	public void delete(long id) {
		juteEntryDtlRepository.delete(id);
		
	}
	
	@Transactional
	public List<JuteGateEntryDtl> getJuteGateEntryDtlByHdrId(long hdrId){
		return juteEntryDtlRepository.findByHdrId(hdrId);
	}

}

package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.SelectioinQuallityMst;
import com.sls.security.repository.SelectionQualityMstRepository;

@Component
public class SelectioinQuallityMstComponent {
	
	@Autowired
	SelectionQualityMstRepository selectionqualityRepository;
	
	@Transactional
	public void saveSelectionQuality(SelectioinQuallityMst selectionQuality) {
		selectionqualityRepository.save(selectionQuality);
	}
	
	@Transactional
	public void updateSelectioinQuallityMst(SelectioinQuallityMst selectionQuality) {
		selectionqualityRepository.save(selectionqualityRepository.findOne(selectionQuality.getRecId()));
	}
	
	@Transactional
	public List<SelectioinQuallityMst> getAllSectionQuality(){
		return selectionqualityRepository.findAll();
	}
	
	@Transactional
	public SelectioinQuallityMst getSelectioinQuallityMstById(long id) {
		return selectionqualityRepository.findOne(id);
	}
	
	@Transactional
	public void deleteSelectioinQuallityMst(long id) {
		selectionqualityRepository.delete(id);
	}

}

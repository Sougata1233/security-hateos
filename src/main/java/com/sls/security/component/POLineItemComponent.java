package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.dto.POLineItemDTO;
import com.sls.security.entity.POLineItem;
import com.sls.security.repository.POLineItemRepository;

@Component
public class POLineItemComponent {
	
	@Autowired
	POLineItemRepository polineitemRepository;
	
	@Transactional
	public List<POLineItem> getAllPOLineItem(){
		return polineitemRepository.findAll();
	}
	
	@Transactional
	public POLineItem getPOLineItemById(long id) {
		return polineitemRepository.findOne(id);
	}
	
	@Transactional
	public void savePoLineItem(POLineItem polineitem) {
		polineitemRepository.save(polineitem);
	}
	
	@Transactional
	public void deletePOLinteItem(long id) {
		polineitemRepository.delete(id);
	}
	
	@Transactional
	public List<POLineItem> getpolineitemByPoNum(String poId) {
		return polineitemRepository.findByPoId(poId);
	}

}

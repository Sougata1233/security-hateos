package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.POLineItemComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.POLineItemDTO;
import com.sls.security.entity.POLineItem;
import com.sls.security.services.POLineItemService;

@Service
public class POLineItemServiceImpl implements POLineItemService {
	
	@Autowired
	POLineItemComponent polineitemDao;

	@Override
	public List<POLineItemDTO> getAllPOLineItem() {
		List<POLineItemDTO> polineitemDTO = new ArrayList<>();
		
		try {
			List<POLineItem> polineitemEntity = polineitemDao.getAllPOLineItem();	
			polineitemEntity.forEach(polineitem->{
				polineitemDTO.add(preparePOLineItemDTO(polineitem));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return polineitemDTO;
	}

	private POLineItemDTO preparePOLineItemDTO(POLineItem polineitem) {
		POLineItemDTO polineitemDTO = new POLineItemDTO();
		
		polineitemDTO.setActualQuantity(polineitem.getActualQuantity());
		polineitemDTO.setAllowableMoisturePercentage(polineitem.getAllowableMoisturePercentage());
		polineitemDTO.setApproveFirstDate(polineitem.getApproveFirstDate());
		polineitemDTO.setApproverFirst(polineitem.getApproverFirst());
		polineitemDTO.setApproverSecond(polineitem.getApproverSecond());
		polineitemDTO.setApproveSecondDate(polineitem.getApproveSecondDate());
		polineitemDTO.setDiscount(polineitem.getDiscount());
		polineitemDTO.setId(polineitem.getId());
		polineitemDTO.setIndentId(polineitem.getIndentId());
		polineitemDTO.setItemGroupId(polineitem.getItemGroupId());
		polineitemDTO.setItemId(polineitem.getItemId());
		polineitemDTO.setMarka(polineitem.getMarka());
		polineitemDTO.setPoId(polineitem.getPoId());
		polineitemDTO.setQualityCode(polineitem.getQualityCode());
		polineitemDTO.setQuantity(polineitem.getQuantity());
		polineitemDTO.setRate(polineitem.getRate());
		polineitemDTO.setStatus(polineitem.getStatus());
		polineitemDTO.setTax(polineitem.getTax());
		polineitemDTO.setType(polineitem.getType());
		polineitemDTO.setUnitId(polineitem.getUnitId());
		polineitemDTO.setValueWithoutTax(polineitem.getValueWithoutTax());
		polineitemDTO.setValueWithTax(polineitem.getValueWithTax());
		polineitemDTO.setItemDesc(polineitem.getItemDesc());
		
		
		return polineitemDTO;
	}

	@Override
	public POLineItemDTO getPOLineItemById(long id) {
		return preparePOLineItemDTO(polineitemDao.getPOLineItemById(id));
	}

	@Override
	public ResponseEntity<POLineItemDTO> savePOLineItem(POLineItemDTO polineitem) {
		POLineItem polineitemEntity = new POLineItem();
		
		polineitemEntity.setActualQuantity(polineitem.getActualQuantity());
		polineitemEntity.setAllowableMoisturePercentage(polineitem.getAllowableMoisturePercentage());
		polineitemEntity.setApproveFirstDate(polineitem.getApproveFirstDate());
		polineitemEntity.setApproverFirst(polineitem.getApproverFirst());
		polineitemEntity.setApproverSecond(polineitem.getApproverSecond());
		polineitemEntity.setApproveSecondDate(polineitem.getApproveSecondDate());
		polineitemEntity.setDiscount(polineitem.getDiscount());
		polineitemEntity.setId(polineitem.getId());
		polineitemEntity.setIndentId(polineitem.getIndentId());
		polineitemEntity.setItemGroupId(polineitem.getItemGroupId());
		polineitemEntity.setItemId(polineitem.getItemId());
		polineitemEntity.setMarka(polineitem.getMarka());
		polineitemEntity.setPoId(polineitem.getPoId());
		polineitemEntity.setQualityCode(polineitem.getQualityCode());
		polineitemEntity.setQuantity(polineitem.getQuantity());
		polineitemEntity.setRate(polineitem.getRate());
		polineitemEntity.setStatus(polineitem.getStatus());
		polineitemEntity.setTax(polineitem.getTax());
		polineitemEntity.setType(polineitem.getType());
		polineitemEntity.setUnitId(polineitem.getUnitId());
		polineitemEntity.setValueWithoutTax(polineitem.getValueWithoutTax());
		polineitemEntity.setValueWithTax(polineitem.getValueWithTax());
		polineitemEntity.setItemDesc(polineitem.getItemDesc());
		
		polineitemDao.savePoLineItem(polineitemEntity);
		
		return new ResponseEntity<POLineItemDTO>(polineitem, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<POLineItemDTO> updatePOLineItem(POLineItemDTO polineitem) {
		POLineItem polineitemEntity = polineitemDao.getPOLineItemById(polineitem.getId());
		
		polineitemEntity.setActualQuantity(polineitem.getActualQuantity());
		polineitemEntity.setAllowableMoisturePercentage(polineitem.getAllowableMoisturePercentage());
		polineitemEntity.setApproveFirstDate(polineitem.getApproveFirstDate());
		polineitemEntity.setApproverFirst(polineitem.getApproverFirst());
		polineitemEntity.setApproverSecond(polineitem.getApproverSecond());
		polineitemEntity.setApproveSecondDate(polineitem.getApproveSecondDate());
		polineitemEntity.setDiscount(polineitem.getDiscount());
		polineitemEntity.setId(polineitem.getId());
		polineitemEntity.setIndentId(polineitem.getIndentId());
		polineitemEntity.setItemGroupId(polineitem.getItemGroupId());
		polineitemEntity.setItemId(polineitem.getItemId());
		polineitemEntity.setMarka(polineitem.getMarka());
		polineitemEntity.setPoId(polineitem.getPoId());
		polineitemEntity.setQualityCode(polineitem.getQualityCode());
		polineitemEntity.setQuantity(polineitem.getQuantity());
		polineitemEntity.setRate(polineitem.getRate());
		polineitemEntity.setStatus(polineitem.getStatus());
		polineitemEntity.setTax(polineitem.getTax());
		polineitemEntity.setType(polineitem.getType());
		polineitemEntity.setUnitId(polineitem.getUnitId());
		polineitemEntity.setValueWithoutTax(polineitem.getValueWithoutTax());
		polineitemEntity.setValueWithTax(polineitem.getValueWithTax());
		polineitemEntity.setItemDesc(polineitem.getItemDesc());
		
		polineitemDao.savePoLineItem(polineitemEntity);
		
		return new ResponseEntity<POLineItemDTO>(polineitem, HttpStatus.CREATED);

	}

	@Override
	public DeleteDTO deletePOLineItem(long id) {
		polineitemDao.deletePOLinteItem(id);
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;

	}

	@Override
	public List<POLineItemDTO> getLineItemByPoNum(String poId) {
		List<POLineItem> lineitems = polineitemDao.getpolineitemByPoNum(poId);
		POLineItemDTO lineitemDTO = new POLineItemDTO();
		List<POLineItemDTO> lineitemDTOs = new ArrayList<>();
		lineitems.forEach(lineitem->{
			lineitemDTOs.add(preparePOLineItemDTO(lineitem));
		});
		return lineitemDTOs;
	}

}

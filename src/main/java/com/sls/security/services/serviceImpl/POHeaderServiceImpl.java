package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sls.security.component.POHeaderComponent;
import com.sls.security.component.SupplierMasterDao;
import com.sls.security.dto.POHeaderDTO;
import com.sls.security.dto.POSupplierDTO;
import com.sls.security.entity.POHeader;
import com.sls.security.entity.SupplierMaster;
import com.sls.security.services.POHeaderService;

@Service
public class POHeaderServiceImpl implements POHeaderService {
	
	@Autowired
	POHeaderComponent pohdrDao;
	
	@Autowired
	SupplierMasterDao supplierDao;
	

	@Override
	public List<POHeaderDTO> getAllPOHeader() {
		List<POHeaderDTO> poheaderDTO = new ArrayList<>();
		try {
			List<POHeader> poheaderEntity = pohdrDao.getAllPOHeader();
			poheaderEntity.forEach(pohdr->{
				poheaderDTO.add(preparePOHeaderDTO(pohdr));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return poheaderDTO;
	}

	private POHeaderDTO preparePOHeaderDTO(POHeader pohdr) {
		POHeaderDTO poheaderDTO = new POHeaderDTO();
		
		poheaderDTO.setApproveFirstDate(pohdr.getApproveFirstDate());
		poheaderDTO.setApproverFirst(pohdr.getApproverFirst());
		poheaderDTO.setApproverSecond(pohdr.getApproverSecond());
		poheaderDTO.setApproveSecondDate(pohdr.getApproveSecondDate());
		poheaderDTO.setCompanyCode(pohdr.getCompanyCode());
		poheaderDTO.setCreateDate(pohdr.getCreateDate());
		poheaderDTO.setDeliveryAddress(pohdr.getDeliveryAddress());
		poheaderDTO.setDeliveryTimeline(pohdr.getDeliveryTimeline());
		poheaderDTO.setDiscount(pohdr.getDiscount());
		poheaderDTO.setFinnacialYear(pohdr.getFinnacialYear());
		poheaderDTO.setFooterNote(pohdr.getFooterNote());
		poheaderDTO.setFrieghtCharge(pohdr.getFrieghtCharge());
		poheaderDTO.setId(pohdr.getId());
		poheaderDTO.setJuteUnit(pohdr.getJuteUnit());
		poheaderDTO.setMukam(pohdr.getMukam());
		poheaderDTO.setPoDate(pohdr.getPoDate());
		poheaderDTO.setStatus(pohdr.getStatus());
		poheaderDTO.setSubmitter(pohdr.getSubmitter());
		poheaderDTO.setSupplierId(pohdr.getSupplierId());
		poheaderDTO.setTax(pohdr.getTax());
		poheaderDTO.setType(pohdr.getType());
		poheaderDTO.setValueWithoutTax(pohdr.getValueWithoutTax());
		poheaderDTO.setValueWithTax(pohdr.getValueWithTax());
		poheaderDTO.setVehicleQuantity(pohdr.getVehicleQuantity());
		poheaderDTO.setVehicleTypeId(pohdr.getVehicleTypeId());
		
		return poheaderDTO;
	}

	@Override
	public POHeaderDTO getPOHeaderById(String id) {
		return preparePOHeaderDTO(pohdrDao.getPOHeaderById(id));
	}

	@Override
	public void savePOHeader(POHeaderDTO pohdr) {
		
		POHeader pohdrEntity = new POHeader();
		
		pohdrEntity.setApproveFirstDate(pohdr.getApproveFirstDate());
		pohdrEntity.setApproverFirst(pohdr.getApproverFirst());
		pohdrEntity.setApproverSecond(pohdr.getApproverSecond());
		pohdrEntity.setApproveSecondDate(pohdr.getApproveSecondDate());
		pohdrEntity.setCompanyCode(pohdr.getCompanyCode());
		pohdrEntity.setCreateDate(pohdr.getCreateDate());
		pohdrEntity.setDeliveryAddress(pohdr.getDeliveryAddress());
		pohdrEntity.setDeliveryTimeline(pohdr.getDeliveryTimeline());
		pohdrEntity.setDiscount(pohdr.getDiscount());
		pohdrEntity.setFinnacialYear(pohdr.getFinnacialYear());
		pohdrEntity.setFooterNote(pohdr.getFooterNote());
		pohdrEntity.setFrieghtCharge(pohdr.getFrieghtCharge());
		pohdrEntity.setId(pohdr.getId());
		pohdrEntity.setJuteUnit(pohdr.getJuteUnit());
		pohdrEntity.setMukam(pohdr.getMukam());
		pohdrEntity.setPoDate(pohdr.getPoDate());
		pohdrEntity.setStatus(pohdr.getStatus());
		pohdrEntity.setSubmitter(pohdr.getSubmitter());
		pohdrEntity.setSupplierId(pohdr.getSupplierId());
		pohdrEntity.setTax(pohdr.getTax());
		pohdrEntity.setType(pohdr.getType());
		pohdrEntity.setValueWithoutTax(pohdr.getValueWithoutTax());
		pohdrEntity.setValueWithTax(pohdr.getValueWithTax());
		pohdrEntity.setVehicleQuantity(pohdr.getVehicleQuantity());
		pohdrEntity.setVehicleTypeId(pohdr.getVehicleTypeId());
		
		pohdrDao.savePOHeader(pohdrEntity);

	}

	@Override
	public void updatePOHeader(POHeaderDTO pohdr) {
		POHeader pohdrEntity = pohdrDao.getPOHeaderById(pohdr.getId());
		
		pohdrEntity.setApproveFirstDate(pohdr.getApproveFirstDate());
		pohdrEntity.setApproverFirst(pohdr.getApproverFirst());
		pohdrEntity.setApproverSecond(pohdr.getApproverSecond());
		pohdrEntity.setApproveSecondDate(pohdr.getApproveSecondDate());
		pohdrEntity.setCompanyCode(pohdr.getCompanyCode());
		pohdrEntity.setCreateDate(pohdr.getCreateDate());
		pohdrEntity.setDeliveryAddress(pohdr.getDeliveryAddress());
		pohdrEntity.setDeliveryTimeline(pohdr.getDeliveryTimeline());
		pohdrEntity.setDiscount(pohdr.getDiscount());
		pohdrEntity.setFinnacialYear(pohdr.getFinnacialYear());
		pohdrEntity.setFooterNote(pohdr.getFooterNote());
		pohdrEntity.setFrieghtCharge(pohdr.getFrieghtCharge());
		pohdrEntity.setId(pohdr.getId());
		pohdrEntity.setJuteUnit(pohdr.getJuteUnit());
		pohdrEntity.setMukam(pohdr.getMukam());
		pohdrEntity.setPoDate(pohdr.getPoDate());
		pohdrEntity.setStatus(pohdr.getStatus());
		pohdrEntity.setSubmitter(pohdr.getSubmitter());
		pohdrEntity.setSupplierId(pohdr.getSupplierId());
		pohdrEntity.setTax(pohdr.getTax());
		pohdrEntity.setType(pohdr.getType());
		pohdrEntity.setValueWithoutTax(pohdr.getValueWithoutTax());
		pohdrEntity.setValueWithTax(pohdr.getValueWithTax());
		pohdrEntity.setVehicleQuantity(pohdr.getVehicleQuantity());
		pohdrEntity.setVehicleTypeId(pohdr.getVehicleTypeId());
		
		pohdrDao.savePOHeader(pohdrEntity);

	}

	@Override
	public void deletePOHeader(String id) {
		pohdrDao.deletePOHeader(id);

	}

	@Override
	public POSupplierDTO getPoSupplier(String id) {
		POSupplierDTO posupplier = new POSupplierDTO();
		POHeader pohdr = pohdrDao.getPOHeaderById(id);
		SupplierMaster supplier = supplierDao.findSupplierMasterById(pohdr.getSupplierId());
		
		posupplier.setSuppCode(supplier.getId());
		posupplier.setSuppName(supplier.getsuppName());
		
		return posupplier;
	}

}

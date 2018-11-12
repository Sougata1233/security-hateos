package com.sls.security.services.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.FinishingDispatchRegHdrComponent;
import com.sls.security.dto.FinishingDispatchRegHdrDTO;
import com.sls.security.dto.JuteEntryHeaderDTO;
import com.sls.security.entity.FinishingDispatchRegHdr;
import com.sls.security.services.FinishingDispatchRegHdrService;

@Service
public class FinishingDispatchRegHdrServiceImpl implements FinishingDispatchRegHdrService {
	
	@Autowired
	FinishingDispatchRegHdrComponent finishingDao;

	@Override
	public List<FinishingDispatchRegHdrDTO> getAllFinishingDispatchRegHdr() {
		List<FinishingDispatchRegHdrDTO> finishingDTOs = new ArrayList<>();
		try {
			List<FinishingDispatchRegHdr> finishingdispatch = finishingDao.getAllFinishingDispatchRegHdr(); 
			finishingdispatch.forEach(finish->{
				finishingDTOs.add(prepareFinishingDispatchDTO(finish));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return finishingDTOs;
	}

	private FinishingDispatchRegHdrDTO prepareFinishingDispatchDTO(FinishingDispatchRegHdr finish) {
		FinishingDispatchRegHdrDTO finishingDTO = new FinishingDispatchRegHdrDTO();
		
		finishingDTO.setActualWeight(finish.getActualWeight());
		finishingDTO.setChallanDate(finish.getChallanDate());
		finishingDTO.setChallanNo(finish.getChallanNo());
		finishingDTO.setDriverName(finish.getDriverName());
		finishingDTO.setGrossWeight(finish.getGrossWeight());
		finishingDTO.setHdrId(finish.getHdrId());
		finishingDTO.setInDate(finish.getInDate());
		finishingDTO.setInTime(finish.getInTime());
		finishingDTO.setNetWeight(finish.getNetWeight());
		finishingDTO.setOpenClose(finish.getOpenClose());
		finishingDTO.setOrderNo(finish.getOrderNo());
		finishingDTO.setOutDate(finish.getOutDate());
		finishingDTO.setOutTime(finish.getOutTime());
		finishingDTO.setTransporter(finish.getTransporter());
		finishingDTO.setUpdateBy(finish.getUpdateBy());
		finishingDTO.setUpdateDateTime(finish.getUpdateDateTime());
		finishingDTO.setVehicleNo(finish.getVehicleNo());
		finishingDTO.setVeighclePassNO(finish.getVeighclePassNO());
		finishingDTO.setWhomToDispatch(finish.getWhomToDispatch());
		
		return finishingDTO;
	}

	@Override
	public FinishingDispatchRegHdrDTO getFinishingDispatchRegHdrById(long id) {
		return prepareFinishingDispatchDTO(finishingDao.getFinishingDispatchRegHdrById(id));
	}

	@Override
	public ResponseEntity<FinishingDispatchRegHdrDTO> saveFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finish) {
		FinishingDispatchRegHdr finishingEntitiy = new FinishingDispatchRegHdr();
		
		finishingEntitiy.setActualWeight(finish.getActualWeight());
		finishingEntitiy.setChallanDate(finish.getChallanDate());
		finishingEntitiy.setChallanNo(finish.getChallanNo());
		finishingEntitiy.setDriverName(finish.getDriverName());
		finishingEntitiy.setGrossWeight(finish.getGrossWeight());
		finishingEntitiy.setHdrId(finish.getHdrId());
		finishingEntitiy.setInDate(finish.getInDate());
		finishingEntitiy.setInTime(finish.getInTime());
		finishingEntitiy.setNetWeight(finish.getNetWeight());
		finishingEntitiy.setOpenClose(finish.getOpenClose());
		finishingEntitiy.setOrderNo(finish.getOrderNo());
		finishingEntitiy.setOutDate(finish.getOutDate());
		finishingEntitiy.setOutTime(finish.getOutTime());
		finishingEntitiy.setTransporter(finish.getTransporter());
		finishingEntitiy.setUpdateBy(finish.getUpdateBy());
		finishingEntitiy.setUpdateDateTime(finish.getUpdateDateTime());
		finishingEntitiy.setVehicleNo(finish.getVehicleNo());
		finishingEntitiy.setVeighclePassNO(finish.getVeighclePassNO());
		finishingEntitiy.setWhomToDispatch(finish.getWhomToDispatch());
		
		finishingDao.saveFinishingDispatchRegHdr(finishingEntitiy);
		
		return new ResponseEntity<FinishingDispatchRegHdrDTO>(finish, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<FinishingDispatchRegHdrDTO> updateFinishingDispatchRegHdr(FinishingDispatchRegHdrDTO finish) {
		FinishingDispatchRegHdr finishingEntitiy = finishingDao.getFinishingDispatchRegHdrById(finish.getHdrId());
		
		finishingEntitiy.setActualWeight(finish.getActualWeight());
		finishingEntitiy.setChallanDate(finish.getChallanDate());
		finishingEntitiy.setChallanNo(finish.getChallanNo());
		finishingEntitiy.setDriverName(finish.getDriverName());
		finishingEntitiy.setGrossWeight(finish.getGrossWeight());
		finishingEntitiy.setHdrId(finish.getHdrId());
		finishingEntitiy.setInDate(finish.getInDate());
		finishingEntitiy.setInTime(finish.getInTime());
		finishingEntitiy.setNetWeight(finish.getNetWeight());
		finishingEntitiy.setOpenClose(finish.getOpenClose());
		finishingEntitiy.setOrderNo(finish.getOrderNo());
		finishingEntitiy.setOutDate(finish.getOutDate());
		finishingEntitiy.setOutTime(finish.getOutTime());
		finishingEntitiy.setTransporter(finish.getTransporter());
		finishingEntitiy.setUpdateBy(finish.getUpdateBy());
		finishingEntitiy.setUpdateDateTime(finish.getUpdateDateTime());
		finishingEntitiy.setVehicleNo(finish.getVehicleNo());
		finishingEntitiy.setVeighclePassNO(finish.getVeighclePassNO());
		finishingEntitiy.setWhomToDispatch(finish.getWhomToDispatch());
		
		finishingDao.saveFinishingDispatchRegHdr(finishingEntitiy);
		
		return new ResponseEntity<FinishingDispatchRegHdrDTO>(finish, HttpStatus.CREATED);

	}

	@Override
	public void deleteFinishingDispatchRegHdr(long id) {
		finishingDao.deleteFinishingDispatchRegHdr(id);

	}

	@Override
	public List<FinishingDispatchRegHdrDTO> getAllFinishingDispatchByDate(Date fromDate, Date toDate) {
		List<FinishingDispatchRegHdrDTO> finishingDispatchDTOs = new ArrayList<>();
		
		try {
			List<FinishingDispatchRegHdr> finishingdiapatch = 
									finishingDao.getAllFinishingDispatchRegHdrByDate(fromDate, toDate);
			finishingdiapatch.forEach(finish->{
				finishingDispatchDTOs.add(prepareFinishingDispatchDTO(finish));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return finishingDispatchDTOs;
	}

}

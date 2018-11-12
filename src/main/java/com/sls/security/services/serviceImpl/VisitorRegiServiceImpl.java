package com.sls.security.services.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.VisitorRegiComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.VisitorRegiDTO;
import com.sls.security.entity.VisitorRegiEntity;
import com.sls.security.services.VisitorRegiService;

@Service
public class VisitorRegiServiceImpl implements VisitorRegiService {
	
	@Autowired
	VisitorRegiComponent visitorDao;

	@Override
	public List<VisitorRegiDTO> getAllVisitors() {
		List<VisitorRegiDTO> visitorDTO = new ArrayList<>();
		try {
			List<VisitorRegiEntity> visitor = visitorDao.getAllVisitors();
			visitor.forEach(visi->{
				visitorDTO.add(prepareVisitorDTO(visi));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return visitorDTO;
	}

	private VisitorRegiDTO prepareVisitorDTO(VisitorRegiEntity visi) {
		VisitorRegiDTO visitorDTO = new VisitorRegiDTO();
		
		visitorDTO.setAddress(visi.getAddress());
		visitorDTO.setDepartment(visi.getDepartment());
		visitorDTO.setEntryDate(visi.getEntryDate());
		visitorDTO.setInTime(visi.getInTime());
		visitorDTO.setOpenClose(visi.getOpenClose());
		visitorDTO.setOutDate(visi.getOutDate());
		visitorDTO.setOutTime(visi.getOutTime());
		visitorDTO.setPhoneNo(visi.getPhoneNo());
		visitorDTO.setPurpose(visi.getPurpose());
		visitorDTO.setRecId(visi.getRecId());
		visitorDTO.setQrCode(visi.getQrCode());
		visitorDTO.setRemarks(visi.getRemarks());
		visitorDTO.setUser1(visi.getUser1());
		visitorDTO.setVisitorImage(visi.getVisitorImage());
		visitorDTO.setVisitorName(visi.getVisitorName());
		visitorDTO.setWhomToMeet(visi.getWhomToMeet());
		
		return visitorDTO;
	}

	@Override
	public VisitorRegiDTO getVisitorRegiById(long id) {
		return prepareVisitorDTO(visitorDao.getVisitorById(id));
	}

	@Override
	public ResponseEntity<VisitorRegiDTO> saveVisitor(VisitorRegiDTO visi) {
		VisitorRegiEntity visitorEntity = new VisitorRegiEntity();
		
		visitorEntity.setAddress(visi.getAddress());
		visitorEntity.setDepartment(visi.getDepartment());
		visitorEntity.setEntryDate(visi.getEntryDate());
		visitorEntity.setInTime(visi.getInTime());
		visitorEntity.setOpenClose(visi.getOpenClose());
		visitorEntity.setOutDate(visi.getOutDate());
		visitorEntity.setOutTime(visi.getOutTime());
		visitorEntity.setPhoneNo(visi.getPhoneNo());
		visitorEntity.setPurpose(visi.getPurpose());
		visitorEntity.setRecId(visi.getRecId());
		visitorEntity.setQrCode(visi.getQrCode());
		visitorEntity.setRemarks(visi.getRemarks());
		visitorEntity.setUser1(visi.getUser1());
		visitorEntity.setVisitorImage(visi.getVisitorImage());
		visitorEntity.setVisitorName(visi.getVisitorName());
		visitorEntity.setWhomToMeet(visi.getWhomToMeet());
		
		return new ResponseEntity<VisitorRegiDTO>(visi, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<VisitorRegiDTO> updateVisitor(VisitorRegiDTO visi) {
		VisitorRegiEntity visitorEntity = visitorDao.getVisitorById(visi.getRecId());
		
		visitorEntity.setAddress(visi.getAddress());
		visitorEntity.setDepartment(visi.getDepartment());
		visitorEntity.setEntryDate(visi.getEntryDate());
		visitorEntity.setInTime(visi.getInTime());
		visitorEntity.setOpenClose(visi.getOpenClose());
		visitorEntity.setOutDate(visi.getOutDate());
		visitorEntity.setOutTime(visi.getOutTime());
		visitorEntity.setPhoneNo(visi.getPhoneNo());
		visitorEntity.setPurpose(visi.getPurpose());
		visitorEntity.setRecId(visi.getRecId());
		visitorEntity.setQrCode(visi.getQrCode());
		visitorEntity.setRemarks(visi.getRemarks());
		visitorEntity.setUser1(visi.getUser1());
		visitorEntity.setVisitorImage(visi.getVisitorImage());
		visitorEntity.setVisitorName(visi.getVisitorName());
		visitorEntity.setWhomToMeet(visi.getWhomToMeet());
		return new ResponseEntity<VisitorRegiDTO>(visi, HttpStatus.CREATED);
	}

	@Override
	public DeleteDTO deleteVisitor(long id) {
		visitorDao.deleteVisitor(id);
		DeleteDTO deleteDTO = new DeleteDTO();
		deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
		return deleteDTO;
	}

	@Override
	public List<VisitorRegiDTO> getAllVisitorByEntryDate(Date startDate, Date toDate) {
		List<VisitorRegiDTO> visitorDTO = new ArrayList<>();
		try {
			List<VisitorRegiEntity> visitors = visitorDao.getAllVisitorRegiEntityByDate(startDate, toDate);
			visitors.forEach(visitor->{
				visitorDTO.add(prepareVisitorDTO(visitor));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return visitorDTO;
	}

}

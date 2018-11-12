package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.JuteGateEntryDtlComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.JuteGateEntryDtlDTO;
import com.sls.security.entity.JuteGateEntryDtl;
import com.sls.security.services.JuteGateEntryDtlService;


@Service
public class JuteGateEntryDtlServiceImpl implements JuteGateEntryDtlService {
	
	@Autowired
	JuteGateEntryDtlComponent juteentrydtlDao;

	@Override
	public List<JuteGateEntryDtlDTO> getAllJuteEntryDtl() {
		List<JuteGateEntryDtlDTO> juteentrydtoDTO = new ArrayList<>();
			
		try {
			List<JuteGateEntryDtl> juteentrydtl = juteentrydtlDao.getAllJuteGateEntryDtl();
			juteentrydtl.forEach(entrydtl->{
				juteentrydtoDTO.add(prepareJuteEntryDtlDTO(entrydtl));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return juteentrydtoDTO;
	}

	private JuteGateEntryDtlDTO prepareJuteEntryDtlDTO(JuteGateEntryDtl entrydtl) {
		JuteGateEntryDtlDTO juteentrydtl = new JuteGateEntryDtlDTO();
		
		juteentrydtl.setActualJuteTyp(entrydtl.getActualJuteTyp());
		juteentrydtl.setActualQuality(entrydtl.getActualQuality());
		juteentrydtl.setActualQuantity(entrydtl.getActualQuantity());
		juteentrydtl.setAdvisedJuteTyp(entrydtl.getAdvisedJuteTyp());
		juteentrydtl.setAdvisedQuality(entrydtl.getAdvisedQuality());
		juteentrydtl.setAdvisedQuantity(entrydtl.getAdvisedQuantity());
		juteentrydtl.setHdrId(entrydtl.getHdrId());
		juteentrydtl.setIsPoAmment(entrydtl.getIsPoAmment());
		juteentrydtl.setItemCode(entrydtl.getItemCode());
		juteentrydtl.setJuteGateSrlNo(entrydtl.getJuteGateSrlNo());
		juteentrydtl.setKgs(entrydtl.getKgs());
		juteentrydtl.setOpenClose(entrydtl.getOpenClose());
		juteentrydtl.setPoLineItemNum(entrydtl.getPoLineItemNum());
		juteentrydtl.setRemarks(entrydtl.getRemarks());
		juteentrydtl.setReceivedIn(entrydtl.getReceivedIn());
		juteentrydtl.setRecId(entrydtl.getRecId());
		juteentrydtl.setRemarks(entrydtl.getRemarks());
		juteentrydtl.setUom(entrydtl.getUom());
		
		return juteentrydtl;
	}

	@Override
	public ResponseEntity<JuteGateEntryDtlDTO> saveJuteEntryDtl(JuteGateEntryDtlDTO jutenetrydtl) {
		JuteGateEntryDtl entrydtlEntity = new JuteGateEntryDtl();
		
		entrydtlEntity.setActualJuteTyp(jutenetrydtl.getActualJuteTyp());
		entrydtlEntity.setActualQuality(jutenetrydtl.getActualQuality());
		entrydtlEntity.setActualQuantity(jutenetrydtl.getActualQuantity());
		entrydtlEntity.setAdvisedJuteTyp(jutenetrydtl.getAdvisedJuteTyp());
		entrydtlEntity.setAdvisedQuality(jutenetrydtl.getAdvisedQuality());
		entrydtlEntity.setAdvisedQuantity(jutenetrydtl.getAdvisedQuantity());
		entrydtlEntity.setHdrId(jutenetrydtl.getHdrId());
		entrydtlEntity.setIsPoAmment(jutenetrydtl.getIsPoAmment());
		entrydtlEntity.setItemCode(jutenetrydtl.getItemCode());
		entrydtlEntity.setJuteGateSrlNo(jutenetrydtl.getJuteGateSrlNo());
		entrydtlEntity.setKgs(jutenetrydtl.getKgs());
		entrydtlEntity.setOpenClose(jutenetrydtl.getOpenClose());
		entrydtlEntity.setPoLineItemNum(jutenetrydtl.getPoLineItemNum());
		entrydtlEntity.setRemarks(jutenetrydtl.getRemarks());
		entrydtlEntity.setReceivedIn(jutenetrydtl.getReceivedIn());
		entrydtlEntity.setRecId(jutenetrydtl.getRecId());
		entrydtlEntity.setRemarks(jutenetrydtl.getRemarks());
		entrydtlEntity.setUom(jutenetrydtl.getUom());
		
		juteentrydtlDao.save(entrydtlEntity);
		return new ResponseEntity<JuteGateEntryDtlDTO>(jutenetrydtl, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<JuteGateEntryDtlDTO> updateJuteEntryDtl(JuteGateEntryDtlDTO jutenetrydtl) {
		JuteGateEntryDtl entrydtlEntity = juteentrydtlDao.getJuteGateEntryDtlById(jutenetrydtl.getRecId());
		
		entrydtlEntity.setActualJuteTyp(jutenetrydtl.getActualJuteTyp());
		entrydtlEntity.setActualQuality(jutenetrydtl.getActualQuality());
		entrydtlEntity.setActualQuantity(jutenetrydtl.getActualQuantity());
		entrydtlEntity.setAdvisedJuteTyp(jutenetrydtl.getAdvisedJuteTyp());
		entrydtlEntity.setAdvisedQuality(jutenetrydtl.getAdvisedQuality());
		entrydtlEntity.setAdvisedQuantity(jutenetrydtl.getAdvisedQuantity());
		entrydtlEntity.setHdrId(jutenetrydtl.getHdrId());
		entrydtlEntity.setIsPoAmment(jutenetrydtl.getIsPoAmment());
		entrydtlEntity.setItemCode(jutenetrydtl.getItemCode());
		entrydtlEntity.setJuteGateSrlNo(jutenetrydtl.getJuteGateSrlNo());
		entrydtlEntity.setKgs(jutenetrydtl.getKgs());
		entrydtlEntity.setOpenClose(jutenetrydtl.getOpenClose());
		entrydtlEntity.setPoLineItemNum(jutenetrydtl.getPoLineItemNum());
		entrydtlEntity.setRemarks(jutenetrydtl.getRemarks());
		entrydtlEntity.setReceivedIn(jutenetrydtl.getReceivedIn());
		entrydtlEntity.setRecId(jutenetrydtl.getRecId());
		entrydtlEntity.setRemarks(jutenetrydtl.getRemarks());
		entrydtlEntity.setUom(jutenetrydtl.getUom());
		
		juteentrydtlDao.save(entrydtlEntity);
		return new ResponseEntity<JuteGateEntryDtlDTO>(jutenetrydtl, HttpStatus.CREATED);

	}

	@Override
	public DeleteDTO deleteJuteEntryDtl(long id) {
		juteentrydtlDao.delete(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;

	}

	@Override
	public JuteGateEntryDtlDTO getOneJuteEntryDtl(long id) {
		return prepareJuteEntryDtlDTO(juteentrydtlDao.getJuteGateEntryDtlById(id));
	}

}

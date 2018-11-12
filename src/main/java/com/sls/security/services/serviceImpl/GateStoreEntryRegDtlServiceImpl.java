package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sls.security.component.GateStoreEntryDtlComponent;
import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.GateStoreEntryRegDtlDTO;
import com.sls.security.entity.GateStoreEntryRegDtl;
import com.sls.security.services.GateStoreEntryDtlService;

@Service
public class GateStoreEntryRegDtlServiceImpl implements GateStoreEntryDtlService {
	
	@Autowired
	GateStoreEntryDtlComponent storeentrydtlDao;

	@Override
	public List<GateStoreEntryRegDtlDTO> getAllGateStoreEntryRegDtl() {
		List<GateStoreEntryRegDtlDTO> storeentrydtlDTO = new ArrayList<>();
		try {
			List<GateStoreEntryRegDtl> storeentrydtls = storeentrydtlDao.getAllGateStoreEntryRegDtl();
			storeentrydtls.forEach(storeentrydtl->{
				storeentrydtlDTO.add(prepareStoreEntryDtlDTO(storeentrydtl));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return storeentrydtlDTO;
	}

	private GateStoreEntryRegDtlDTO prepareStoreEntryDtlDTO(GateStoreEntryRegDtl storeentrydtl) {
		GateStoreEntryRegDtlDTO storeentrydtlDTO = new GateStoreEntryRegDtlDTO();
		
		storeentrydtlDTO.setDept(storeentrydtl.getDept());
		storeentrydtlDTO.setDtlId(storeentrydtl.getDtlId());
		storeentrydtlDTO.setHdrId(storeentrydtl.getHdrId());
		storeentrydtlDTO.setItem(storeentrydtl.getItem());
		storeentrydtlDTO.setItemCode(storeentrydtl.getItemCode());
		storeentrydtlDTO.setItemDesc(storeentrydtl.getItemDesc());
		storeentrydtlDTO.setOpenClose(storeentrydtl.getOpenClose());
		storeentrydtlDTO.setQuantity(storeentrydtl.getQuantity());
		storeentrydtlDTO.setReqQuantity(storeentrydtl.getReqQuantity());
		storeentrydtlDTO.setSrlNo(storeentrydtl.getSrlNo());
		storeentrydtlDTO.setUom(storeentrydtl.getUom());
		
		return storeentrydtlDTO;
	}

	@Override
	public GateStoreEntryRegDtlDTO getGateStoreEntryRegDtlById(long id) {
		return prepareStoreEntryDtlDTO(storeentrydtlDao.getGateStoreEntryRegDtlById(id));
	}

	@Override
	public ResponseEntity<GateStoreEntryRegDtlDTO> saveGateStoreEntryRegDtl(GateStoreEntryRegDtlDTO storeentrydtl) {
		GateStoreEntryRegDtl storeentrydtlEntity = new GateStoreEntryRegDtl();
		
		storeentrydtlEntity.setDept(storeentrydtl.getDept());
		storeentrydtlEntity.setDtlId(storeentrydtl.getDtlId());
		storeentrydtlEntity.setHdrId(storeentrydtl.getHdrId());
		storeentrydtlEntity.setItem(storeentrydtl.getItem());
		storeentrydtlEntity.setItemCode(storeentrydtl.getItemCode());
		storeentrydtlEntity.setItemDesc(storeentrydtl.getItemDesc());
		storeentrydtlEntity.setOpenClose("2");
		storeentrydtlEntity.setQuantity(storeentrydtl.getQuantity());
		storeentrydtlEntity.setReqQuantity(storeentrydtl.getReqQuantity());
		storeentrydtlEntity.setSrlNo(storeentrydtl.getSrlNo());
		storeentrydtlEntity.setUom(storeentrydtl.getUom());
		
		storeentrydtlDao.saveGateStoreEntryRegDtl(storeentrydtlEntity);
		return new ResponseEntity<GateStoreEntryRegDtlDTO>(storeentrydtl, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<GateStoreEntryRegDtlDTO> updateGateStoreEntryRegDtl(GateStoreEntryRegDtlDTO storeentrydtl) {
		GateStoreEntryRegDtl storeentrydtlEntity = storeentrydtlDao.getGateStoreEntryRegDtlById(storeentrydtl.getDtlId());
		
		storeentrydtlEntity.setDept(storeentrydtl.getDept());
		storeentrydtlEntity.setDtlId(storeentrydtl.getDtlId());
		storeentrydtlEntity.setHdrId(storeentrydtl.getHdrId());
		storeentrydtlEntity.setItem(storeentrydtl.getItem());
		storeentrydtlEntity.setItemCode(storeentrydtl.getItemCode());
		storeentrydtlEntity.setItemDesc(storeentrydtl.getItemDesc());
		storeentrydtlEntity.setOpenClose("2");
		storeentrydtlEntity.setQuantity(storeentrydtl.getQuantity());
		storeentrydtlEntity.setReqQuantity(storeentrydtl.getReqQuantity());
		storeentrydtlEntity.setSrlNo(storeentrydtl.getSrlNo());
		storeentrydtlEntity.setUom(storeentrydtl.getUom());
		
		storeentrydtlDao.saveGateStoreEntryRegDtl(storeentrydtlEntity);
		return new ResponseEntity<GateStoreEntryRegDtlDTO>(storeentrydtl, HttpStatus.CREATED);

	}

	@Override
	public DeleteDTO delete(long id) {
		storeentrydtlDao.deleteGateStoreEntryRegDtl(id);
		
		DeleteDTO deleteDTO = new DeleteDTO();
    	deleteDTO.setstatus(1);
    	deleteDTO.setstatusCode(2000);
    	deleteDTO.setmsg("Deleted successfully.");
    	
    	return deleteDTO;

	}

}

package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sls.security.component.SelectioinQuallityMstComponent;
import com.sls.security.dto.SelectionQualityMstDTO;
import com.sls.security.entity.SelectioinQuallityMst;
import com.sls.security.services.SelectioinQuallityMstService;

@Service
public class SelectionQualityMstServiceImpl implements SelectioinQuallityMstService {
	
	@Autowired
	SelectioinQuallityMstComponent selectionqualityDao;

	@Override
	public List<SelectionQualityMstDTO> getAllSelectionQuality() {
		List<SelectionQualityMstDTO> selectionqualityDTO = new ArrayList<>();
		try {
			List<SelectioinQuallityMst> selectionqualityEntity = selectionqualityDao.getAllSectionQuality();
			selectionqualityEntity.forEach(selection->{
				selectionqualityDTO.add(prepareSelectionQualityMstDTO(selection));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return selectionqualityDTO;
	}

	private SelectionQualityMstDTO prepareSelectionQualityMstDTO(SelectioinQuallityMst selection) {
		SelectionQualityMstDTO selectionqualityDTO = new SelectionQualityMstDTO();
		
		selectionqualityDTO.setQuality(selection.getQuality());
		selectionqualityDTO.setRecId(selection.getRecId());
		
		return selectionqualityDTO;
	}

	@Override
	public SelectionQualityMstDTO getSelectioinQuallityMstById(long id) {
		return prepareSelectionQualityMstDTO(selectionqualityDao.getSelectioinQuallityMstById(id));
	}

	@Override
	public void saveSelectioinQuallityMst(SelectionQualityMstDTO selectioinQuallityMst) {
		SelectioinQuallityMst selectionqualityEntity = new SelectioinQuallityMst();
		
		selectionqualityEntity.setQuality(selectioinQuallityMst.getQuality());
		
		selectionqualityDao.saveSelectionQuality(selectionqualityEntity);
	}

	@Override
	public void updateSelectioinQuallityMst(SelectionQualityMstDTO selectioinQuallityMst) {
		SelectioinQuallityMst selectionqualityEntity = 
				selectionqualityDao.getSelectioinQuallityMstById(selectioinQuallityMst.getRecId());
		selectionqualityDao.saveSelectionQuality(selectionqualityEntity);

	}

	@Override
	public void deleteSelectionQualityMst(long id) {
		selectionqualityDao.deleteSelectioinQuallityMst(id);

	}

}

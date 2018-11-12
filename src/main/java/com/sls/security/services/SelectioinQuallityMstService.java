package com.sls.security.services;

import java.util.List;

import com.sls.security.dto.SelectionQualityMstDTO;
import com.sls.security.entity.SelectioinQuallityMst;

public interface SelectioinQuallityMstService {
	
	List<SelectionQualityMstDTO> getAllSelectionQuality();
	SelectionQualityMstDTO getSelectioinQuallityMstById(long id);
	void saveSelectioinQuallityMst(SelectionQualityMstDTO selectioinQuallityMst);
	void updateSelectioinQuallityMst(SelectionQualityMstDTO selectioinQuallityMst);
	void deleteSelectionQualityMst(long id);

}

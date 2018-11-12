package com.sls.security.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sls.security.component.JuteQualityPriceMasterComponent;
import com.sls.security.dto.JuteQualityPriceMasterDTO;
import com.sls.security.entity.JuteQualityPriceMaster;
import com.sls.security.services.JuteQualityPriceMasterService;

@Service
public class JuteQualityPriceMasterServiceImpl implements JuteQualityPriceMasterService {

	@Autowired
	JuteQualityPriceMasterComponent jutequalitypricemasterDao;
	
	@Override
	public List<JuteQualityPriceMasterDTO> getAllJuteQualityPriceMaster() {
		List<JuteQualityPriceMasterDTO> jutepricemaster = new ArrayList<>();
		try {
			List<JuteQualityPriceMaster> jutepricemasterEntity = jutequalitypricemasterDao.getAllJuteQualityPriceMaster();
			jutepricemasterEntity.forEach(quality->{
				jutepricemaster.add(prepareJuteQualityPriceMasterDTO(quality));
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return jutepricemaster;
	}

	private JuteQualityPriceMasterDTO prepareJuteQualityPriceMasterDTO(JuteQualityPriceMaster quality) {
		JuteQualityPriceMasterDTO jutepricemasterDTO = new JuteQualityPriceMasterDTO();
		
		jutepricemasterDTO.setCurrency(quality.getCurrency());
		jutepricemasterDTO.setId(quality.getId());
		jutepricemasterDTO.setItemCode(quality.getItemCode());
		jutepricemasterDTO.setJuteQuality(quality.getJuteQuality());
		jutepricemasterDTO.setRate(quality.getRate());
		
		return jutepricemasterDTO;
	}

	@Override
	public List<String> getAllJuteQuality() {
		return jutequalitypricemasterDao.getAllJuteQuality();
	}

}

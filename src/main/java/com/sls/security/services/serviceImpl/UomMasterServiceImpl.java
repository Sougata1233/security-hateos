package com.sls.security.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sls.security.component.UomMasterComponent;
import com.sls.security.services.UomMasterService;

@Service
public class UomMasterServiceImpl implements UomMasterService {
	
	@Autowired
	UomMasterComponent uomDao;

	@Override
	public List<String> getAllUomCode() {
		return uomDao.getAllUomCodeExceptQNT();
	}

}

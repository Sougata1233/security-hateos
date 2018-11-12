package com.sls.security.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sls.security.entity.SupplierMaster;

public interface SupplierRepository extends CrudRepository<SupplierMaster, String> {
	
	 List<SupplierMaster> findBySuppTyp(String type);

 
}

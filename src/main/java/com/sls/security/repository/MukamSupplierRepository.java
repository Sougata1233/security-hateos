package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.MukamSupplier;

public interface MukamSupplierRepository extends JpaRepository<MukamSupplier, Long> {
	
	 List<MukamSupplier> findBySupplierName(String supplierName);

  
}

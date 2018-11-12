package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sls.security.entity.UomMaster;

public interface UomMasterRepository extends JpaRepository<UomMaster, String> {
	
	@Query("select u.uomCode from UomMaster u where uomCode != 'QNT'")
	List<String> getAllUomCodeMaster();

}

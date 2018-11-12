package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.JuteQualityPriceMaster;

@Repository
public interface JuteQualityPriceMasterRepository extends JpaRepository<JuteQualityPriceMaster, Long> {

	@Query("select q.juteQuality from JuteQualityPriceMaster q")
	List<String> getAllJuteQuality();
	
	List<JuteQualityPriceMaster> findByItemCode(String itemCode);
	
}

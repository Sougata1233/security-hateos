package com.sls.security.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.FinishingDispatchRegHdr;

public interface FinishingDispatchRegHdrRepository extends JpaRepository<FinishingDispatchRegHdr, Long> {

	List<FinishingDispatchRegHdr> findByInDateBetween(Date fromDate, Date toDate);
	
}

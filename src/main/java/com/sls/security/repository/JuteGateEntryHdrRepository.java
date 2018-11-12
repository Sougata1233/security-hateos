package com.sls.security.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.JuteEntryHeader;

@Repository
public interface JuteGateEntryHdrRepository extends JpaRepository<JuteEntryHeader, Long> {
	
	JuteEntryHeader findById(long id); 
	
	List<JuteEntryHeader> findByInDateBetween(Date startDate, Date toDate);

}

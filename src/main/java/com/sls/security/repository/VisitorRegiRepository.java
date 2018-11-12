package com.sls.security.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.VisitorRegiEntity;

@Repository
public interface VisitorRegiRepository extends JpaRepository<VisitorRegiEntity, Long> {

	List<VisitorRegiEntity> findByEntryDateBetween(Date startDate, Date toDate);
	
}

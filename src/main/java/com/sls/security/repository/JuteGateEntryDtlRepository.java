package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sls.security.entity.JuteGateEntryDtl;

@Repository
public interface JuteGateEntryDtlRepository extends JpaRepository<JuteGateEntryDtl, Long> {

	@Query(value = "SELECT JUTE_GATE_ENTRY_DTL_SEQ.nextval FROM dual", nativeQuery = true)
    Long getNextSeriesId();
	
	@Query(value = "SELECT SCM_MR_GRN_HEADER_SEQ.nextval FROM dual", nativeQuery = true)
    Long getMRNextSeriesId();
	
	List<JuteGateEntryDtl> findByHdrId(long hdrId);

}

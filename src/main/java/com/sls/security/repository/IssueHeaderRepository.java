package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.IssueHeader;

public interface IssueHeaderRepository extends JpaRepository<IssueHeader, Long> {

   List<IssueHeader> findByDeptId(String deptId);
   List<IssueHeader> findByUnitId(String unitId);
   List<IssueHeader> findByStatus(String status);


}

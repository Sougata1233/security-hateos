package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.IssueItem;

public interface IssueItemtRepository extends JpaRepository<IssueItem, Long> {

   List<IssueItem> findByDeptId(long deptId);
   List<IssueItem> findByItemId(String itemId);


}

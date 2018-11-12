package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.IssueLineItem;

public interface IssueLineItemRepository extends JpaRepository<IssueLineItem, Long> {

   List<IssueLineItem> findByIssueHeaderId(Long issueHeaderId);

}

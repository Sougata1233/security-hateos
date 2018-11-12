package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.POLineItem;

public interface POLineItemRepository extends JpaRepository<POLineItem, Long> {

   List<POLineItem> findByPoId(String poId);
   List<POLineItem> findByIndentId(String string);

}

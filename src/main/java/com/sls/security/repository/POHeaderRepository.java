package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sls.security.entity.POHeader;

public interface POHeaderRepository extends JpaRepository<POHeader, String> {

   List<POHeader> findByStatus(String status);
   
   @Query("SELECT t FROM POHeader t where t.mukam= ?1 AND t.supplierId = ?2")
   public  List<POHeader> findByMukamAndSupplierId(String mukam, String supplierId);
   
   public POHeader findByIdAndSupplierId(long id, String supplierId);


}

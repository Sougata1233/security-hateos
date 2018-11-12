package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sls.security.entity.ItemMaster;

public interface ItemMasterRepository extends JpaRepository<ItemMaster, Long>{

    ItemMaster findById(String i);

   // List<Activity> findByUserName(String userName);

    // custom query example and return a stream
   // @Query("select u from User u where u.userName = :userName")
   // Stream<Activity> findByUserNameReturnStream(@Param("userName") String userName);
    
    @Query("select i from ItemMaster i where i.grpCode = :grpCode")
    List<ItemMaster> findByGroupCode(@Param("grpCode") String grpCode);
    
//    String grpcode = "999";
    List<ItemMaster> findByGrpCode(String grpCode);
    
    @Query(value = "SELECT ITEMMASTER_SEQ.nextval FROM dual", nativeQuery = true)
    Long getNextSeriesId();
    
    @Query("delete  from ItemMaster i where i.id = :id")
    void deletes(@Param("id") String id);
    
    

}

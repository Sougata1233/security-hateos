package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sls.security.entity.ItemGroupMaster;

public interface ItemGroupMasterRepository extends JpaRepository<ItemGroupMaster, String> {

    ItemGroupMaster findById(String i);
    
    
    @Query("select i from ItemGroupMaster i where i.id != '999'")
    List<ItemGroupMaster> findByGroupIdFilter();

   // List<Activity> findByUserName(String userName);

    // custom query example and return a stream
   // @Query("select u from User u where u.userName = :userName")
   // Stream<Activity> findByUserNameReturnStream(@Param("userName") String userName);

}

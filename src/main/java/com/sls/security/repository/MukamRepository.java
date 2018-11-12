package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sls.security.entity.Mukam;

public interface MukamRepository extends JpaRepository<Mukam, Long> {

    List<Mukam> findById(Long i);
    
    @Query("select m from Mukam m where m.mukamName = :mukamName")
    Mukam findByMukamNameEntity(@Param("mukamName") long mukamName);
    
    Mukam findByMukamName(String mukamname);
    
    @Query("select m from Mukam m where m.id = :id")
    Mukam findByIdEntity(@Param("id") long id);
    
    @Query("Select m.id, m.mukamName from Mukam m")
    List<Mukam> findALL();

   // List<Activity> findByUserName(String userName);

    // custom query example and return a stream
   // @Query("select u from User u where u.userName = :userName")
   // Stream<Activity> findByUserNameReturnStream(@Param("userName") String userName);

}

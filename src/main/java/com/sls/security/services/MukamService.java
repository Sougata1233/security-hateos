package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.MukamDTO;

public interface MukamService {

    //public ResponseEntity<ActivityDTO> getUser(String username);

    public ResponseEntity<MukamDTO> persistMukam(MukamDTO mukam);

     public MukamDTO populateOneMukamDetails(Long userId);
    public List<MukamDTO> populateMukamList();

    

    public DeleteDTO destroyMukam(Long userId);

   

    //public void persistActivity(ActivityDTO loggedUser, boolean changePassword);

    
    

    ResponseEntity<MukamDTO> updateMukam(MukamDTO mukamDTO);

    
    

}

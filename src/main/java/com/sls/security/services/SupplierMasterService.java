package com.sls.security.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sls.security.dto.DeleteDTO;
import com.sls.security.dto.SupplierMasterDTO;


public interface SupplierMasterService {

    //public ResponseEntity<ActivityDTO> getUser(String username);

    public ResponseEntity<SupplierMasterDTO> persistSupplierMaster(SupplierMasterDTO suppliermaster);

     public SupplierMasterDTO populateOneSupplierMasterDetails(String Id);
    public List<SupplierMasterDTO> populateSupplierMasterList() throws Exception;
    public SupplierMasterDTO getSupplierBySuppCode(String id);
    public SupplierMasterDTO getSupplierBySuppName(String suppName);
    public List<SupplierMasterDTO> getStoreSupplier();
    public List<SupplierMasterDTO> getJuteSupplier();
    

    public DeleteDTO destroySupplierMaster(String Id);

   

    //public void persistActivity(ActivityDTO loggedUser, boolean changePassword);

    
    

    ResponseEntity<SupplierMasterDTO> updateSupplierMaster(SupplierMasterDTO suppliermasterDTO);

    
    

}

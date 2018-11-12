package com.sls.security.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sls.security.entity.ItemMaterialStock;

public interface ItemMaterialStockRepository extends JpaRepository<ItemMaterialStock, String> {

	
	List<ItemMaterialStock> findByItemId(String itemId);
	List<ItemMaterialStock> findByGroupId(String groupId);
	
	 @Query("SELECT t FROM ItemMaterialStock t where t.itemId = ?1 AND t.qualityCode = ?2 ")
	  public  List<ItemMaterialStock> findByItemIdAndQualityCode(String itemId,String qualityCode);

}

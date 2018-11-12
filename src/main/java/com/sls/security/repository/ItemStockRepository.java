package com.sls.security.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sls.security.entity.ItemStock;

public interface ItemStockRepository extends CrudRepository<ItemStock, String> {

	
	List<ItemStock> findByItemId(String itemId);
	List<ItemStock> findByGroupId(String groupId);
	
	
}

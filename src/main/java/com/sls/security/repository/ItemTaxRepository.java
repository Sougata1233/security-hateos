package com.sls.security.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sls.security.entity.ItemTax;

public interface ItemTaxRepository extends CrudRepository<ItemTax, String> {

	
	List<ItemTax> findByHsnCode(String hsnCode);

}

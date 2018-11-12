package com.sls.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.ItemGroup;

public interface ItemGroupRepository extends JpaRepository<ItemGroup, String> {


}

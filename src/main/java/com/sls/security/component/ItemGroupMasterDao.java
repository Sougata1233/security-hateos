package com.sls.security.component;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sls.security.entity.ItemGroupMaster;
import com.sls.security.repository.ItemGroupMasterRepository;


@Component
public class ItemGroupMasterDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemGroupMasterDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    ItemGroupMasterRepository itemgroupmasterRepository;

    @Transactional(readOnly = true)
    public List<ItemGroupMaster> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<ItemGroupMaster> itemgroupmasterList = new ArrayList<ItemGroupMaster>();
	for (ItemGroupMaster itemgroupmaster : itemgroupmasterRepository.findAll()) {
		itemgroupmasterList.add(itemgroupmaster);

	}
	return itemgroupmasterList;

    }

    

    @Transactional(readOnly = true)
    public ItemGroupMaster findItemGroupMasterById(String id) {
	/*for (ItemGroupMaster itemgroupmaster : itemgroupmasterRepository.findById(id)) {
	}*/
	return itemgroupmasterRepository.findById(id);
    }

    

    @Transactional(propagation = Propagation.REQUIRED)
    public void addItemGroupMaster(ItemGroupMaster itemgroupmaster) {
    	itemgroupmasterRepository.save(itemgroupmaster);
	LOGGER.info("Country added successfully " + itemgroupmaster.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteItemGroupMaster(String Id) {
    	itemgroupmasterRepository.delete(Id);
	LOGGER.info("Activity with id " + Id + " deleted successfully ");
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateItemGroupMaster(ItemGroupMaster itemgroupmaster) {
    	ItemGroupMaster group = itemgroupmasterRepository.findOne(itemgroupmaster.getId());
    	itemgroupmasterRepository.save(group);
	LOGGER.info("Activity added successfully " + itemgroupmaster.toString());
    }
    
    @Transactional
    public List<ItemGroupMaster> findItemGroupFiltered(){
    	return itemgroupmasterRepository.findByGroupIdFilter();
    }
    
    
}

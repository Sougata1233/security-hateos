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

import com.sls.security.entity.ItemMaster;
import com.sls.security.repository.ItemMasterRepository;


@Component
public class ItemMasterDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemMasterDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    ItemMasterRepository itemmasterRepository;

    @Transactional(readOnly = true)
    public List<ItemMaster> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<ItemMaster> itemmasterList = new ArrayList<ItemMaster>();
	for (ItemMaster itemmaster : itemmasterRepository.findAll()) {
		itemmasterList.add(itemmaster);

	}
	return itemmasterList;

    }

    

    @Transactional(readOnly = true)
    public ItemMaster findItemMasterById(String id) {
//	for (ItemMaster itemmaster : itemmasterRepository.findById(id)) {
//	}
	return itemmasterRepository.findById(id);
    }
    
    
    /*@Transactional(readOnly = true)
    public List<ItemMaster> findItemMasterByIdList(String id) {
	for (ItemMaster itemmaster : itemmasterRepository.findById(id)) {
	}
	return itemmasterRepository.findById(id);
    }*/

    

    @Transactional(propagation = Propagation.REQUIRED)
    public void addItemMaster(ItemMaster itemmaster) {
    	itemmasterRepository.save(itemmaster);
	LOGGER.info("ItemMaster added successfully " + itemmaster.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteItemMaster(String Id) {
    	itemmasterRepository.delete(Long.valueOf(Id));
//    	itemmasterRepository.deletes(Id);
	LOGGER.info("ItemMaster with id " + Id + " deleted successfully ");
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateItemMaster(ItemMaster itemmaster) {
    	ItemMaster item = itemmasterRepository.findOne(Long.valueOf(itemmaster.getId()));
    	itemmasterRepository.save(item);
	LOGGER.info("ItemMaster added successfully " + itemmaster.toString());
    }
    
    
    @Transactional(propagation = Propagation.REQUIRED)
    public List<ItemMaster> getItemMasterByGroupCode(String groupcode) {
    	return itemmasterRepository.findByGrpCode(groupcode);
    }
    
    public long seqNextVal() {
    	return itemmasterRepository.getNextSeriesId();
    }
    
    public ItemMaster save(ItemMaster itemmaster) {
    	return itemmasterRepository.save(itemmaster);
    }
    
}

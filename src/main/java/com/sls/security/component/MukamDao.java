package com.sls.security.component;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sls.security.entity.Mukam;
import com.sls.security.repository.MukamRepository;


@Component
public class MukamDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(MukamDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    MukamRepository mukamRepository;

    /*@Transactional(readOnly = true)
    public List<Mukam> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<Mukam> mukamList = new ArrayList<Mukam>();
	for (Mukam mukam : mukamRepository.findAll()) {
	    mukamList.add(mukam);

	}
	return mukamList;

    }*/
    
    @Transactional(readOnly = true)
    public List<Mukam> findAll() throws Exception {
	/*LOGGER.info("DATASOURCE = " + dataSource);
	List<Mukam> mukamList = new ArrayList<Mukam>();
	for (Mukam mukam : mukamRepository.findAll()) {
	    mukamList.add(mukam);

	}*/
	return (List<Mukam>) mukamRepository.findAll();

    }

    

    @Transactional(readOnly = true)
    public Mukam findMukamById(Long id) {
	for (Mukam mukam : mukamRepository.findById(id)) {
	}
	return mukamRepository.findById(id).get(0);
    }
    
    @Transactional(readOnly = true)
    public List<Mukam> findAllByMukamById(Long id) {
    	return mukamRepository.findById(id);
    }
    
    
    
    @Transactional(readOnly = true)
    public Mukam findAllByMukamByIdEntity(long id) {
    	return mukamRepository.findByIdEntity(id);
    }

    

    @Transactional(propagation = Propagation.REQUIRED)
    public void addMukam(Mukam mukam) {
    	mukamRepository.save(mukam);
	LOGGER.info("Mukam added successfully " + mukam.toString());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteMukam(Long userId) {
    	mukamRepository.delete(userId);
	LOGGER.info("Mukam with id " + userId + " deleted successfully ");
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateMukam(Mukam mukam) {
    	Mukam mukamEntity = mukamRepository.findOne(mukam.getId());
    	mukamRepository.save(mukamEntity);
	LOGGER.info("Mukam added successfully " + mukam.toString());
    }
    
    @Transactional
    public Mukam findByMukamName(String mukamname) {
    	return mukamRepository.findByMukamName(mukamname);
    }



    @Transactional
	public void save(Mukam mukamEntity) {
		mukamRepository.save(mukamEntity);
		
	}
    
    
}

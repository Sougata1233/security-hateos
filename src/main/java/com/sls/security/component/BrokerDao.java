package com.sls.security.component;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sls.security.entity.Broker;
import com.sls.security.repository.BrokerRepository;

@Component
public class BrokerDao {
	
	@Autowired
	BrokerRepository brokerRepository;
	
	@Transactional
	public Broker save(Broker broker) {
		return brokerRepository.save(broker);
	}
	
	@Transactional
	public List<Broker> getAllBroker(){
		return (List<Broker>) brokerRepository.findAll();
	}
	
	@Transactional
	public Broker getBrokerById(long id) {
		return brokerRepository.findOne(id);
	}
	
	@Transactional
	public void delete(long brokerId) {
		brokerRepository.delete(brokerId);
	}
	
	@Transactional
	public void update(Broker broker) {
		Broker broker1 = brokerRepository.findOne(broker.getBrokerId());
		broker1.setAddress(broker.getAddress());
		broker1.setBrokerId(broker.getBrokerId());
		broker1.setBrokerName(broker.getBrokerName());
		broker1.setEmail(broker.getEmail());
		broker1.setGst(broker.getGst());
		broker1.setPan(broker.getPan());
		brokerRepository.save(broker1);
	}
	
	@Transactional
	public List<Broker> getBrokerByBrokerName(String brokerName){
		return brokerRepository.findByBrokerName(brokerName);
	}

}

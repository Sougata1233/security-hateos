package com.sls.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sls.security.entity.Broker;

public interface BrokerRepository extends JpaRepository<Broker, Long> {
	
	List<Broker> findByBrokerName(String brokerName);

}

package com.olive.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Autowired
	JmsTemplate jt;
	
    @Value("${my.jms.desti-name}")   
	public String destination;
	
	public boolean send(String message) {
		 boolean send=false;
		try {
			jt.send(destination, 
		   (session)->session.createTextMessage(message));
			send=true;
		} catch (Exception e) {
			send=false;
			e.printStackTrace();
		}
		return send;
	}
}

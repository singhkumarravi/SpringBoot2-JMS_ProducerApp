package com.olive.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.olive.producer.service.ProducerService;
@Component
public class TestMessage {
	@Autowired
	private ProducerService service;
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendData() {
	  boolean send = service.send("Hellow ! Ravi Kumar Singh " + new Date());
	  if(send)
		  System.out.println("Producer Send Message !");
	  else
		  System.out.println("Producer Not Send Meaage !");
	}
}

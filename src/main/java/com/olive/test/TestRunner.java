//package com.olive.test;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.olive.producer.service.ProducerService;
//
//@Component
//public class TestRunner implements CommandLineRunner{
//	@Autowired
//	private ProducerService service;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		boolean send = service.send("Hellow !! " + new Date());
//		if(send) {
//			System.out.println("Producer Message Send !!! ");
//		}
//		else
//		{
//			System.out.println("Producer Message Not Send !!! ");	
//		}
//		
//	}
//
//}

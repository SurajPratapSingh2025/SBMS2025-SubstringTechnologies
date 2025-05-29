package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.service.CustomerServiceImpl;

@SpringBootApplication
public class SbJpa04Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbJpa04Application.class, args);
	}
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@Override
	public void run(String... args) throws Exception {
		
		customerServiceImpl.saveCustomer("cname", "error", "email");
		System.out.println("ok done");
	}

}

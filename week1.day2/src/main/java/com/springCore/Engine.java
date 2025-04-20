package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String companyName;
	
	@Autowired
	public Engine(@Qualifier("engineBean")String companyName) {
		this.companyName=companyName;
	}
	
	public Engine() {System.out.println("Engine default constructor: engine creating");}
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void start() {
		System.out.println(companyName+" Engine Starting");
		System.out.println("Engine Started\n");
	}
}
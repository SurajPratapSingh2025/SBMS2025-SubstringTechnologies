package com.springCore;

public class Engine {

	private String companyName;

	public Engine(String companyName) {
		this.companyName = companyName;
	}

	public Engine() {

	}
	
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void start() {
		System.out.println(companyName + " Engine Starting");
		System.out.println("Engine Started\n");
	}
}
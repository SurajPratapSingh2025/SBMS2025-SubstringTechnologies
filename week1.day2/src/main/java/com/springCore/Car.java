package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String name;
//	@Autowired
	private Engine engine;
	
	@Autowired
	public  Car(@Qualifier("carBean")String name,Engine engine) {
		this.name=name;
		this.engine=engine;
		System.out.println("Car constructor: car creating");
	}
	
	
	public Car() {System.out.println("Car default constructor: car creating");}
	
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public Engine getEngine() {return engine;}
	
//	@Autowired
	public void setEngine(Engine engine) {this.engine = engine;System.out.println("setting engine using setter");}

	public void start() {
		System.out.println(name+" Starting");
		engine.start();
	}
	
}
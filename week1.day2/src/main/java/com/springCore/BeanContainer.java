package com.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springCore")	//not used when config.xml available	//multiple package seprated by ,
public class BeanContainer {
	
	@Bean(name="carBean")
	public String carName() {return "Tata Safari";}
	
	@Bean(name="engineBean")
	public String engineName() {return "Ford";}
	
	
}

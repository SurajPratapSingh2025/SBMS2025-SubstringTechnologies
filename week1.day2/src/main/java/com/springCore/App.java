package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
//    	Engine engine1 = new Engine("Ford");
//    	
//        Car tataSafari=new Car("Safari",engine1);
//        tataSafari.start();
//        
//        Engine engine2 = new Engine("Tata");
//        Car naxon = new Car("Naxon",engine2);
//        naxon.start();
        
		@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanContainer.class);
		Car car=context.getBean("car",Car.class);
		car.start();
		
		Student student = context.getBean("student",Student.class);
		student.study();
		
    }
}
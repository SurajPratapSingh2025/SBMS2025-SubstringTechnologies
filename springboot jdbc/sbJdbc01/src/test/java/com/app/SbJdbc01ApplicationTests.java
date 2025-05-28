package com.app;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dao.UserService;
import com.app.entity.User;

@SpringBootTest
class SbJdbc01ApplicationTests {

    @Autowired
    private UserService userService;
    
    @Test
    void testUserCreation() {
    	
    	User user=new User();
    	user.setId(new Random().nextInt(1000));
    	user.setName("Gaurav");
    	user.setEmail("gaurav@gmail.com");
    	user.setPassword("gaurav@123");
    	user.setAddress("chennai");
    	user.setSalary(16700);
        
        int result = userService.saveUser(user);
        Assertions.assertEquals(1, result);
    }
}
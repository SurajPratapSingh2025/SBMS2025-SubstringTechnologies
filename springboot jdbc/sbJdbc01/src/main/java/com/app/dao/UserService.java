package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.app.entity.User;

@Service
public class UserService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
            + "id INT PRIMARY KEY, "
            + "name VARCHAR(100) NOT NULL, "
            + "email VARCHAR(100) UNIQUE, "
            + "password VARCHAR(100), "
            + "city VARCHAR(100), "
            + "salary DECIMAL(10,2))";
        
        jdbcTemplate.execute(createTableSQL);
        System.out.println("Users table created/verified");
    }
    
    public int saveUser(User user) {
        createTable(); 
        
        String insertSQL = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?)";
        
//        int rowsAffected = jdbcTemplate.update(insertSQL, 501, "john", "john@gmail.com", "john@123", "banglore", 12000.00);
        int rowsAffected = jdbcTemplate.update(insertSQL,user.getId(),user.getName(),user.getEmail(),user.getPassword(),user.getAddress(),user.getSalary());
        
        System.out.println("User added successfully. Rows affected: " + rowsAffected);
        return rowsAffected;
        
    }
}
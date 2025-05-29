package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Product;
import com.app.repository.ProductRepository;


@SpringBootApplication
public class SbJpa01Application implements CommandLineRunner {
    
    @Autowired
    private ProductRepository productRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(SbJpa01Application.class, args);
        System.out.println("..........hi........");
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setId(101);
        product.setTitle("Laptop");
        product.setPrice(50000);
        product.setDescription("Dell Inspiron");
        product.setLive(true);
        
        Product savedProduct = productRepository.save(product);
        System.out.println("Product saved with ID: " + savedProduct.getId());
    }
}
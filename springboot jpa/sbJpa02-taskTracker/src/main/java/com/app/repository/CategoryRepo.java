package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}

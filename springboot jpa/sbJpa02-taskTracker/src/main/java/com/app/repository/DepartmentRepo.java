package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer>{

}

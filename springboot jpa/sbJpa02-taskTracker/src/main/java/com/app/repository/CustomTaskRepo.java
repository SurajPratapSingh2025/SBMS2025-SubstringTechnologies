package com.app.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class CustomTaskRepo {
	
	@Autowired
	private EntityManager entityManager;
}

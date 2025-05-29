package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@Column(name="product_id")
	private int id;
	@Column(name="product_name",length=100,nullable=false,unique=true)
	private String title;
	@Column(length=5000)
	private String description;
	@Column(name="product_price")
	private double price;
	
	private boolean live=false;
	
	
}

package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="jpa_products")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="product.category",joinColumns=@JoinColumn(name="p_id"),inverseJoinColumns=@JoinColumn(name="c_id"))
	private List<Category> category=new ArrayList();
	
	
	private double price;
	
	private int discount;
	
	@Transient
	private int finalPrice;
	
	
	
	public void addCategory(Category category) {
		
		this.category.add(category);
		category.getProducts().add(this);
	}
	
	
	@PrePersist
	public void test() {
		
		System.out.println("hi, going to save entity");
		
		this.price=Math.floor(this.price);
	}
	
	
}

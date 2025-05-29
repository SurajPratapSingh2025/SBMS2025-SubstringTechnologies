package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="jpa_departments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departmentId;
	
	private String name;
	
	private String code;
	
//	@OneToMany
//	private List<Student> students=new ArrayList<>();
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Student> students=new ArrayList<>();
	
	
	
}

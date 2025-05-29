package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="jpa_students")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	@OneToOne(mappedBy="student")
	private Certificate certificate;
	
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	
	@Transient
	private String testing;
	
	
	
	
	
}

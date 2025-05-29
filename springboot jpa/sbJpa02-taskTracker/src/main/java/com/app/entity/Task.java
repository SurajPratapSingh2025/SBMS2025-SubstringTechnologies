package com.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="jpa_tasks")
@Getter
@Setter
@ToString 
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="task_name",length=100,nullable=false)
	private String title;
	@Column(name="task_description",length=5000)
	private String content;
	@Enumerated(EnumType.STRING)
	private TaskStatus status=TaskStatus.PENDING;
	
	private LocalDateTime createdAt=LocalDateTime.now();
	
	private LocalDateTime completedAt;
	
	
	

}

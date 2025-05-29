package com.app.service;

import java.time.LocalDateTime;
import java.util.List;

import com.app.entity.Task;
import com.app.entity.TaskStatus;
import com.app.repository.TaskRepository;

public class TaskService {
	
	private TaskRepository taskRepository;
	
	//save logic
	public Task saveTask(Task task) {
		
		task.setStatus(TaskStatus.COMPLETE);
		task.setCreatedAt(task.getCreatedAt().minusDays(4));
		
		//save
		Task savedTask=taskRepository.save(task);
		System.out.println("Task saved with ID: "+savedTask.getId());
		return savedTask;
	}
	
	//update logic
	
	
	//get all task
	public List<Task> getAll(){
		
		List<Task> tasks=taskRepository.findAll();
		return tasks;
	}
	
	
	//get task by id
	public Task getById(long id) {
		
		Task task=taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task not found with id: "+id));
		return task;
	}
	
	//delete task by id
	public void deleteById(long id) {
		
		Task task=taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task not found with id: "+id));
		taskRepository.delete(task);
	}
	
	//get all task by status
	public List<Task> getByStatus(TaskStatus status){
		
		
		List<Task> byStatus=taskRepository.findByStatus(status);
		return byStatus;
	}
	
	//get all task by date
	public List<Task> getByCreatedDate(LocalDateTime createdAt){
		
		
		List<Task> byCreatedAt=taskRepository.findByCreatedAt(createdAt);
		return byCreatedAt;
	}
	
	//get all task by date range
	public List<Task> getByCreatedDateBetween(LocalDateTime start,LocalDateTime end){
		
		List<Task> byCreatedAt=taskRepository.findByCreatedAtBetween(start,end);
		return byCreatedAt;
	}
	
	//search task
	public List<Task> searchByTitle(String titleKeyword){
		
		List<Task> tasks=taskRepository.findByTitleContainingIgnoreCase(titleKeyword);
		return tasks;
	}
	
	
	
	
	
	
	
}




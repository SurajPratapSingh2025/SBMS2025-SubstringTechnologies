package com.app.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Task;
import com.app.entity.TaskStatus;

public interface TaskRepository extends JpaRepository<Task,Integer>{
	
	//custom finder method
	Optional<Task> findById(long id);

	List<Task> findByStatus(TaskStatus status);

	List<Task> findByCreatedAt(LocalDateTime createdAt);

	List<Task> findByTitleContainingIgnoreCase(String titleKeyword);

	List<Task> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
	
	
	//query methods- custom query
	@Query("select t from task t")
	List<Task> getAllTask();
	
//	@Query("select t from task t where t.id=?1")
//	Task getById(long id);
	
//	@Query("select t from task t where t.id=:id")	//named parameter
//	Task getById(@Param("id")long id);
	
//	@Query("select t from task t where t.id=:id and t.status=:status")	//named parameter
//	Task getById(@Param("id")long id,@Param("status") TaskStatus status);
	
	@Query("select t from task t where t.id=?1 and t.status=?2")	
	Task getById(long id, TaskStatus status);
	
	@NativeQuery("select * from jpa_tasks")
	List<Task> getAllTask2();
	
	
	
	
	
	
	
	
	
	
}

package com.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Department;
import com.app.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class StudentDao {

    private final TaskRepository taskRepository;
	
	@Autowired
	private EntityManager entityManager;

    StudentDao(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
	
	public void getStudent() {
		
		System.out.println("getting student");
		
		//get criteria builder
		CriteriaBuilder criteriaBuilder=entityManager.getCriteriaBuilder();
		//get criteria query
		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
		//defining root
		Root<Student> root = criteriaQuery.from(Student.class);
		//builder condition using predicate
		Predicate predicate = criteriaBuilder.equal(root.get("name"), "sarthak");
		Predicate predicate1 = criteriaBuilder.equal(root.get("email"), "sarthak@gmail.com");
		Predicate predicate2 = criteriaBuilder.equal(root.get("id"), 3);
		
		Predicate joinPredicate = criteriaBuilder.and(predicate1,predicate,predicate2);
		//build
//		criteriaQuery.select(root).where(predicate);
		criteriaQuery.select(root).where(joinPredicate);
		
		List<Student> resultList=entityManager.createQuery(criteriaQuery).getResultList();
		
//		System.out.println(resultList);
		resultList.forEach(student->System.out.println(student.getName()));
		
		
		
	}
	
	public void getJoinedDate() {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
		Root<Student> studentRoot = query.from(Student.class);
		studentRoot.join("department");
		
		
		
		query.select(studentRoot);
		List<Student> resultList = entityManager.createQuery(query).getResultList();
		
		resultList.forEach(student->System.out.println(student.getName()+" : "+student.getDepartment().getStudents()));
	}
	
	
	
	
}

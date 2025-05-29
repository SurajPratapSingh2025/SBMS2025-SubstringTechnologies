package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.repository.CategoryRepo;
import com.app.repository.CertificateRepo;
import com.app.repository.DepartmentRepo;
import com.app.repository.ProductRepo;
import com.app.repository.StudentDao;
import com.app.repository.StudentRepo;

@SpringBootApplication
public class SbJpa02Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbJpa02Application.class, args);
		System.out.println("..............hi..................");
	}
	
	
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CertificateRepo certificateRepo;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CategoryRepo categoryRepo;
	
	//Criteria api
	@Autowired
	private StudentDao studentDao;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		studentDao.getStudent();
		studentDao.getJoinedDate();
		
		
//		Student student=new Student();
//		student.setEmail("sarthak@gmail.com");
//		student.setName("Sarthak");
//		
//		
//		Certificate certificate=new Certificate();
//		certificate.setTitle("Java Certificate");
//		certificate.setDescription("This is java certification");
//		certificate.setIssuedAt(LocalDate.now());
//		
//		
//		Student savedStudent = studentRepo.save(student);
//		System.out.println("student saved success");
//		
//		
//		savedStudent.setCertificate(certificate);		
//		certificate.setStudent(savedStudent);
//		
//		certificateRepo.save(certificate);
//		System.out.println("certificate also saved");
		
		
		//------------get data--------------------
//		Student student=studentRepo.findById(3).get();
//		System.out.println(student.getName());
//		
//		Certificate certificate=student.getCertificate();
//		System.out.println(certificate.getTitle());
		
		
//		Certificate certificate=certificateRepo.findById(1).get();
//		System.out.println(certificate.getTitle());
//		
//		Student student=certificate.getStudent();
//		System.out.println(student.getName());
		
		
		
		
		
//		Department department =new Department();
//		department.setName("CSE");
//		department.setCode("CS101");
//		
//		
//		Student student1=new Student();
//		student1.setName("Sahil");
//		student1.setEmail("sahil@gmail.com");
//		student1.setDepartment(department);
//		
//		Student student2=new Student();
//		student2.setName("Sarthak");
//		student2.setEmail("sarthak@gmail.com");
//		student2.setDepartment(department);
//		
////		department.getStudents().add(student1);
////		department.getStudents().add(student2);
//		List<Student> studentList=new ArrayList<>();
//		studentList.add(student1);
//		studentList.add(student2);
//		department.setStudents(studentList);
//		
//		
//		departmentRepo.save(department);
		
		
		
		//many to many
//		Category category1=new Category();
//		category1.setTitle("Treading");
//		Category category2=new Category();
//		category2.setTitle("Mobile Phones");
//		
//		Product product1=new Product();
//		product1.setName("Iphone 13");
//		
//		Product product2=new Product();
//		product2.setName("Asus ROG 123");
//		
//		//mapping
////		product1.getCategory().add(category1);
////		category1.getProducts().add(product1);
//		
//		product1.addCategory(category1);
//		product1.addCategory(category2);
//		product2.addCategory(category1);
//		
////		product1.getCategory().add(category2);
////		category2.getProducts().add(product1);
//		
////		product2.getCategory().add(category1);
////		category1.getProducts().add(product2);
//		
//		//save
//		productRepo.save(product1);
//		productRepo.save(product2);
		
		
		
		
		
		
		
		
	}

}



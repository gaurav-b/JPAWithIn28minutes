package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

// when we have to execute/run something in the start of the spring application
// we can use CommandLineRunner
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	CourseJdbcRepository repository;
	
//	@Autowired
//	CourseJpaRepository repository;
	
	@Autowired
	CourseSpringDataJpaRepository repository;
	
	/**
	 *  following method works Jdbc or Jpa repository only 
	 */
//	@Override
//	public void run(String... args) throws Exception {
//		
//		repository.insert(new Course(1,"Learn AWS JPA", "in28minutes"));
//		repository.insert(new Course(2,"Learn Java", "in28minutes"));
//		repository.insert(new Course(3,"Learn Spring Boot", "in28minutes"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.findById(2));
//	}
	
	/**
	 *  following method uses the Spring Data JPA methods only 
	 */
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Learn AWS JPA", "in28minutes"));
		repository.save(new Course(2,"Learn Java", "in28minutes"));
		repository.save(new Course(3,"Learn Spring Boot", "in28minutes"));
		
		repository.deleteById(1L);
		
		System.out.println(repository.findById(2L));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor("wrong author"));
		
		System.out.println(repository.findByName("Learn Java"));
		System.out.println(repository.findByName("Learn AWS JPA"));
	}
}

package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

// when we have to execute/run something in the start of the spring application
// we can use CommandLineRunner
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	CourseJdbcRepository courseJdbcRepository;
	
	@Autowired
	CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1,"Learn AWS JPA", "in28minutes"));
		repository.insert(new Course(2,"Learn Java", "in28minutes"));
		repository.insert(new Course(3,"Learn Spring Boot", "in28minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}
}

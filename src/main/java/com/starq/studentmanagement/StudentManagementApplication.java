package com.starq.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.starq.studentmanagement.entity.Student;
import com.starq.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("Peter", "Parker", "peterparker@marvel.com");
		// studentRepository.save(student1);

		// Student student2 = new Student("Clark", "Kent", "clarkkent@dc.com");
		// studentRepository.save(student2);


		// Student student3 = new Student("Stephen", "Strange", "stephenstrange@marvel.com");
		// studentRepository.save(student3);
	}
}

package com.starq.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.starq.studentmanagement.entity.Student;
//no need to add @Repository annotation because JpaRepository already implicitly supports it

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
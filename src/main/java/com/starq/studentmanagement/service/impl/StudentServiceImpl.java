package com.starq.studentmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.starq.studentmanagement.entity.Student;
import com.starq.studentmanagement.service.StudentService;
import com.starq.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
   
    private StudentRepository studentRepository;

    //constructor dependency  injection
    public StudentServiceImpl(StudentRepository studentRepository){
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
            
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
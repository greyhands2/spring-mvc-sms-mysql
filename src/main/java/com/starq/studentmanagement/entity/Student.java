package com.starq.studentmanagement.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends Object {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    //default  constructor
    public Student(){}

    //parameterized constructor
    public Student(String firstName, String lastName, String email){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }    


    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }    


    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }    
}
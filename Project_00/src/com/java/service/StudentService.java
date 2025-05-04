package com.java.service;

import com.java.model.Student;

public class StudentService {
    public void displayInformation(Student student) {
        System.out.println("----- Student Information -----");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("ID: " + student.getId());
    }
}
package com.java;

import com.java.model.Student;
import com.java.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Welcome to My Student App -----");

        System.out.print("Enter Student name: ");
        String name = scanner.next();

        System.out.print("Enter Student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Student id: ");
        int id = scanner.nextInt();

        try {
            Student student = new Student(name, age, id);
            StudentService studentService = new StudentService();
            studentService.displayInformation(student);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
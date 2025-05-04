package com.java.model;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        setName(name);
        setAge(age);
        setId(id);
    }

    public void setName(String name) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must only contain letters.");
        }
        if (name.length() < 3 || name.length() > 10) {
            throw new IllegalArgumentException("Name length must be between 3 and 10.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 6 || age > 30) {
            throw new IllegalArgumentException("Age must be between 6 and 30.");
        }
        this.age = age;
    }

    public void setId(int id) {
        if (id < 1000 || id > 100000) {
            throw new IllegalArgumentException("ID must be between 1000 and 100000.");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
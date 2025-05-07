package com.java.model;

import com.java.service.Printing;

public class Player {
    private int number;
    private String name;

    public Player(int number, String name) {
        setNumber(number);
        setName(name);
    }

    public void setNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        this.number = number;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (name.length() <= 5) {
            throw new IllegalArgumentException("Name must be greater than 5 characters");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must contain only letters");
        }
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        Printing.print(this);
    }
}
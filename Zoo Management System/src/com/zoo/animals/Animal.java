package com.zoo.animals;

/**
 * Base class representing a generic animal.
 */
public abstract class Animal {
    private String name;
    private int age;
    private String habitat;
    private boolean isEndangered;

    public Animal(String name, int age, String habitat, boolean isEndangered) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public abstract void makeSound();

    public abstract void feed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                ", isEndangered=" + isEndangered +
                '}';
    }
}
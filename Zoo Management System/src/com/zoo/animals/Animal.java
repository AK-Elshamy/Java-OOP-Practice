package com.zoo.animals;

/**
 * Represents a generic animal in the zoo.
 * This is an abstract class that defines shared properties and behaviors
 * for all animal types.
 */
public abstract class Animal {
    private String name;
    private int age;
    private String habitat;
    private boolean isEndangered;

    /**
     * Constructor to initialize an animal object.
     *
     * @param name         The name of the animal.
     * @param age          The age of the animal.
     * @param habitat      The habitat where the animal lives.
     * @param isEndangered Whether the animal is endangered.
     */
    public Animal(String name, int age, String habitat, boolean isEndangered) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void makeSound();

    public abstract void feed();
}
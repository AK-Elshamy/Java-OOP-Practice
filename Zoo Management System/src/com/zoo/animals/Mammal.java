package com.zoo.animals;

/**
 * Represents a mammal, which is a subclass of Animal.
 * Mammals have specific traits such as having fur and a gestation period.
 */
public class Mammal extends Animal {

    private boolean hasFur;
    private int gestationPeriod;

    /**
     * Constructor to initialize a Mammal object.
     * 
     * @param name            The name of the mammal.
     * @param age             The age of the mammal.
     * @param habitat         The habitat where the mammal lives.
     * @param isEndangered    Whether the mammal is endangered.
     * @param hasFur          Whether the mammal has fur.
     * @param gestationPeriod The gestation period of the mammal (in days).
     */
    public Mammal(String name, int age, String habitat, boolean isEndangered, boolean hasFur, int gestationPeriod) {
        super(name, age, habitat, isEndangered);
        this.hasFur = hasFur;
        this.gestationPeriod = gestationPeriod;
    }

    // Getters and Setters
    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    // Implement abstract methods from Animal
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound!");
    }

    @Override
    public void feed() {
        System.out.println("Mammal is being fed!");
    }

    // Additional methods
    public void walk() {
        System.out.println("Mammal is walking.");
    }

    public void run() {
        System.out.println("Mammal is running.");
    }
}
package com.zoo.animals;

/**
 * Represents a flying animal in the zoo.
 * Extends the Animal class to add properties and behaviors specific to flying
 * animals.
 */
public class FlyingAnimal extends Animal {
    private double wingSpan; // in meters
    private double flyingSpeed; // in km/h

    /**
     * Constructor to initialize a flying animal object.
     *
     * @param name         The name of the animal.
     * @param age          The age of the animal.
     * @param habitat      The habitat where the animal lives.
     * @param isEndangered Whether the animal is endangered.
     * @param wingSpan     The wingspan of the flying animal in meters.
     * @param flyingSpeed  The flying speed of the animal in km/h.
     */
    public FlyingAnimal(String name, int age, String habitat, boolean isEndangered, double wingSpan,
            double flyingSpeed) {
        super(name, age, habitat, isEndangered);
        this.wingSpan = wingSpan;
        this.flyingSpeed = flyingSpeed;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is making flying animal sounds.");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + ", a flying animal.");
    }

    @Override
    public String toString() {
        return super.toString() + ", FlyingAnimal{" +
                "wingSpan=" + wingSpan +
                ", flyingSpeed=" + flyingSpeed +
                '}';
    }
}

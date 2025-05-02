package com.zoo.animals;

/**
 * Represents a walking animal in the zoo.
 */
public class WalkingAnimal extends Animal {
    private int numberOfLegs;

    /**
     * Constructor to initialize a walking animal object.
     *
     * @param name         The name of the animal.
     * @param age          The age of the animal.
     * @param habitat      The habitat where the animal lives.
     * @param isEndangered Whether the animal is endangered.
     * @param numberOfLegs The number of legs the animal has.
     */
    public WalkingAnimal(String name, int age, String habitat, boolean isEndangered, int numberOfLegs) {
        super(name, age, habitat, isEndangered);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * Simulates the walking behavior of the animal.
     */
    public void walk() {
        System.out.println(getName() + " is walking on " + numberOfLegs + " legs.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is making walking animal sounds.");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + " the walking animal.");
    }

    @Override
    public String toString() {
        return super.toString() + ", WalkingAnimal{" +
                "numberOfLegs=" + numberOfLegs +
                '}';
    }
}

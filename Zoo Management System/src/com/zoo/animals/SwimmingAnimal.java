package com.zoo.animals;

/**
 * Represents an animal that has the ability to swim.
 * This class extends the Animal class and adds specific properties and
 * behaviors
 * related to swimming animals.
 */
public class SwimmingAnimal extends Animal {

    private double swimSpeed; // Speed in meters per second
    private boolean isFreshwater; // True if the animal lives in freshwater

    /**
     * Constructor to initialize a SwimmingAnimal object.
     *
     * @param name         The name of the animal.
     * @param age          The age of the animal.
     * @param habitat      The habitat where the animal lives.
     * @param isEndangered Whether the animal is endangered.
     * @param swimSpeed    The swimming speed of the animal in meters per second.
     * @param isFreshwater Whether the animal lives in freshwater.
     */
    public SwimmingAnimal(String name, int age, String habitat, boolean isEndangered, double swimSpeed,
            boolean isFreshwater) {
        super(name, age, habitat, isEndangered);
        this.swimSpeed = swimSpeed;
        this.isFreshwater = isFreshwater;
    }

    // Getters and Setters
    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean isFreshwater() {
        return isFreshwater;
    }

    public void setFreshwater(boolean isFreshwater) {
        this.isFreshwater = isFreshwater;
    }

    // Behaviors
    /**
     * Represents the animal diving underwater.
     */
    public void dive() {
        System.out.println(getName() + " is diving underwater.");
    }

    /**
     * Represents the animal swimming.
     */
    public void swim() {
        System.out.println(getName() + " is swimming at a speed of " + swimSpeed + " m/s.");
    }

    /**
     * Represents the animal floating on water.
     */
    public void floatOnWater() {
        System.out.println(getName() + " is floating on water.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is making a swimming-related sound.");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is being fed underwater.");
    }
}
package com.zoo.animals;

/**
 * Represents a fish in the zoo.
 * A subclass of SwimmingAnimal with additional attributes specific to fish.
 */
public class Fish extends SwimmingAnimal {
    private String scaleColor; // Color of the fish's scales
    private String species; // Species of the fish

    /**
     * Constructor to initialize a fish object.
     *
     * @param name         The name of the fish.
     * @param age          The age of the fish.
     * @param habitat      The habitat where the fish lives.
     * @param isEndangered Whether the fish is endangered.
     * @param swimSpeed    The swimming speed of the fish in meters per second.
     * @param isFreshwater Whether the fish lives in freshwater.
     * @param scaleColor   The color of the fish's scales.
     * @param species      The species of the fish.
     */
    public Fish(String name, int age, String habitat, boolean isEndangered, double swimSpeed, boolean isFreshwater,
            String scaleColor, String species) {
        super(name, age, habitat, isEndangered, swimSpeed, isFreshwater);
        this.scaleColor = scaleColor;
        this.species = species;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        // Fish typically don't make sounds, but you could simulate bubbling or similar
        System.out.println(getName() + " the " + species + " makes bubbling sounds.");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + ", a " + species + " fish.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Fish{" +
                "scaleColor='" + scaleColor + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
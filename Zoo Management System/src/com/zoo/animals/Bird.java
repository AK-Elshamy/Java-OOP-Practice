package com.zoo.animals;

/**
 * Represents a bird in the zoo.
 * A subclass of FlyingAnimal with additional attributes specific to birds.
 */
public class Bird extends FlyingAnimal {
    private String species;
    private String featherColor;

    /**
     * Constructor to initialize a bird object.
     *
     * @param name         The name of the bird.
     * @param age          The age of the bird.
     * @param habitat      The habitat where the bird lives.
     * @param isEndangered Whether the bird is endangered.
     * @param wingSpan     The wingspan of the bird in meters.
     * @param flyingSpeed  The flying speed of the bird in km/h.
     * @param species      The species of the bird.
     * @param featherColor The color of the bird's feathers.
     */
    public Bird(String name, int age, String habitat, boolean isEndangered, double wingSpan, double flyingSpeed,
            String species, String featherColor) {
        super(name, age, habitat, isEndangered, wingSpan, flyingSpeed);
        this.species = species;
        this.featherColor = featherColor;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the " + species + " is singing.");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + ", a " + species + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Bird{" +
                "species='" + species + '\'' +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }
}
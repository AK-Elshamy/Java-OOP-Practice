package com.zoo.habitats;

import com.zoo.animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an abstract habitat in the zoo.
 * Defines the common properties and behaviors of habitats.
 */
public abstract class Habitat {
    private String name;
    private double area; // in square meters
    private String climate;
    private List<Animal> animals;

    /**
     * Constructor to initialize a habitat.
     * 
     * @param name    The name of the habitat.
     * @param area    The total area of the habitat in square meters.
     * @param climate The climate of the habitat.
     */
    public Habitat(String name, double area, String climate) {
        this.name = name;
        this.area = area;
        this.climate = climate;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getClimate() {
        return climate;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Add an animal to the habitat.
     * 
     * @param animal The animal to add.
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Remove an animal from the habitat.
     * 
     * @param animal The animal to remove.
     * @return true if removed, false if not found.
     */
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", climate='" + climate + '\'' +
                ", animalsCount=" + animals.size() +
                '}';
    }

    // Abstract method for habitat-specific description
    public abstract String getDescription();
}
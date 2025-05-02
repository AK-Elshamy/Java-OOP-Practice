package com.zoo.management;

import com.zoo.animals.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Manages collection of animals in the zoo.
 * Provides methods to add, remove, find and list animals.
 */
public class AnimalManager {
    private List<Animal> animals;

    /**
     * Constructor initializes empty animal list.
     */
    public AnimalManager() {
        this.animals = new ArrayList<>();
    }

    /**
     * Adds an animal to the zoo.
     * 
     * @param animal The animal to add.
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Removes an animal from the zoo.
     * 
     * @param animal The animal to remove.
     * @return true if removed successfully, false otherwise.
     */
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    /**
     * Finds an animal by name.
     * 
     * @param name The name of the animal to find.
     * @return Optional containing the animal if found, empty otherwise.
     */
    public Optional<Animal> findAnimalByName(String name) {
        return animals.stream()
                .filter(a -> a.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    /**
     * Returns list of all animals.
     * 
     * @return List of animals.
     */
    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals);
    }

    /**
     * Returns the number of animals managed.
     * 
     * @return animal count
     */
    public int getAnimalCount() {
        return animals.size();
    }
}
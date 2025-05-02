package com.zoo.management;

import com.zoo.habitats.Habitat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Manages habitats within the zoo.
 * Provides management operations like adding, removing, and searching habitats.
 */
public class HabitatManager {
    private List<Habitat> habitats;

    /**
     * Constructor initializes empty habitat list.
     */
    public HabitatManager() {
        this.habitats = new ArrayList<>();
    }

    /**
     * Adds a habitat to the zoo.
     * 
     * @param habitat The habitat to add.
     */
    public void addHabitat(Habitat habitat) {
        habitats.add(habitat);
    }

    /**
     * Removes a habitat from the zoo.
     * 
     * @param habitat The habitat to remove.
     * @return true if removed successfully, false otherwise.
     */
    public boolean removeHabitat(Habitat habitat) {
        return habitats.remove(habitat);
    }

    /**
     * Finds a habitat by name.
     * 
     * @param name The name of the habitat to find.
     * @return Optional containing the habitat if found, empty otherwise.
     */
    public Optional<Habitat> findHabitatByName(String name) {
        return habitats.stream()
                .filter(h -> h.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    /**
     * Returns list of all habitats.
     * 
     * @return List of habitats.
     */
    public List<Habitat> getAllHabitats() {
        return new ArrayList<>(habitats);
    }

    /**
     * Returns the number of habitats managed.
     * 
     * @return habitat count.
     */
    public int getHabitatCount() {
        return habitats.size();
    }
}
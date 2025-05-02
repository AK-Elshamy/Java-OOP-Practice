package com.zoo;

import com.zoo.animals.*;
import com.zoo.habitats.*;
import com.zoo.management.*;
import com.zoo.models.*;
import com.zoo.reports.*;
import com.zoo.utils.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Entry point for the Zoo Management System application.
 */
public class Main {

    public static void main(String[] args) {
        // Create managers
        AnimalManager animalManager = new AnimalManager();
        HabitatManager habitatManager = new HabitatManager();
        ZooKeeperManager zooKeeperManager = new ZooKeeperManager();

        // Create utility objects
        InputHandler inputHandler = new InputHandler();

        // Create some habitats
        Forest amazonForest = new Forest("Amazon Rainforest", 50000, "Tropical", 10000);
        Ocean pacificOcean = new Ocean("Pacific Ocean", 1000000, "Marine", 35.0);
        Desert saharaDesert = new Desert("Sahara Desert", 300000, "Arid", 45.0);

        habitatManager.addHabitat(amazonForest);
        habitatManager.addHabitat(pacificOcean);
        habitatManager.addHabitat(saharaDesert);

        // Create some animals
        WalkingAnimal elephant = new WalkingAnimal("Elephant", 25, "Amazon Rainforest", true, 4);
        FlyingAnimal eagle = new FlyingAnimal("Eagle", 5, "Mountains", false, 2.0, 50);
        Fish clownfish = new Fish("Clownfish", 2, "Pacific Ocean", false, 1.2, true, "Orange and white", "Clownfish");

        // Add animals to the animals manager
        animalManager.addAnimal(elephant);
        animalManager.addAnimal(eagle);
        animalManager.addAnimal(clownfish);

        // Add animals to habitats
        amazonForest.addAnimal(elephant);
        pacificOcean.addAnimal(clownfish);
        // eagle not added to specific habitat here for demonstration

        // Create a zoo keeper
        ZooKeeper keeperJohn = new ZooKeeper(1, "John Doe", "Amazon Rainforest");
        zooKeeperManager.addZooKeeper(keeperJohn);

        // Create schedule for the keeper
        Schedule morningFeeding = new Schedule(1, "Morning Feeding of Amazon Animals",
                LocalDateTime.of(2024, 6, 1, 9, 0),
                LocalDateTime.of(2024, 6, 1, 10, 0));

        // Display some info
        System.out.println("Welcome to the Zoo Management System");

        // Display all animals
        System.out.println("\nAnimals in the zoo:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal);
        }

        // Display all habitats
        System.out.println("\nHabitats in the zoo:");
        for (Habitat habitat : habitatManager.getAllHabitats()) {
            System.out.println(habitat);
        }

        // Display zoo keepers
        System.out.println("\nZoo Keepers:");
        for (ZooKeeper keeper : zooKeeperManager.getAllZooKeepers()) {
            System.out.println(keeper);
        }

        // Generate reports
        AnimalReport animalReport = new AnimalReport();
        HabitatReport habitatReport = new HabitatReport();

        System.out.println("\nGenerating Animal Details Report:");
        animalReport.generateAnimalDetailsReport(animalManager.getAllAnimals());

        System.out.println("\nGenerating Habitat Summary Report:");
        habitatReport.generateHabitatSummaryReport(habitatManager.getAllHabitats());

        // Demonstrate animal behaviors
        System.out.println("\nAnimal Behaviors:");
        elephant.walk();
        eagle.makeSound();
        clownfish.dive();

        // Close input handler scanner if used (not used interactively here)
        inputHandler.close();

        System.out.println("\nZoo Management System demo complete.");
    }
}
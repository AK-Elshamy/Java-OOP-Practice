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
        System.out.println("🐾 Welcome to the Zoo Management System!");

        // Initialize Managers
        AnimalManager animalManager = new AnimalManager();
        HabitatManager habitatManager = new HabitatManager();
        ZooKeeperManager zooKeeperManager = new ZooKeeperManager();

        // Initialize Utilities
        InputHandler inputHandler = new InputHandler();

        // Create Habitats
        Forest amazonForest = new Forest("Amazon Rainforest", 50000, "Tropical", 12000);
        Ocean pacificOcean = new Ocean("Pacific Ocean", 1000000, "Marine", 35.0);
        Desert saharaDesert = new Desert("Sahara Desert", 300000, "Arid", 45.0);

        habitatManager.addHabitat(amazonForest);
        habitatManager.addHabitat(pacificOcean);
        habitatManager.addHabitat(saharaDesert);

        // Create Animals
        WalkingAnimal elephant = new WalkingAnimal("Elephant", 25, "Amazon Rainforest", true, 4);
        WalkingAnimal lion = new WalkingAnimal("Lion", 8, "Savannah", true, 4);
        FlyingAnimal eagle = new FlyingAnimal("Eagle", 5, "Mountains", false, 2.1, 60);
        Bird parrot = new Bird("Polly", 3, "Amazon Rainforest", false, 0.5, 15, "Macaw", "Red and Blue");
        Fish clownfish = new Fish("Nemo", 2, "Pacific Ocean", false, 1.2, true, "Orange and White", "Clownfish");
        Fish shark = new Fish("Great White Shark", 15, "Pacific Ocean", false, 2.3, false, "Grey", "Shark");

        // Add animals to AnimalManager
        animalManager.addAnimal(elephant);
        animalManager.addAnimal(lion);
        animalManager.addAnimal(eagle);
        animalManager.addAnimal(parrot);
        animalManager.addAnimal(clownfish);
        animalManager.addAnimal(shark);

        // Assign animals to habitats
        amazonForest.addAnimal(elephant);
        amazonForest.addAnimal(parrot);
        pacificOcean.addAnimal(clownfish);
        pacificOcean.addAnimal(shark);
        saharaDesert.addAnimal(lion); // assume lion lives in desert for demo

        // Create Zoo Keepers
        ZooKeeper keeperJohn = new ZooKeeper(1, "John Doe", "Amazon Rainforest");
        ZooKeeper keeperSarah = new ZooKeeper(2, "Sarah Lee", "Pacific Ocean");
        ZooKeeper keeperMike = new ZooKeeper(3, "Mike Brown", "Sahara Desert");

        zooKeeperManager.addZooKeeper(keeperJohn);
        zooKeeperManager.addZooKeeper(keeperSarah);
        zooKeeperManager.addZooKeeper(keeperMike);

        // Create Visitors (example usage)
        Visitor visitorAlice = new Visitor(101, "Alice Johnson", "555-1234");
        Visitor visitorBob = new Visitor(102, "Bob Smith", "555-5678");

        // Create Schedules
        Schedule feedingAmazon = new Schedule(1, "Morning Feeding at Amazon",
                LocalDateTime.now().withHour(9).withMinute(0), LocalDateTime.now().withHour(10).withMinute(0));
        Schedule cleaningPacific = new Schedule(2, "Cleaning and Maintenance at Pacific Ocean",
                LocalDateTime.now().withHour(11).withMinute(0), LocalDateTime.now().withHour(12).withMinute(0));

        // Display overview of animals
        System.out.println("\n🐅 Animals in the Zoo:");
        for (Animal a : animalManager.getAllAnimals()) {
            System.out.println(a);
        }

        // Display overview of habitats
        System.out.println("\n🌍 Habitats in the Zoo:");
        for (Habitat h : habitatManager.getAllHabitats()) {
            System.out.println(h);
            System.out.println("Animals here:");
            for (Animal ah : h.getAnimals()) {
                System.out.println("  - " + ah.getName());
            }
        }

        // Display zoo keepers
        System.out.println("\n🧑‍🌾 Zoo Keepers:");
        for (ZooKeeper zk : zooKeeperManager.getAllZooKeepers()) {
            System.out.println(zk);
        }

        // Display visitors info
        System.out.println("\n🎟️ Visitors:");
        System.out.println(visitorAlice);
        System.out.println(visitorBob);

        // Generate reports
        AnimalReport animalReport = new AnimalReport();
        HabitatReport habitatReport = new HabitatReport();

        System.out.println("\n📋 Animal Details Report:");
        animalReport.generateAnimalDetailsReport(animalManager.getAllAnimals());

        System.out.println("\n📋 Habitat Details Report:");
        habitatReport.generateHabitatDetailsReport(habitatManager.getAllHabitats());

        // Demonstrate animal behaviors
        System.out.println("\n🐾 Animal Behaviors:");
        elephant.walk();
        lion.walk();
        eagle.makeSound();
        eagle.feed();
        parrot.makeSound();
        clownfish.dive();
        clownfish.swim();
        clownfish.floatOnWater();
        shark.swim();

        // Close the input handler (if used in real input scenarios)
        inputHandler.close();

        System.out.println("\n🎉 Zoo Management System demonstration complete. Enjoy your visit!");
    }
}
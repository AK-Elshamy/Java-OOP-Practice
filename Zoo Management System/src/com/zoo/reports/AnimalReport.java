package com.zoo.reports;

import com.zoo.animals.Animal;
import java.util.List;

/**
 * Generates reports related to animals in the zoo.
 */
public class AnimalReport extends ReportGenerator {

    /**
     * Generates a detailed report of all animals.
     *
     * @param animals List of animals to include.
     */
    public void generateAnimalDetailsReport(List<Animal> animals) {
        System.out.println("Animal Details Report");
        System.out.println("=====================");
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Endangered: " + (animal.isEndangered() ? "Yes" : "No"));
            System.out.println("------------------------------");
        }
    }

    /**
     * Generates a summary report including the count of animals.
     *
     * @param animals List of animals to summarize.
     */
    public void generateAnimalSummaryReport(List<Animal> animals) {
        System.out.println("Total number of animals: " + animals.size());
    }
}
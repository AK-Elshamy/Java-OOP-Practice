package com.zoo.reports;

import com.zoo.habitats.Habitat;
import java.util.List;

/**
 * Generates reports related to habitats in the zoo.
 */
public class HabitatReport extends ReportGenerator {

    /**
     * Generates a detailed report of all habitats.
     *
     * @param habitats List of habitats to include.
     */
    public void generateHabitatDetailsReport(List<Habitat> habitats) {
        System.out.println("Habitat Details Report");
        System.out.println("=====================");
        for (Habitat habitat : habitats) {
            System.out.println("Name: " + habitat.getName());
            System.out.println("Area: " + habitat.getArea() + " sq.m");
            System.out.println("Climate: " + habitat.getClimate());
            System.out.println("Number of Animals: " + habitat.getAnimals().size());
            System.out.println("Description: " + habitat.getDescription());
            System.out.println("------------------------------");
        }
    }

    /**
     * Generates a summary report including the count of habitats.
     *
     * @param habitats List of habitats to summarize.
     */
    public void generateHabitatSummaryReport(List<Habitat> habitats) {
        System.out.println("Total number of habitats: " + habitats.size());
    }
}
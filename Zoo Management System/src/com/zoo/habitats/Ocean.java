package com.zoo.habitats;

/**
 * Represents an ocean habitat in the zoo.
 */
public class Ocean extends Habitat {
    private double salinity; // in PSU (Practical Salinity Units)

    /**
     * Constructor for Ocean habitat.
     *
     * @param name     The name of the ocean habitat.
     * @param area     The area of the ocean habitat.
     * @param climate  The climate of the ocean.
     * @param salinity The salinity of the ocean water.
     */
    public Ocean(String name, double area, String climate, double salinity) {
        super(name, area, climate);
        this.salinity = salinity;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    @Override
    public String getDescription() {
        return "Ocean habitat with salinity of " + salinity + " PSU.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Ocean{" +
                "salinity=" + salinity +
                '}';
    }
}
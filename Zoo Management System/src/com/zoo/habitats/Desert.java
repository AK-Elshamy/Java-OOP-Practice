package com.zoo.habitats;

/**
 * Represents a desert habitat in the zoo.
 */
public class Desert extends Habitat {
    private double averageTemperature; // in Celsius

    /**
     * Constructor for Desert habitat.
     *
     * @param name               The name of the desert habitat.
     * @param area               The area of the desert habitat.
     * @param climate            The climate of the desert.
     * @param averageTemperature The average temperature in Celsius.
     */
    public Desert(String name, double area, String climate, double averageTemperature) {
        super(name, area, climate);
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String getDescription() {
        return "Desert habitat with average temperature of " + averageTemperature + "°C.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Desert{" +
                "averageTemperature=" + averageTemperature +
                '}';
    }
}
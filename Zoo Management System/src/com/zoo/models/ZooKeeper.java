package com.zoo.models;

/**
 * Represents a zoo keeper responsible for animals and habitats.
 */
public class ZooKeeper {
    private String name;
    private int id;
    private String assignedHabitat;

    /**
     * Constructor to initialize a ZooKeeper.
     *
     * @param id              The unique ID of the zoo keeper.
     * @param name            The name of the zoo keeper.
     * @param assignedHabitat The habitat assigned to the zoo keeper.
     */
    public ZooKeeper(int id, String name, String assignedHabitat) {
        this.id = id;
        this.name = name;
        this.assignedHabitat = assignedHabitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignedHabitat() {
        return assignedHabitat;
    }

    public void setAssignedHabitat(String assignedHabitat) {
        this.assignedHabitat = assignedHabitat;
    }

    @Override
    public String toString() {
        return "ZooKeeper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignedHabitat='" + assignedHabitat + '\'' +
                '}';
    }
}
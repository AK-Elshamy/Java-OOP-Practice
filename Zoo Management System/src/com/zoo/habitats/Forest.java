package com.zoo.habitats;

/**
 * Represents a forest habitat in the zoo.
 */
public class Forest extends Habitat {
    private int treeCount;

    /**
     * Constructor for Forest habitat.
     *
     * @param name      The name of the forest habitat.
     * @param area      The area of the forest habitat.
     * @param climate   The climate of the forest.
     * @param treeCount The number of trees in the forest.
     */
    public Forest(String name, double area, String climate, int treeCount) {
        super(name, area, climate);
        this.treeCount = treeCount;
    }

    public int getTreeCount() {
        return treeCount;
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }

    @Override
    public String getDescription() {
        return "Forest habitat with " + treeCount + " trees.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Forest{" +
                "treeCount=" + treeCount +
                '}';
    }
}
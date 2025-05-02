package com.zoo.management;

import com.zoo.models.ZooKeeper;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Manages zoo keepers within the zoo.
 * Provides management operations like adding, removing, and finding zoo
 * keepers.
 */
public class ZooKeeperManager {
    private List<ZooKeeper> zooKeepers;

    /**
     * Constructor initializes empty zoo keeper list.
     */
    public ZooKeeperManager() {
        this.zooKeepers = new ArrayList<>();
    }

    /**
     * Adds a zoo keeper.
     * 
     * @param zooKeeper The zoo keeper to add.
     */
    public void addZooKeeper(ZooKeeper zooKeeper) {
        zooKeepers.add(zooKeeper);
    }

    /**
     * Removes a zoo keeper.
     * 
     * @param zooKeeper The zoo keeper to remove.
     * @return true if removed successfully, false otherwise.
     */
    public boolean removeZooKeeper(ZooKeeper zooKeeper) {
        return zooKeepers.remove(zooKeeper);
    }

    /**
     * Finds zoo keeper by name.
     * 
     * @param name The name to search.
     * @return Optional containing the zoo keeper if found, empty otherwise.
     */
    public Optional<ZooKeeper> findZooKeeperByName(String name) {
        return zooKeepers.stream()
                .filter(z -> z.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    /**
     * Returns list of all zoo keepers.
     * 
     * @return list of zoo keepers.
     */
    public List<ZooKeeper> getAllZooKeepers() {
        return new ArrayList<>(zooKeepers);
    }

    /**
     * Returns the number of zoo keepers managed.
     * 
     * @return count of zoo keepers.
     */
    public int getZooKeeperCount() {
        return zooKeepers.size();
    }
}
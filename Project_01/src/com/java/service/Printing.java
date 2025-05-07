package com.java.service;

import com.java.model.Player;

public class Printing {
    public static void print(Player player) {
        System.out.println("--------------------------------");
        System.out.println("Player Information:");
        System.out.println("Number: " + player.getNumber());
        System.out.println("Name: " + player.getName());
        System.out.println("--------------------------------");
    }
}

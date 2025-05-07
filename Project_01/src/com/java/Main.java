package com.java;

import com.java.model.Player;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to the Football Team Management System");
            System.out.println("-----------------------------------------------");

            Player player = createPlayer();
            System.out.println("Player added successfully");
            player.printInfo();

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static Player createPlayer() {
        System.out.print("Enter the player number: ");
        int number = getValidNumber();

        System.out.print("Enter the player name: ");
        String name = getValidName();

        return new Player(number, name);
    }

    private static int getValidNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine().trim());
                if (number > 0) {
                    return number;
                }
                System.out.print("Number must be greater than 0. Please try again: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid number format. Please enter a valid number: ");
            }
        }
    }

    private static String getValidName() {
        while (true) {
            String name = scanner.nextLine().trim();
            if (name != null && !name.isEmpty() && name.length() > 5) {
                return name;
            }
            System.out.print("Name must be greater than 5 characters. Please try again: ");
        }
    }
}
package com.zoo.utils;

import java.util.Scanner;

/**
 * Utility class for handling user inputs.
 */
public class InputHandler {
    private Scanner scanner;

    /**
     * Constructor initializes scanner.
     */
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Reads a non-empty string input from the user.
     *
     * @param prompt The prompt message to display.
     * @return The user input string.
     */
    public String getNonEmptyString(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    /**
     * Reads an integer input from the user within a specified range.
     *
     * @param prompt The prompt message to display.
     * @param min    The minimum allowed value.
     * @param max    The maximum allowed value.
     * @return The validated integer input.
     */
    public int getIntInRange(String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                input = Integer.parseInt(line);
                if (input < min || input > max) {
                    System.out.println("Input must be between " + min + " and " + max + ".");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer input. Please try again.");
            }
        }
    }

    /**
     * Closes the scanner resource.
     */
    public void close() {
        scanner.close();
    }
}
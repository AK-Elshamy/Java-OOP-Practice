package com.zoo.utils;

/**
 * Utility class for validating input data.
 */
public class Validator {

    /**
     * Checks if a string is null or empty.
     *
     * @param input The string to check.
     * @return true if the string is null or empty, false otherwise.
     */
    public static boolean isNullOrEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    /**
     * Validates if a number is within a specified range.
     *
     * @param number The number to validate.
     * @param min    The minimum value inclusive.
     * @param max    The maximum value inclusive.
     * @return true if number is within range, false otherwise.
     */
    public static boolean isNumberInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }

    /**
     * Validates if a string matches a pattern.
     *
     * @param input   The string to check.
     * @param pattern The regex pattern.
     * @return true if string matches pattern, false otherwise.
     */
    public static boolean matchesPattern(String input, String pattern) {
        if (input == null) {
            return false;
        }
        return input.matches(pattern);
    }
}
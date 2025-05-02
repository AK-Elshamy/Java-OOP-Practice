package com.zoo.reports;

import java.util.List;

/**
 * General class responsible for generating various types of reports.
 */
public class ReportGenerator {

    /**
     * Generates a generic report given a list of items.
     *
     * @param title The title of the report.
     * @param items The list of items to include in the report.
     * @param <T>   The type of items in the report.
     */
    public <T> void generateReport(String title, List<T> items) {
        System.out.println("Report: " + title);
        System.out.println("----------------------------");
        for (T item : items) {
            System.out.println(item);
        }
        System.out.println();
    }
}
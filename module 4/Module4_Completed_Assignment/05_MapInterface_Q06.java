/*
 * Question:
 * Write a program to create a HashMap of employee IDs and names. Perform the following operations:
 * Add new key-value pairs.
 * Check if a key exists.
 * Iterate through the map using: KeySet, EntrySet.
 */

import java.util.*;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap: Key = Employee ID (Integer), Value = Employee Name (String)
        HashMap<Integer, String> employees = new HashMap<>();

        // 1. Add new key-value pairs
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(104, "Diana");
        System.out.println("Employee Map: " + employees);

        // 2. Check if a key exists
        int searchId = 103;
        if (employees.containsKey(searchId)) {
            System.out.println("\nEmployee with ID " + searchId + " exists: " + employees.get(searchId));
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // 3. Iterate through the map using KeySet
        System.out.println("\n--- Iterating using KeySet ---");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + " | Name: " + employees.get(id));
        }

        // 4. Iterate through the map using EntrySet
        System.out.println("\n--- Iterating using EntrySet ---");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}

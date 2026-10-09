/*
 * Question:
 * Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs.
 */

import java.util.*;

public class TreeMapOrderDemo {
    public static void main(String[] args) {
        // TreeMap ensures keys are sorted according to their natural order
        TreeMap<Integer, String> productMap = new TreeMap<>();

        // Adding entries in unsorted order of keys
        productMap.put(50, "Laptop");
        productMap.put(10, "Mouse");
        productMap.put(100, "Monitor");
        productMap.put(20, "Keyboard");
        productMap.put(5, "USB Cable");

        System.out.println("Inserted IDs in order: 50, 10, 100, 20, 5");
        System.out.println("\nIterating through TreeMap (Keys will be automatically sorted):");

        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + " | Item: " + entry.getValue());
        }

        System.out.println("\nVerification: The IDs 5, 10, 20, 50, 100 should appear in sequence.");
    }
}

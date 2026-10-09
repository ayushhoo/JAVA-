/*
 * Question:
 * Write a program to store a list of products and their prices in a TreeMap
 * and display the products in sorted order by name.
 */

import java.util.*;

public class ProductPriceList {
    public static void main(String[] args) {
        // TreeMap ensures products are sorted by their name (the key) automatically
        TreeMap<String, Double> productPrices = new TreeMap<>();

        // Adding products in unsorted order
        productPrices.put("Smartphone", 699.99);
        productPrices.put("Laptop", 1200.50);
        productPrices.put("Headphones", 150.00);
        productPrices.put("Monitor", 300.00);
        productPrices.put("Keyboard", 50.00);

        System.out.println("--- Product Price List (Sorted by Name) ---");
        System.out.printf("%-15s | %-10s%n", "Product", "Price");
        System.out.println("----------------------------------");

        // Iterating through TreeMap entries
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.printf("%-15s | $%.2f%n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nVerification: The products appear in alphabetical order (Headphones, Keyboard, Laptop, Monitor, Smartphone).");
    }
}

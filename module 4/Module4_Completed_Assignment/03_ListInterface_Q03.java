/*
 * Question:
 * Write a program to demonstrate the use of ArrayList for storing and iterating over elements.
 */

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Storing elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Initial ArrayList: " + fruits);

        // 1. Iterating using an enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 2. Iterating using a simple for loop with index
        System.out.println("\nIterating using simple for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit at index " + i + ": " + fruits.get(i));
        }

        // 3. Iterating using an Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println("Fruit: " + it.next());
        }
    }
}

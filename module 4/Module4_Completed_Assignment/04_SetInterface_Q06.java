/*
 * Question:
 * Write a program to demonstrate the uniqueness property of HashSet by attempting to add duplicate elements.
 */

import java.util.*;

public class HashSetUniquenessDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Attempting to add elements to HashSet...");

        // Adding first set of elements
        System.out.println("Add 10: " + numbers.add(10)); // true
        System.out.println("Add 20: " + numbers.add(20)); // true
        System.out.println("Add 30: " + numbers.add(30)); // true

        System.out.println("\nAttempting to add duplicates...");
        System.out.println("Add 10 again: " + numbers.add(10)); // false
        System.out.println("Add 20 again: " + numbers.add(20)); // false

        System.out.println("\nFinal Set contents: " + numbers);
        System.out.println("Final size: " + numbers.size());
        System.out.println("Verification: Size should be 3 despite 5 add attempts.");
    }
}

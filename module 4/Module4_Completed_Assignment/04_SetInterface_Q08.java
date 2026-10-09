/*
 * Question:
 * Write a program to iterate over a LinkedHashSet and explain its order-preserving property.
 */

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // LinkedHashSet maintains the insertion order
        Set<String> colors = new LinkedHashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red"); // Duplicate - will be ignored

        System.out.println("Adding colors in order: Red, Green, Blue, Yellow, Red");

        System.out.println("\nIterating over LinkedHashSet:");
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        System.out.println("\nExplanation:");
        System.out.println("Unlike HashSet, which is unordered, LinkedHashSet uses an internal");
        System.out.println("doubly-linked list to remember the order in which elements were inserted.");
        System.out.println("When we iterate, the elements appear exactly in the order they were first added.");
    }
}

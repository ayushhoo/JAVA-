/*
 * Question:
 * Write a program to demonstrate the use of TreeSet for storing sorted elements.
 */

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet of Strings
        // TreeSet automatically sorts elements in their natural (alphabetical) order
        TreeSet<String> sortedFruits = new TreeSet<>();

        // Adding elements in unsorted order
        sortedFruits.add("Mango");
        sortedFruits.add("Apple");
        sortedFruits.add("Zebra");
        sortedFruits.add("Banana");
        sortedFruits.add("Cherry");

        System.out.println("Elements added to TreeSet: Mango, Apple, Zebra, Banana, Cherry");
        System.out.println("TreeSet content (automatically sorted): " + sortedFruits);

        // Demonstrate first and last elements
        System.out.println("First element (lowest): " + sortedFruits.first());
        System.out.println("Last element (highest): " + sortedFruits.last());

        // Demonstrate descending iterator
        System.out.print("Elements in descending order: ");
        Iterator<String> descIter = sortedFruits.descendingIterator();
        while (descIter.hasNext()) {
            System.out.print(descIter.next() + " ");
        }
        System.out.println();
    }
}

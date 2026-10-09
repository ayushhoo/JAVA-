/*
 * Question:
 * Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.
 */

import java.util.*;

public class ListSortDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
            "Zebra", "Apple", "Mango", "Banana", "Orange"
        ));

        System.out.println("Original List: " + names);

        // 1. Alphabetical Sort (Natural Order)
        Collections.sort(names);
        System.out.println("Alphabetical Sort: " + names);

        // 2. Reverse Alphabetical Sort
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Alphabetical Sort: " + names);
    }
}

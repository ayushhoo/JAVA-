/*
 * Question:
 * Write a program to demonstrate the use of TreeMap for sorting keys.
 */

import java.util.*;

public class TreeMapSortDemo {
    public static void main(String[] args) {
        // TreeMap automatically sorts keys in their natural order (alphabetical for Strings)
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding elements in unsorted order
        studentScores.put("Zoya", 85);
        studentScores.put("Amit", 92);
        studentScores.put("Rahul", 78);
        studentScores.put("Bhavna", 95);
        studentScores.put("Charu", 88);

        System.out.println("Adding students in order: Zoya, Amit, Rahul, Bhavna, Charu");
        System.out.println("\nTreeMap Content (Sorted by Student Name):");

        // Iterating over the TreeMap
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " | Score: " + entry.getValue());
        }

        // Demonstrate finding the first and last keys
        System.out.println("\nFirst student (alphabetically): " + studentScores.firstKey());
        System.out.println("Last student (alphabetically): " + studentScores.lastKey());
    }
}

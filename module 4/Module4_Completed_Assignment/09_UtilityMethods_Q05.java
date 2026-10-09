/*
 * Question:
 * Write a program to perform a binary search on a List using the
 * Collections.binarySearch() method.
 */

import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] args) {
        // Binary Search requires the list to be sorted
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        System.out.println("Sorted List: " + numbers);

        int target = 40;
        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }

        // Testing for an element that doesn't exist
        int missingTarget = 25;
        int missingIndex = Collections.binarySearch(numbers, missingTarget);
        System.out.println("Search for " + missingTarget + " index: " + missingIndex + " (Negative value indicates not found)");
    }
}

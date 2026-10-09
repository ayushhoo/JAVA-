/*
 * Question:
 * Create a TreeSet of integers and perform the following operations:
 * Add elements to the set.
 * Find the smallest and largest elements.
 * Remove a specific element.
 */

import java.util.*;

public class TreeSetOpsDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // 1. Add elements
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(2);
        numbers.add(67);
        System.out.println("TreeSet after adding elements: " + numbers);

        // 2. Find smallest and largest
        Integer min = numbers.first();
        Integer max = numbers.last();
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);

        // 3. Remove a specific element
        int toRemove = 12;
        System.out.println("\nRemoving element " + toRemove + "...");
        boolean removed = numbers.remove(toRemove);
        System.out.println("Was " + toRemove + " removed? " + removed);
        System.out.println("Final TreeSet: " + numbers);
    }
}

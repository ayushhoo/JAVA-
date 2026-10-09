/*
 * Question:
 * Create a List of strings and perform the following operations:
 * Add elements to the list.
 * Remove an element by value and index.
 * Replace an element at a specific index.
 * Print the list after each operation.
 */

import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();

        // 1. Add elements to the list
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Tokyo");
        cityList.add("Paris");
        cityList.add("Mumbai");
        System.out.println("Initial List: " + cityList);

        // 2. Remove an element by value
        cityList.remove("Tokyo");
        System.out.println("After removing 'Tokyo' (by value): " + cityList);

        // 3. Remove an element by index
        cityList.remove(0); // Removes "New York"
        System.out.println("After removing index 0 (by index): " + cityList);

        // 4. Replace an element at a specific index
        // Replacing "Paris" (which is now at index 1) with "Berlin"
        cityList.set(1, "Berlin");
        System.out.println("After replacing index 1 with 'Berlin': " + cityList);
    }
}

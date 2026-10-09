/*
 * Question:
 * Write a program to find the frequency of elements in a list using Collections.frequency().
 */

import java.util.*;

public class FrequencyDemo {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList(
            "Apple", "Banana", "Apple", "Cherry", "Banana", "Apple", "Date"
        ));

        System.out.println("Original List: " + items);

        String target = "Apple";
        int count = Collections.frequency(items, target);
        System.out.println("\nFrequency of '" + target + "': " + count);

        // Testing for an element that appears multiple times
        String target2 = "Banana";
        System.out.println("Frequency of '" + target2 + "': " + Collections.frequency(items, target2));

        // Testing for an element that doesn't exist
        String target3 = "Elderberry";
        System.out.println("Frequency of '" + target3 + "': " + Collections.frequency(items, target3));
    }
}

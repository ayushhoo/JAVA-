/*
 * Question:
 * Create an unmodifiable List using Collections.unmodifiableList() and show
 * what happens when you try to modify it.
 */

import java.util.*;

public class UnmodifiableListDemo {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Java");
        mutableList.add("Python");
        mutableList.add("C++");

        System.out.println("Original Mutable List: " + mutableList);

        // Create an unmodifiable view of the list
        List<String> readOnlyList = Collections.unmodifiableList(mutableList);
        System.out.println("Unmodifiable List: " + readOnlyList);

        try {
            System.out.println("\nAttempting to add 'Kotlin' to the unmodifiable list...");
            readOnlyList.add("Kotlin");
        } catch (UnsupportedOperationException e) {
            System.out.println("CAUGHT EXCEPTION: " + e);
            System.out.println("Result: Modification failed as expected!");
        }
    }
}

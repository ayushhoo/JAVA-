/*
 * Question:
 * How does HashSet handle duplicate elements? Explain with an example.
 */

/**
 * Explanation:
 *
 * HashSet handles duplicates by using the 'hashCode()' and 'equals()' methods of the objects being stored.
 *
 * When you call add(element):
 * 1. The HashSet calculates the hash code of the element using element.hashCode().
 * 2. It uses this hash code to find a "bucket" (a slot in an internal array).
 * 3. If the bucket is empty, the element is added.
 * 4. If the bucket already contains elements (a collision), it checks each element in that bucket using
 *    the equals() method.
 * 5. If equals() returns true for any element in the bucket, the HashSet considers the new element a duplicate
 *    and does NOT add it.
 * 6. If equals() returns false for all elements in the bucket, the element is added to the bucket.
 *
 * Example:
 * If you add two different String objects that both contain "Apple", they will have the same hash code
 * and equals() will return true. Therefore, only one "Apple" will be stored.
 */

import java.util.*;

public class HashSetDuplicateDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println("Adding 'Apple'...");
        System.out.println("Was added? " + set.add("Apple")); // true

        System.out.println("Adding 'Banana'...");
        System.out.println("Was added? " + set.add("Banana")); // true

        System.out.println("Adding 'Apple' again...");
        System.out.println("Was added? " + set.add("Apple")); // false - duplicate detected!

        System.out.println("\nFinal Set content: " + set);
        System.out.println("Set size: " + set.size());
    }
}

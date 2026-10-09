/*
 * Question:
 * Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order.
 */

import java.util.*;

public class MapIterationOrderDemo {
    public static void main(String[] args) {
        // Data to be added
        String[] keys = {"One", "Two", "Three", "Four"};
        String[] values = {"1", "2", "3", "4"};

        // 1. HashMap: No guaranteed order
        Map<String, String> hashMap = new HashMap<>();
        // 2. LinkedHashMap: Maintains insertion order
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], values[i]);
            linkedHashMap.put(keys[i], values[i]);
        }

        System.out.println("--- HashMap Iteration Order (Unpredictable) ---");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n--- LinkedHashMap Iteration Order (Preserves Insertion Order) ---");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nNote: HashMap might show elements in any order, while LinkedHashMap will always show: One, Two, Three, Four.");
    }
}

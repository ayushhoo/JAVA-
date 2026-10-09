/*
 * Question:
 * Write a program to sort a Map by its values using a custom Comparator.
 */

import java.util.*;

public class MapValueSortDemo {
    public static void main(String[] args) {
        // Original Map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("Diana", 95);

        System.out.println("Original Map: " + scores);

        // To sort a map by values, we must convert it to a List of Map Entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(scores.entrySet());

        // Create a custom comparator to sort based on values in descending order
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        };

        // Sort the list using the comparator
        Collections.sort(list, valueComparator);

        System.out.println("\nMap sorted by values (Descending):");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

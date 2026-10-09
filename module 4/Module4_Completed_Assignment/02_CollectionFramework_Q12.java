/*
 * Question:
 * Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).
 */

import java.util.*;

public class CollectionPrinter {

    /**
     * Generic method that accepts any object that implements the Collection interface.
     * Using wildcard <T> to handle any type of element.
     */
    public static <T> void printCollection(Collection<T> collection) {
        System.out.println("Printing Collection contents:");
        if (collection == null || collection.isEmpty()) {
            System.out.println("Collection is empty.");
            return;
        }

        for (T element : collection) {
            System.out.println("Element: " + element);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // 1. Test with a List
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        printCollection(names);

        // 2. Test with a Set
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4));
        printCollection(uniqueNumbers);

        // 3. Test with a Queue
        Queue<Double> prices = new LinkedList<>(Arrays.asList(10.5, 20.99, 5.0));
        printCollection(prices);
    }
}

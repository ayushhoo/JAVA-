/*
 * Question:
 * Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods
 * findMin() and findMax() to find the minimum and maximum elements in a list.
 * Demonstrate it with a list of integers and strings.
 */

import java.util.*;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;

    public MinMaxFinder(List<T> list) {
        this.list = list;
    }

    public T findMin() {
        if (list == null || list.isEmpty()) return null;
        T min = list.get(0);
        for (T element : list) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T findMax() {
        if (list == null || list.isEmpty()) return null;
        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Testing with Integers
        List<Integer> intList = Arrays.asList(15, 2, 89, 45, 1);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intList);
        System.out.println("Integer List: " + intList);
        System.out.println("Min: " + intFinder.findMin() + ", Max: " + intFinder.findMax());

        // Testing with Strings
        List<String> strList = Arrays.asList("Banana", "Apple", "Zebra", "Mango");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(strList);
        System.out.println("\nString List: " + strList);
        System.out.println("Min (Alphabetical): " + strFinder.findMin() + ", Max (Alphabetical): " + strFinder.findMax());
    }
}

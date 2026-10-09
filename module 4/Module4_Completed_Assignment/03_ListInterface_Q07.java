/*
 * Question:
 * Write a program to compare the performance of ArrayList and LinkedList for:
 * Adding elements at the beginning.
 * Removing elements from the middle.
 * Iterating through the list.
 */

import java.util.*;

public class ListPerformanceComparison {
    private static final int ELEMENTS_COUNT = 100000;

    public static void main(String[] args) {
        System.out.println("Comparing ArrayList vs LinkedList with " + ELEMENTS_COUNT + " elements...\n");

        // --- Test 1: Adding elements at the beginning ---
        long start = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList Add at Beginning: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Add at Beginning: " + (end - start) / 1_000_000 + " ms");
        System.out.println("--------------------------------------------------");

        // --- Test 2: Removing elements from the middle ---
        // We use the lists created above.
        start = System.nanoTime();
        for (int i = ELEMENTS_COUNT / 2; i > 0; i--) {
            arrayList.remove(ELEMENTS_COUNT / 2);
        }
        end = System.nanoTime();
        System.out.println("ArrayList Remove from Middle: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = ELEMENTS_COUNT / 2; i > 0; i--) {
            linkedList.remove(ELEMENTS_COUNT / 2);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Remove from Middle: " + (end - start) / 1_000_000 + " ms");
        System.out.println("--------------------------------------------------");

        // --- Test 3: Iterating through the list ---
        // Re-populate lists for a fair test
        arrayList.clear();
        linkedList.clear();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        start = System.nanoTime();
        long sum1 = 0;
        for (Integer n : arrayList) sum1 += n;
        end = System.nanoTime();
        System.out.println("ArrayList Iteration: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        long sum2 = 0;
        for (Integer n : linkedList) sum2 += n;
        end = System.nanoTime();
        System.out.println("LinkedList Iteration: " + (end - start) / 1_000_000 + " ms");
    }
}

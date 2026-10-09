/*
 * Question:
 * Write a program to merge two PriorityQueue objects and sort the resulting queue.
 */

import java.util.*;

public class PriorityQueueMergeDemo {
    public static void main(String[] args) {
        // First PriorityQueue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(5);
        pq1.add(20);

        // Second PriorityQueue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(15);
        pq2.add(2);
        pq2.add(30);

        System.out.println("PQ1: " + pq1);
        System.out.println("PQ2: " + pq2);

        // Merge pq2 into pq1
        pq1.addAll(pq2);

        System.out.println("\nMerged PriorityQueue (Internal representation): " + pq1);

        // To show the "sorted" result, we must poll the elements
        System.out.println("Poll elements in sorted order:");
        while (!pq1.isEmpty()) {
            System.out.print(pq1.poll() + " ");
        }
        System.out.println();
    }
}

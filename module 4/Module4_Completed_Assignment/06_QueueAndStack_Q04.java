/*
 * Question:
 * Implement a deque using the ArrayDeque class. Perform operations like:
 * Add elements at both ends.
 * Remove elements from both ends.
 * Peek at both ends.
 */

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        System.out.println("--- ArrayDeque (Double Ended Queue) Demo ---");

        // 1. Add elements at both ends
        deque.addFirst("Start_1");
        deque.addFirst("Start_0");
        deque.addLast("End_1");
        deque.addLast("End_2");
        System.out.println("Deque after additions: " + deque);

        // 2. Peek at both ends
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // 3. Remove elements from both ends
        System.out.println("\nRemoving from front...");
        System.out.println("Removed: " + deque.pollFirst());
        System.out.println("Current Deque: " + deque);

        System.out.println("\nRemoving from back...");
        System.out.println("Removed: " + deque.pollLast());
        System.out.println("Current Deque: " + deque);
    }
}

/*
 * Question:
 * Write a program to implement a simple Queue using the LinkedList class.
 */

import java.util.*;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        // LinkedList implements the Queue interface
        Queue<String> queue = new LinkedList<>();

        System.out.println("--- Simple Queue implementation using LinkedList ---");

        // Adding elements to the queue (enqueue)
        queue.add("Request 1");
        queue.add("Request 2");
        queue.add("Request 3");
        System.out.println("Initial Queue: " + queue);

        // Viewing the head of the queue without removing
        System.out.println("Head of Queue: " + queue.peek());

        // Removing elements from the queue (dequeue)
        System.out.println("\nProcessing Requests:");
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        System.out.println("\nAll requests processed. Queue is empty.");
    }
}

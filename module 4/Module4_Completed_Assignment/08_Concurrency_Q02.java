/*
 * Question:
 * Write a program to demonstrate the thread-safe nature of Vector by adding elements to it from multiple threads.
 */

import java.util.*;

public class VectorThreadSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();
        int iterationsPerThread = 1000;

        // Define a task that adds elements to the vector
        Runnable task = () -> {
            for (int i = 0; i < iterationsPerThread; i++) {
                vector.add(i);
            }
        };

        // Create two threads to add elements concurrently
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        System.out.println("Starting threads to add elements to Vector...");
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Total should be exactly iterationsPerThread * 2
        System.out.println("Expected size: " + (iterationsPerThread * 2));
        System.out.println("Actual Vector size: " + vector.size());

        if (vector.size() == iterationsPerThread * 2) {
            System.out.println("SUCCESS: Vector maintained thread safety.");
        } else {
            System.out.println("FAILURE: Data corruption occurred.");
        }
    }
}

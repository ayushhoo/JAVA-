/*
 * Question:
 * Write a program using CopyOnWriteArrayList to iterate and modify a list safely
 * in a multithreaded environment.
 */

import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteDemo {
    public static void main(String[] args) throws InterruptedException {
        // CopyOnWriteArrayList allows safe modification during iteration
        List<String> safeList = new CopyOnWriteArrayList<>();
        safeList.add("Java");
        safeList.add("Python");
        safeList.add("C++");

        System.out.println("Initial List: " + safeList);

        // Thread to iterate over the list
        Runnable reader = () -> {
            System.out.println("Reader: Starting iteration...");
            for (String lang : safeList) {
                System.out.println("Reading: " + lang);
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
            System.out.println("Reader: Iteration complete.");
        };

        // Thread to modify the list
        Runnable writer = () -> {
            try { Thread.sleep(20); } catch (InterruptedException e) {}
            System.out.println("Writer: Adding 'Kotlin' to list...");
            safeList.add("Kotlin");
            System.out.println("Writer: Modification done.");
        };

        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(writer);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFinal List: " + safeList);
        System.out.println("Conclusion: The reader saw the snapshot and did not crash when the writer added an element.");
    }
}

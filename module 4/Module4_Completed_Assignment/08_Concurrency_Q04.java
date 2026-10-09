/*
 * Question:
 * Create a ConcurrentHashMap and demonstrate how it handles concurrent modifications.
 */

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentHashMap allows safe concurrent access
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial Map: " + map);

        // Thread to add/update elements while another thread iterates
        Runnable modifier = () -> {
            for (int i = 0; i < 5; i++) {
                map.put("Fruit_" + i, i * 10);
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
            System.out.println("Modifier thread finished updates.");
        };

        Runnable reader = () -> {
            System.out.println("Reader thread starting iteration...");
            // In HashMap, this would throw ConcurrentModificationException
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Reading: " + entry.getKey() + " = " + entry.getValue());
                try { Thread.sleep(15); } catch (InterruptedException e) {}
            }
            System.out.println("Reader thread finished iteration.");
        };

        Thread t1 = new Thread(modifier);
        Thread t2 = new Thread(reader);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFinal Map: " + map);
        System.out.println("Conclusion: ConcurrentHashMap allowed modification during iteration without crashing.");
    }
}

/*
 * Question:
 * How can you make a collection thread-safe using the Collections class?
 */

/**
 * Explanation:
 *
 * You can make any non-thread-safe collection (like ArrayList, HashSet, or HashMap)
 * thread-safe by using the synchronized wrapper methods provided by the Collections class.
 *
 * These methods create a "wrapper" around the original collection. Every method
 * called on the wrapper is internally synchronized on a single lock (the wrapper object itself).
 *
 * Methods available:
 * - Collections.synchronizedList(List<T> list)
 * - Collections.synchronizedSet(Set<T> set)
 * - Collections.synchronizedMap(Map<K,V> map)
 */

import java.util.*;

public class SynchronizedCollectionDemo {
    public static void main(String[] args) {
        // 1. Create a standard ArrayList (not thread-safe)
        List<String> unsafeList = new ArrayList<>();

        // 2. Wrap it to make it thread-safe
        List<String> safeList = Collections.synchronizedList(unsafeList);

        safeList.add("Item 1");
        safeList.add("Item 2");

        System.out.println("Synchronized List: " + safeList);
        System.out.println("Is it thread-safe? Yes, all method calls are now synchronized.");
    }
}

/*
 * Question:
 * Create a class LruCache<K, V> using LinkedHashMap to implement an LRU (Least Recently Used) cache.
 */

import java.util.*;

class LruCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LruCache(int capacity) {
        // 'true' for access-order: moves accessed elements to the end of the list
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // Automatically remove the eldest entry when size exceeds capacity
        return size() > capacity;
    }

    public static void main(String[] args) {
        LruCache<Integer, String> cache = new LruCache<>(3);

        System.out.println("Adding elements: 1:A, 2:B, 3:C");
        cache.put(1, "A");
        cache.put(2, "B,");
        cache.put(3, "C");
        System.out.println("Cache: " + cache);

        System.out.println("\nAccessing key 1 (Moves 1 to most recent position)...");
        cache.get(1);
        System.out.println("Cache: " + cache);

        System.out.println("\nAdding key 4:D (Should trigger removal of least recently used element)...");
        cache.put(4, "D");
        System.out.println("Cache: " + cache);
        System.out.println("Note: Key 2 was removed because 1 was recently accessed and 3 was added after 2.");
    }
}

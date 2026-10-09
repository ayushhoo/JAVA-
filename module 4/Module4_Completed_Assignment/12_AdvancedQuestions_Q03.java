/*
 * Question:
 * Use a WeakHashMap to demonstrate how entries are garbage-collected when
 * keys are no longer strongly referenced.
 */

import java.util.*;

public class WeakHashMapGCDemo {
    public static void main(String[] args) {
        // Using WeakHashMap: Keys are weakly referenced
        Map<KeyObject, String> weakMap = new WeakHashMap<>();

        // Create a key object on the heap
        KeyObject key1 = new KeyObject("Key1");
        KeyObject key2 = new KeyObject("Key2");

        weakMap.put(key1, "Value 1");
        weakMap.put(key2, "Value 2");

        System.out.println("Initial Map size: " + weakMap.size());
        System.out.println("Map content: " + weakMap);

        // Remove the strong reference to key1
        System.out.println("\nRemoving strong reference to key1...");
        key1 = null;

        // Suggest the Garbage Collector to run
        // Note: System.gc() is a hint, not a guarantee, but usually works in simple demos
        System.out.println("Requesting Garbage Collection...");
        System.gc();

        // Give GC a moment to process
        try { Thread.sleep(500); } catch (InterruptedException e) {}

        System.out.println("\nMap size after GC: " + weakMap.size());
        System.out.println("Map content: " + weakMap);
        System.out.println("Note: Key1 should have been removed automatically because it had no strong references.");
    }

    // Static class for key to avoid implicit outer class references
    static class KeyObject {
        String name;
        KeyObject(String name) { this.name = name; }
        @Override
        public String toString() { return name; }
    }
}

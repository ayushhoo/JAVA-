/*
 * Question:
 * Create a generic MultiMap<K, V> class that stores multiple values for a single key
 * using a HashMap<K, List<V>>.
 */

import java.util.*;

class MultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        // If key doesn't exist, create a new list
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, Collections.emptyList());
    }

    public void remove(K key) {
        map.remove(key);
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public static void main(String[] args) {
        MultiMap<String, String> studentCourses = new MultiMap<>();

        // Adding multiple values to the same key
        studentCourses.put("Alice", "Java");
        studentCourses.put("Alice", "Python");
        studentCourses.put("Alice", "Database");

        studentCourses.put("Bob", "C++");
        studentCourses.put("Bob", "Java");

        System.out.println("MultiMap (Student -> Courses):");
        System.out.println("Alice's courses: " + studentCourses.get("Alice"));
        System.out.println("Bob's courses: " + studentCourses.get("Bob"));
        System.out.println("\nFull Map: " + studentCourses);
    }
}

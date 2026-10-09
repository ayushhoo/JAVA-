/*
 * Question:
 * Write a generic class Pair<K, V> that holds two values of any types, K and V.
 * Include methods to get and set the values.
 */

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for Key
    public K getKey() {
        return key;
    }

    // Setter for Key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for Value
    public V getValue() {
        return value;
    }

    // Setter for Value
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Pair of String and Integer
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println("Pair 1: " + pair1.getKey() + " = " + pair1.getValue());

        // Pair of Integer and Double
        Pair<Integer, Double> pair2 = new Pair<>(1, 98.6);
        System.out.println("Pair 2: " + pair2.getKey() + " = " + pair2.getValue());

        // Updating values
        pair1.setValue(26);
        System.out.println("Updated Pair 1: " + pair1.getKey() + " = " + pair1.getValue());
    }
}

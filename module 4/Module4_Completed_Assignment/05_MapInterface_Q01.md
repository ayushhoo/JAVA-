# Question:
# What is the Map interface in Java, and how is it different from Collection?

## Explanation:

The `Map` interface is a key part of the Java Collection Framework, but it operates on a different fundamental principle than the `Collection` interface.

### 1. The Map Interface
A `Map` is an object that maps **keys to values**. A map cannot contain duplicate keys; each key can map to at most one value.

- **Structure**: It stores data as "entries" or "pairs" (Key $\rightarrow$ Value).
- **Primary Use Case**: When you need to look up data based on a unique identifier (like a User ID to a User Object).
- **Common Methods**: `put(K key, V value)`, `get(Object key)`, `containsKey(Object key)`, `remove(Object key)`.

### 2. Differences from the Collection Interface
While `Map` is logically part of the "collections" family, it does **not** extend the `java.util.Collection` interface.

| Feature | Collection (List, Set, Queue) | Map |
| :--- | :--- | :--- |
| **Data Unit** | Single element (`E`) | Key-Value pair (`K, V`) |
| **Uniqueness** | Set forbids duplicates; List allows them | Keys must be unique; Values can be duplicated |
| **Access Method** | Iterator or index-based | Key-based lookup |
| **Primary Method** | `add(E e)` | `put(K key, V value)` |
| **Hierarchy** | Extends `Iterable` | Standalone root interface |

### Why is it separate?
`Map` is separate because its operations are fundamentally different. For example, adding an element to a `Collection` requires only one argument (`add(element)`), whereas adding to a `Map` requires two (`put(key, value)`). Because the method signatures are so different, `Map` cannot inherit from the `Collection` interface.

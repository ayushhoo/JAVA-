# Question:
# What is the difference between Collection and Map interfaces in Java?

## Explanation:

While both `Collection` and `Map` are part of the Java Collection Framework, they are fundamentally different in how they store and manage data.

### 1. Collection Interface
The `Collection` interface is the root for groups of **single elements**.

- **Data Storage**: Stores a group of individual objects (e.g., a list of names).
- **Access**: Elements are typically accessed via iteration or index (in the case of `List`).
- **Duplicates**: Depends on the sub-interface (`List` allows duplicates, `Set` does not).
- **Key Method**: `add(E e)` returns a boolean indicating if the collection changed.
- **Examples**: `ArrayList`, `HashSet`, `PriorityQueue`.

### 2. Map Interface
The `Map` interface is for storing **key-value pairs**.

- **Data Storage**: Stores mappings of a unique key to a specific value (e.g., a student ID mapped to a student object).
- **Access**: Elements are accessed using their **Key**.
- **Duplicates**: Keys must be unique; however, values can be duplicated.
- **Key Method**: `put(K key, V value)` associates the specified value with the specified key.
- **Examples**: `HashMap`, `TreeMap`, `LinkedHashMap`.

### Summary Comparison Table:

| Feature | Collection | Map |
| :--- | :--- | :--- |
| **Basic Unit** | Single Element (`E`) | Key-Value Pair (`K, V`) |
| **Hierarchy** | Root is `java.util.Collection` | Root is `java.util.Map` |
| **Duplicate Keys** | N/A | Not allowed (Unique keys) |
| **Duplicate Values** | Allowed (except in `Set`) | Allowed |
| **Method to add** | `add(element)` | `put(key, value)` |
| **Method to get** | `iterator()` or `get(index)` | `get(key)` |

# Question:
# What is the difference between HashMap, LinkedHashMap, and TreeMap?

## Explanation:

All three classes implement the `Map` interface, meaning they store key-value pairs and ensure unique keys. However, they differ in their internal implementation and how they order those keys.

### 1. HashMap
`HashMap` is the general-purpose implementation. It uses a hash table for storage.

- **Ordering**: It provides **no guarantee of order**. The order can change when new elements are added.
- **Performance**: Offers the best performance. Basic operations like `put()`, `get()`, and `remove()` run in **O(1)** constant time on average.
- **Nulls**: Allows one `null` key and multiple `null` values.
- **Best Use Case**: When you need the fastest possible performance and don't care about the order of elements.

### 2. LinkedHashMap
`LinkedHashMap` extends `HashMap` and maintains a doubly-linked list running through its entries.

- **Ordering**: It maintains the **insertion order**. When you iterate over a `LinkedHashMap`, keys appear in the order they were first put into the map.
- **Performance**: Slightly slower than `HashMap` because it must maintain the linked list, but still provides **O(1)** for basic operations.
- **Nulls**: Allows one `null` key and multiple `null` values.
- **Best Use Case**: When you need a map but want to preserve the order in which entries were added (e.g., for a cache).

### 3. TreeMap
`TreeMap` is implemented using a Red-Black Tree (a self-balancing binary search tree).

- **Ordering**: It maintains keys in **sorted order** (natural order of keys or a custom `Comparator`).
- **Performance**: Slower than the other two. Basic operations run in **O(log n)** time.
- **Nulls**: Does **not** allow `null` keys (because it needs to compare keys to sort them), but allows `null` values.
- **Best Use Case**: When you need the keys to be always sorted or need to perform range queries (e.g., "find all keys between 'A' and 'F'").

### Summary Comparison Table:

| Feature | HashMap | LinkedHashMap | TreeMap |
| :--- | :--- | :--- | :--- |
| **Internal Structure** | Hash Table | Hash Table + Linked List | Red-Black Tree |
| **Ordering** | Unordered | Insertion Order | Sorted Order |
| **Time Complexity** | $O(1)$ | $O(1)$ | $O(\log n)$ |
| **Null Keys** | Allowed | Allowed | Not Allowed |
| **Iteration Speed** | Fast | Fast | Fast (Sorted) |

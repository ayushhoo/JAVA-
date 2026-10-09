# Question:
# What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?

## Explanation:

`HashSet`, `LinkedHashSet`, and `TreeSet` all implement the `Set` interface (meaning they all forbid duplicates), but they differ in how they store elements and the order they provide.

### 1. HashSet
`HashSet` is the most commonly used implementation. It uses a hash table for storage.

- **Ordering**: It provides **no guarantee of order**. The order of elements can even change over time.
- **Performance**: Offers the best performance for basic operations: `add`, `remove`, and `contains` all run in **O(1)** constant time.
- **Nulls**: Allows one `null` element.
- **Best Use Case**: When you just need a unique collection and don't care about the order.

### 2. LinkedHashSet
`LinkedHashSet` is a subclass of `HashSet` that maintains a doubly-linked list running through its entries.

- **Ordering**: It maintains the **insertion order**. When you iterate over a `LinkedHashSet`, elements appear in the order they were added.
- **Performance**: Slightly slower than `HashSet` due to the overhead of maintaining the linked list, but still provides **O(1)** for basic operations.
- **Nulls**: Allows one `null` element.
- **Best Use Case**: When you need unique elements but want to remember the order in which they were added.

### 3. TreeSet
`TreeSet` is implemented using a Red-Black Tree (a self-balancing binary search tree).

- **Ordering**: It maintains elements in **sorted order** (natural order or a custom comparator).
- **Performance**: Slower than the other two. Basic operations run in **O(log n)** time.
- **Nulls**: Does not allow `null` elements (because it needs to compare elements to sort them, and `null.compareTo()` would throw a `NullPointerException`).
- **Best Use Case**: When you need unique elements that are always automatically sorted.

### Summary Comparison Table:

| Feature | HashSet | LinkedHashSet | TreeSet |
| :--- | :--- | :--- | :--- |
| **Internal Implementation** | Hash Table | Hash Table + Linked List | Red-Black Tree |
| **Order** | Unordered | Insertion Order | Sorted Order |
| **Time Complexity** | $O(1)$ | $O(1)$ | $O(\log n)$ |
| **Null Allowed** | Yes | Yes | No |
| **Iteration Speed** | Fast | Fast | Fast (Sorted) |

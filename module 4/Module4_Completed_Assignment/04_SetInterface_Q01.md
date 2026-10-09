# Question:
# What is the Set interface, and how is it different from List?

## Explanation:

The `Set` and `List` interfaces are both core parts of the Java Collection Framework, but they model two different mathematical concepts: a **set** and a **sequence**.

### 1. Set Interface (The Unique Collection)
A `Set` is a collection that contains **no duplicate elements**. It models the mathematical concept of a set.

- **Uniqueness**: The primary characteristic of a `Set` is that it ensures every element is unique. If you attempt to add an element that already exists, the `add()` method returns `false` and the set remains unchanged.
- **Ordering**: In its most basic form (`HashSet`), a `Set` does not guarantee any specific order of elements.
- **Access**: You cannot access elements by an index (there is no `get(int index)` method). You typically check if an element exists using `contains()` or iterate through the set.
- **Example**: A set of unique Social Security Numbers (SSNs).

### 2. List Interface (The Ordered Sequence)
A `List` is an **ordered collection** (also known as a sequence).

- **Duplicates**: A `List` allows duplicate elements. You can have the same object stored multiple times.
- **Ordering**: It maintains the exact order of insertion.
- **Access**: It provides positional access. You can retrieve, insert, or remove elements at a specific integer index (e.g., `get(5)`).
- **Example**: A history of visited web pages (where the order matters and you can visit the same page multiple times).

### Summary Comparison Table:

| Feature | Set | List |
| :--- | :--- | :--- |
| **Duplicates** | Not Allowed | Allowed |
| **Ordering** | Generally Unordered | Insertion Order |
| **Index-based Access** | No | Yes (`get(i)`) |
| **Primary Use Case** | Ensuring uniqueness | Maintaining a sequence |
| **Implementations** | `HashSet`, `TreeSet` | `ArrayList`, `LinkedList` |

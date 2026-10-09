# Question:
# How is the Deque interface different from the Queue interface?

## Explanation:

The `Deque` (pronounced "deck") interface stands for **Double Ended Queue**. While it extends the `Queue` interface, it provides significantly more flexibility.

### 1. The Queue Interface (FIFO)
A `Queue` is designed as a simple line. It follows the **First-In-First-Out (FIFO)** principle.
- **Main Operations**: You add elements to the **back** (tail) and remove them from the **front** (head).
- **Key Methods**: `offer()` (add to back), `poll()` (remove from front), `peek()` (view front).

### 2. The Deque Interface (Bi-directional)
A `Deque` is a more powerful version of a queue. It allows you to perform insertions and removals at **both ends**.

- **Dual Nature**: A `Deque` can act as both a **Queue (FIFO)** and a **Stack (LIFO)**.
- **Key Methods**: 
    - `addFirst()` / `removeFirst()` / `peekFirst()`
    - `addLast()` / `removeLast()` / `peekLast()`

### Summary Comparison Table:

| Feature | Queue | Deque |
| :--- | :--- | :--- |
| **Primary Principle** | FIFO (First-In-First-Out) | Bi-directional |
| **Insertion Point** | Back (Tail) only | Front AND Back |
| **Removal Point** | Front (Head) only | Front AND Back |
| **Stack Capability** | No | Yes (can be used as a LIFO stack) |
| **Interface Relation** | Base interface | Extends `Queue` |
| **Implementations** | `PriorityQueue`, `LinkedList` | `ArrayDeque`, `LinkedList` |

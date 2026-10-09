# Question:
# What is the purpose of the PriorityQueue class in Java?

## Explanation:

The `PriorityQueue` class is a specialized implementation of the `Queue` interface that processes elements based on their **priority** rather than their insertion order (FIFO).

### How it Works:
Instead of simply adding elements to the end of a line, a `PriorityQueue` organizes elements using a **Binary Heap** (specifically a min-heap by default). This ensures that the element with the highest priority (the smallest value for numbers or the "first" value for strings) is always at the head of the queue.

### Key Characteristics:

1. **Natural Ordering**: By default, it sorts elements in their natural order (ascending). For example, if you add 10, 1, and 5, the `poll()` method will return 1 first.
2. **Custom Ordering**: You can provide a custom `Comparator` during initialization to change what "highest priority" means (e.g., sorting in descending order or sorting complex objects like `Task` by a priority field).
3. **Time Complexity**: 
   - `offer()` (insert): $O(\log n)$
   - `poll()` (remove head): $O(\log n)$
   - `peek()` (view head): $O(1)$
4. **No Nulls**: `PriorityQueue` does not allow `null` elements because it needs to compare elements to determine priority.

### Practical Use Cases:
- **Operating System Schedulers**: Giving higher priority to critical system tasks over background processes.
- **Dijkstra's Algorithm**: Used in networking and GPS maps to always explore the shortest path first.
- **Emergency Rooms**: Prioritizing patients based on the severity of their condition rather than arrival time.

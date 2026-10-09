# Question:
# What is the difference between BlockingQueue and PriorityQueue?

## Explanation:

While both are specialized types of queues, they solve completely different problems: `PriorityQueue` is about **ordering**, while `BlockingQueue` is about **coordination** (concurrency).

### 1. PriorityQueue (Ordering)
`PriorityQueue` is used when elements should be processed based on their **natural order or a custom priority**, regardless of when they were added.

- **Primary Goal**: To ensure the "most important" item is always served first.
- **Behavior**: If you add elements $\{10, 1, 5\}$, the first one removed will be $1$.
- **Threading**: It is **not thread-safe**. If multiple threads access it, you must synchronize it manually.
- **Use Case**: Task schedulers, Dijkstra's algorithm.

### 2. BlockingQueue (Concurrency/Coordness)
`BlockingQueue` is a thread-safe queue used in producer-consumer scenarios. Its key feature is that it "blocks" the calling thread when certain conditions are met.

- **Primary Goal**: To synchronize the speed of a producer and a consumer.
- **Behavior**:
    - If the queue is **full**, the producer thread is blocked (put to sleep) until space becomes available.
    - If the queue is **empty**, the consumer thread is blocked until an item is added.
- **Threading**: It is **intrinsically thread-safe**.
- **Use Case**: Message queues, thread pools (e.g., `ThreadPoolExecutor` uses a `BlockingQueue`).

### Summary Comparison Table:

| Feature | PriorityQueue | BlockingQueue |
| :--- | :--- | :--- |
| **Primary Focus** | Element Priority | Thread Coordination |
| **Ordering** | Sorted / Priority order | Usually FIFO (depending on implementation) |
| **Thread Safety** | Not Thread-Safe | Fully Thread-Safe |
| **Blocking Behavior** | No (returns null or throws exception) | Yes (waits for space/elements) |
| **Implementation** | `PriorityQueue` class | `ArrayBlockingQueue`, `LinkedBlockingQueue` |

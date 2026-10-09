# Question:
# What is the difference between synchronizedCollection and ConcurrentHashMap?

## Explanation:

Both `Collections.synchronizedCollection()` and `ConcurrentHashMap` provide thread-safe access to data, but they do so using very different locking strategies.

### 1. synchronizedCollection (Course-Grained Locking)
When you wrap a collection using `Collections.synchronizedList()` or `synchronizedMap()`, Java uses a **single, global lock** for the entire collection.

- **How it works**: Every time a thread wants to access any method (read or write), it must acquire the lock for the whole object.
- **Bottleneck**: If Thread A is reading one element, Thread B cannot even read a different element until Thread A is finished.
- **Performance**: Poor in high-concurrency environments.
- **Iteration**: You MUST manually synchronize on the collection object when iterating, or it will throw `ConcurrentModificationException`.

### 2. ConcurrentHashMap (Fine-Grained Locking)
`ConcurrentHashMap` uses **lock striping** and atomic operations.

- **How it works**: It doesn't lock the whole map. It locks only specific "buckets" or use CAS (Compare-And-Swap) for empty buckets.
- **Concurrency**: Multiple threads can write to different buckets simultaneously without blocking each other. Reads are generally lock-free.
- **Performance**: High throughput; significantly faster than synchronized collections.
- **Iteration**: Iterators are designed to be used concurrently and do not throw `ConcurrentModificationException`.

### Summary Comparison Table:

| Feature | synchronizedMap / Collection | ConcurrentHashMap |
| :--- | :--- | :--- |
| **Locking Level** | Entire Collection (Object-level) | Bucket-level (Segmented) |
| **Concurrency** | Single thread at a time | Multiple concurrent readers/writers |
| **Performance** | Slow (High contention) | Fast (Low contention) |
| **Iterators** | Fail-fast (Requires manual lock) | Weakly consistent (No lock needed) |
| **Nulls** | Depends on underlying map | Not Allowed |

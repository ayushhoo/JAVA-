# Question:
# What are the differences between CopyOnWriteArrayList and ArrayList?

## Explanation:

`CopyOnWriteArrayList` is a thread-safe variant of `ArrayList` designed for scenarios where you read data far more often than you modify it.

### 1. ArrayList (Standard)
- **Behavior**: Modifies the array in place.
- **Thread Safety**: Not thread-safe. Modifying the list while iterating over it results in a `ConcurrentModificationException`.
- **Performance**: Very fast for both reads and writes.

### 2. CopyOnWriteArrayList (Thread-Safe)
- **Behavior**: Every time the list is modified (add, set, remove), it creates a **fresh copy** of the entire underlying array.
- **Thread Safety**: Fully thread-safe. Iterators operate on a "snapshot" of the array from the moment the iterator was created. Even if the list is modified while you are iterating, the iterator keeps reading the old copy.
- **Performance**: 
    - **Reads**: Extremely fast (O(1)).
    - **Writes**: Extremely slow (O(n)) because it copies the whole array on every write.

### Summary Comparison Table:

| Feature | ArrayList | CopyOnWriteArrayList |
| :--- | :--- | :--- |
| **Thread Safety** | Not Thread-Safe | Fully Thread-Safe |
| **Write Strategy** | In-place modification | Copy-on-write (New array) |
| **Iteration** | Fail-fast (throws exception) | Snapshot (no exception) |
| **Write Performance**| Very Fast | Very Slow |
| **Read Performance** | Very Fast | Very Fast |
| **Best Use Case** | Single-threaded apps | Lists that rarely change but are read often |

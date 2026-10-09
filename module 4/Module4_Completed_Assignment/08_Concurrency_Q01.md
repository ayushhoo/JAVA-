# Question:
# How is Vector different from ArrayList in terms of thread safety?

## Explanation:

The primary difference between `Vector` and `ArrayList` regarding thread safety is **Synchronization**.

### 1. Vector (Thread-Safe)
`Vector` is synchronized. This means that almost every public method in the `Vector` class (such as `add()`, `get()`, `remove()`) is marked with the `synchronized` keyword.
- **What this means**: When one thread is modifying or reading from a `Vector`, it acquires a lock on the object. Any other thread attempting to access the `Vector` must wait until the first thread releases the lock.
- **Benefit**: It prevents data corruption (race conditions) when multiple threads access the same list.
- **Cost**: Significant performance overhead due to the locking/unlocking process, even if only one thread is using the list.

### 2. ArrayList (Not Thread-Safe)
`ArrayList` is not synchronized. It does not use any internal locking mechanisms.
- **What this means**: Multiple threads can read and write to an `ArrayList` simultaneously.
- **Risk**: If one thread is adding an element while another is reading, it can lead to a `ConcurrentModificationException` or unpredictable data corruption.
- **Benefit**: Much faster performance because there is no synchronization overhead.
- **Solution**: If thread safety is needed for an `ArrayList`, it can be wrapped using `Collections.synchronizedList()`.

### Summary Comparison:

| Feature | Vector | ArrayList |
| :--- | :--- | :--- |
| **Thread Safety** | Thread-safe (Synchronized) | Not Thread-safe |
| **Performance** | Slower | Faster |
| **Locking** | Object-level lock | No locking |
| **Recommendation** | Legacy; avoid in modern code | Standard for single-threaded use |

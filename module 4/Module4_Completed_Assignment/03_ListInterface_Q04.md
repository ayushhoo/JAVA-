# Question:
# What is the role of the Vector class, and how does it differ from ArrayList?

## Explanation:

`Vector` is a legacy class that implements the `List` interface. It was present in Java 1.0, whereas `ArrayList` was introduced later as part of the Collection Framework.

### The Role of Vector
`Vector` is used to store a dynamic array of objects. Its primary distinguishing characteristic is that it is **synchronized**. This means that multiple threads can safely access a `Vector` without causing data corruption, as every method in `Vector` is synchronized.

### Differences between Vector and ArrayList

#### 1. Thread Safety (Synchronization)
- **Vector**: Synchronized. It is thread-safe, meaning only one thread can access a `Vector` method at a time.
- **ArrayList**: Not synchronized. It is not thread-safe. If multiple threads modify an `ArrayList` concurrently, it may lead to inconsistent states.

#### 2. Performance
- **Vector**: Slower. Because of the synchronization overhead (locking/unlocking), `Vector` is generally slower than `ArrayList`.
- **ArrayList**: Faster. Since there is no synchronization overhead, it is the preferred choice for single-threaded applications.

#### 3. Growth Strategy (Resizing)
- **Vector**: By default, when a `Vector` reaches its capacity, it **doubles** its size (100% increase).
- **ArrayList**: When an `ArrayList` reaches its capacity, it grows by roughly **50%** of its current size.

#### 4. Legacy Status
- **Vector**: Considered a legacy class. While still available for backward compatibility, it is rarely used in modern Java.
- **ArrayList**: The modern standard for dynamic arrays.

### Summary Comparison Table:

| Feature | Vector | ArrayList |
| :--- | :--- | :--- |
| **Thread Safety** | Synchronized (Safe) | Not Synchronized (Unsafe) |
| **Performance** | Slower | Faster |
| **Growth Rate** | 100% (Doubles) | ~50% |
| **Introduced** | JDK 1.0 (Legacy) | JDK 1.2 (Collection Framework) |

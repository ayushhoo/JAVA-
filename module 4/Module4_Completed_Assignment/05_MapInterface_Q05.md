# Question:
# What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?

## Explanation:

`Hashtable` and `HashMap` both implement the `Map` interface and use a hash table for storage. However, they have several key differences that make `HashMap` the preferred choice in almost all modern Java applications.

### Differences between Hashtable and HashMap

#### 1. Thread Safety (Synchronization)
- **Hashtable**: Synchronized. Every method in `Hashtable` is synchronized, meaning it is thread-safe but carries a performance penalty.
- **HashMap**: Not synchronized. It is not thread-safe. If concurrent access is needed, developers use `ConcurrentHashMap` or wrap it using `Collections.synchronizedMap()`.

#### 2. Null Handling
- **Hashtable**: Does **not** allow `null` keys or `null` values. Attempting to put a null key or value will throw a `NullPointerException`.
- **HashMap**: Allows **one `null` key** and multiple `null` values.

#### 3. Performance
- **Hashtable**: Slower due to synchronization overhead.
- **HashMap**: Faster because it lacks synchronization.

#### 4. Growth Strategy
- **Hashtable**: Uses a slightly different default capacity and load factor logic compared to the modern `HashMap`.

### Why is Hashtable considered "Legacy"?

`Hashtable` is considered a legacy class because it was introduced in Java 1.0, before the official Collection Framework was established in Java 1.2. 

1. **Poor Performance**: Forcing synchronization on every single operation is inefficient. Most applications are single-threaded or handle synchronization at a higher level.
2. **Better Alternatives**: `HashMap` provides the same functionality with better performance. For thread-safety, `ConcurrentHashMap` was introduced in Java 5, which is far more efficient than `Hashtable` because it locks only segments of the map rather than the entire object.
3. **Interface Misalignment**: While `Hashtable` now implements `Map`, its internal design reflects an older era of Java.

### Summary Comparison Table:

| Feature | Hashtable | HashMap |
| :--- | :--- | :--- |
| **Thread Safe** | Yes (Synchronized) | No |
| **Null Key/Value** | Not Allowed | Allowed |
| **Performance** | Slower | Faster |
| **Legacy Status** | Legacy (JDK 1.0) | Modern (JDK 1.2) |
| **Modern Alternative** | `ConcurrentHashMap` | `HashMap` |

# Question:
# What is the role of WeakHashMap in Java, and how is it different from HashMap?

## Explanation:

`WeakHashMap` is a specialized implementation of the `Map` interface where the **keys are stored as Weak References**.

### The Concept of Weak References
In a standard `HashMap`, the map holds a **strong reference** to its keys. This means as long as the map exists, the keys cannot be garbage collected, even if no other part of the program is using them. This can lead to memory leaks in large applications.

A **Weak Reference** is a reference that does not prevent its referent from being reclaimed by the Garbage Collector (GC).

### How WeakHashMap Works:
In a `WeakHashMap`, if a key is no longer strongly referenced anywhere else in the program, the Garbage Collector is free to remove that key and its associated value from the map automatically.

### Key Differences:

| Feature | HashMap | WeakHashMap |
| :--- | :--- | :--- |
| **Key Reference** | Strong Reference | Weak Reference |
| **GC Behavior** | Keeps keys alive as long as the map exists | Allows keys to be GC'ed if not used elsewhere |
| **Memory Leak Risk**| Higher (if keys aren't manually removed) | Lower (automatic cleanup) |
| **Use Case** | General purpose data storage | Caching, metadata storage |

### Practical Example (Cache):
Imagine you are caching metadata for expensive objects. If you use a `HashMap`, the metadata stays in memory even after the main object is destroyed. If you use a `WeakHashMap` with the main object as the key, the metadata is automatically wiped from memory the moment the main object is garbage collected.

# Question:
# What are the key interfaces in the Java Collection Framework, and how are they related?

## Explanation:

The Java Collection Framework (JCF) is structured as a hierarchy of interfaces, allowing for a consistent way to handle different types of data groups.

### The Hierarchy

1. **Iterable (Root Interface)**: 
   The absolute root. Any class implementing `Iterable` can be the target of the "for-each loop" statement. It defines the `iterator()` method.

2. **Collection (Base Interface)**: 
   Extends `Iterable`. It defines the most common operations for all collections (add, remove, size, clear).

3. **The Three Main Sub-Interfaces**:
   - **List**: Extends `Collection`. An ordered collection (sequence) that can contain duplicate elements. Elements are accessed by their integer index.
   - **Set**: Extends `Collection`. A collection that cannot contain duplicate elements. It models the mathematical set abstraction.
   - **Queue**: Extends `Collection`. Designed for holding elements prior to processing. Typically follows First-In-First-Out (FIFO) order.

4. **Specialized Extensions**:
   - **SortedSet / NavigableSet**: Extend `Set` (e.g., `TreeSet`). They maintain elements in a sorted order.
   - **Deque (Double Ended Queue)**: Extends `Queue`. Supports element insertion and removal at both ends (e.g., `ArrayDeque`).

### The Map Interface (Separate Hierarchy)
`Map` does **not** extend `Collection`. It is a separate hierarchy because it stores key-value pairs rather than single elements. However, it is still part of the Collection Framework because it follows the same design principles and uses `Collection` for its `values()` and `keySet()` methods.

### Relationship Map:
`Iterable` $\rightarrow$ `Collection` $\rightarrow$ (`List`, `Set`, `Queue`)
- `Set` $\rightarrow$ `SortedSet` $\rightarrow$ `NavigableSet`
- `Queue` $\rightarrow$ `Deque`
- `Map` (Standalone root for key-value pairs)

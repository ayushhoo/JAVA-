# Question:
# Explain the differences between Collection and Collections in java.util.

## Explanation:

Despite their similar names, `Collection` and `Collections` are entirely different entities in Java.

### 1. Collection (Interface)
`Collection` is the **root interface** of the Java Collection Framework. It defines the basic operations that all collections (except Maps) must support.

- **Type**: Interface.
- **Purpose**: To provide a common set of methods for all collection types.
- **Key Sub-interfaces**: `List`, `Set`, and `Queue`.
- **Common Methods**: `add()`, `remove()`, `size()`, `clear()`, `isEmpty()`, and `iterator()`.
- **Example**: `Collection<String> list = new ArrayList<>();`

### 2. Collections (Utility Class)
`Collections` is a **utility class** that consists exclusively of static methods that operate on or return collections.

- **Type**: Class (Final class with a private constructor).
- **Purpose**: To provide helper methods for manipulating collections.
- **Key Methods**: `sort()`, `binarySearch()`, `reverse()`, `shuffle()`, `max()`, `min()`, and `unmodifiableList()`.
- **Example**: `Collections.sort(myList);`

### Summary Comparison Table:

| Feature | Collection | Collections |
| :--- | :--- | :--- |
| **Nature** | Interface | Utility Class |
| **Hierarchy** | Root of the Collection Framework | Extends `Object` |
| **Methods** | Abstract methods (to be implemented) | Static methods (ready to use) |
| **Role** | Defines how a collection behaves | Provides tools to manipulate collections |
| **Relationship** | `List`, `Set`, `Queue` extend it | It operates on `Collection` objects |

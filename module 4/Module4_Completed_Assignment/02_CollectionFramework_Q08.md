# Question:
# Explain the differences between Set, List, and Queue in the Collection Framework.

## Explanation:

`List`, `Set`, and `Queue` are the three main sub-interfaces of the `Collection` interface. Each is designed for a specific purpose.

### 1. List (The Sequence)
A `List` is an ordered collection that allows duplicate elements. It is essentially a sequence.

- **Ordering**: Maintains the insertion order.
- **Duplicates**: Allowed.
- **Access**: Positional access via index (e.g., `list.get(0)`).
- **Primary Use Case**: When the order of elements matters and duplicates are acceptable.
- **Common Implementations**: `ArrayList`, `LinkedList`, `Vector`.

### 2. Set (The Mathematical Set)
A `Set` is a collection that cannot contain duplicate elements. It models the mathematical set.

- **Ordering**: Generally does not guarantee order (except `LinkedHashSet` and `TreeSet`).
- **Duplicates**: Not allowed.
- **Access**: No positional access. You check if an element exists using `contains()`.
- **Primary Use Case**: When you need to ensure uniqueness of elements.
- **Common Implementations**: `HashSet`, `LinkedHashSet`, `TreeSet`.

### 3. Queue (The Processing Line)
A `Queue` is designed for holding elements prior to processing, typically in a specific order.

- **Ordering**: Typically First-In-First-Out (FIFO), though `PriorityQueue` orders by priority.
- **Duplicates**: Allowed.
- **Access**: Only the "head" of the queue is typically accessed (peek/poll).
- **Primary Use Case**: When elements need to be processed in the order they arrived.
- **Common Implementations**: `PriorityQueue`, `LinkedList` (which implements both List and Queue).

### Summary Comparison Table:

| Feature | List | Set | Queue |
| :--- | :--- | :--- | :--- |
| **Duplicates** | Allowed | Not Allowed | Allowed |
| **Ordering** | Insertion Order | Unordered (usually) | FIFO / Priority |
| **Positional Access** | Yes (index) | No | No (head only) |
| **Key Operation** | `get(index)` | `add()` / `contains()` | `poll()` / `offer()` |

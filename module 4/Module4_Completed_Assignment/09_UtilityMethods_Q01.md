# Question:
# What are some commonly used methods in the Collections utility class?

## Explanation:

The `java.util.Collections` class is a utility class that consists exclusively of static methods that operate on or return collections. It provides high-performance algorithms that save developers from writing boilerplate code.

### Most Commonly Used Methods:

#### 1. Sorting and Ordering
- `sort(List<T> list)`: Sorts the specified list into ascending order.
- `reverse(List<?> list)`: Reverses the order of elements in the list.
- `shuffle(List<?> list)`: Randomly permutes the list (useful for games or random sampling).

#### 2. Searching and Extreme Values
- `binarySearch(List<? extends Comparable> list, T key)`: Searches for a key using the binary search algorithm (requires the list to be sorted).
- `max(Collection<? extends T> coll)`: Returns the maximum element based on natural ordering.
- `min(Collection<? extends T> coll)`: Returns the minimum element based on natural ordering.

#### 3. Frequency and Modification
- `frequency(Collection<?> coll, Object o)`: Returns the number of times a specific element appears in the collection.
- `fill(List<? super T> list, T obj)`: Replaces all elements of the list with the specified element.
- `swap(List<?> list, int i, int j)`: Swaps the elements at the specified positions.

#### 4. Safety and Wrappers
- `unmodifiableList()`, `unmodifiableSet()`, `unmodifiableMap()`: Returns a read-only view of the collection.
- `synchronizedList()`, `synchronizedSet()`, `synchronizedMap()`: Returns a thread-safe version of the collection.

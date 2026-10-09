# Question:
# What is the purpose of the Comparator and Comparable interfaces in the java.util package?

## Explanation:

Both `Comparable` and `Comparator` are used for sorting objects in Java, but they serve different purposes and are used in different scenarios.

### 1. Comparable Interface (Internal Sorting)
The `Comparable` interface is used to define the **natural ordering** of a class. A class that implements `Comparable` is saying, "I know how to compare myself to another object of the same type."

- **Method**: `compareTo(T o)`
- **Usage**: Implemented inside the class you want to sort.
- **Control**: You have control over the class code.
- **Limitation**: You can only define one natural sorting order (e.g., always sort Students by ID).
- **Example**: `Collections.sort(studentList);`

### 2. Comparator Interface (External Sorting)
The `Comparator` interface is used to define **custom ordering**. It is a separate class that compares two objects of another class.

- **Method**: `compare(T o1, T o2)`
- **Usage**: Implemented in a separate class or as a lambda expression.
- **Control**: You can use it even if you don't have access to the source code of the class you are sorting.
- **Flexibility**: You can define multiple different sorting criteria (e.g., one comparator for sorting by Name, another for sorting by Marks).
- **Example**: `Collections.sort(studentList, new NameComparator());`

### Summary Comparison Table:

| Feature | Comparable | Comparator |
| :--- | :--- | :--- |
| **Definition** | Natural ordering | Custom ordering |
| **Package** | `java.lang` | `java.util` |
| **Method** | `compareTo(T o)` | `compare(T o1, T o2)` |
| **Implementation** | Implemented by the class itself | Implemented in a separate class |
| **Flexibility** | Single sorting sequence | Multiple sorting sequences |
| **Calling method** | `Collections.sort(list)` | `Collections.sort(list, comparator)` |

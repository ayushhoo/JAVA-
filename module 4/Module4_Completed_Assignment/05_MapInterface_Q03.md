# Question:
# How does HashMap handle collisions?

## Explanation:

In a `HashMap`, a **collision** occurs when two different keys produce the same hash code (or map to the same bucket index in the internal array). Since each bucket can only hold one primary reference, Java uses a technique called **Chaining** to handle this.

### The Process of Handling Collisions:

#### 1. Chaining via Linked Lists (Traditional Approach)
When a collision occurs, the `HashMap` does not overwrite the existing value. Instead, it stores the new key-value pair in a **Linked List** at that bucket location.
- The first entry in the bucket is the head of the list.
- Every new entry that collides with that bucket is appended to the end of the list.
- **Retrieval**: To find a value, Java calculates the hash $\rightarrow$ finds the bucket $\rightarrow$ iterates through the linked list and uses `equals()` to find the exact key.

#### 2. Treeification (Modern Approach - Java 8+)
If a bucket becomes too crowded (i.e., the linked list grows too long), performance degrades from $O(1)$ to $O(n)$. To fix this, Java 8 introduced **Treeification**.
- **The Threshold**: When a bucket's linked list reaches a threshold of **8 elements**, Java converts the linked list into a **Balanced Red-Black Tree**.
- **Benefit**: This improves the worst-case search time from $O(n)$ (linear search in a list) to **O(log n)** (binary search in a tree).
- **Untreeification**: If elements are removed and the tree size drops below **6**, it is converted back into a linked list to save memory.

### Summary of Workflow:
1. **Hash $\rightarrow$ Bucket**.
2. **Bucket empty?** $\rightarrow$ Store element.
3. **Bucket occupied?** $\rightarrow$ Use `equals()` to check if it's the same key.
4. **Same key?** $\rightarrow$ Update value.
5. **Different key?** $\rightarrow$ Add to Linked List.
6. **List too long ($\ge 8$)?** $\rightarrow$ Convert list to Red-Black Tree.

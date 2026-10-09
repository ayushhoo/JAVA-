# Question:
# What is the significance of equals() and hashCode() methods in HashSet?

## Explanation:

The `equals()` and `hashCode()` methods are the foundation of how a `HashSet` (and `HashMap`) maintains uniqueness and ensures efficient lookup. They work together as a "two-step verification" process.

### 1. The Role of `hashCode()` (The First Filter)
The `hashCode()` method returns an integer representing the object. `HashSet` uses this integer to determine which "bucket" in its internal array the object should be placed in.

- **Speed**: Comparing integers is extremely fast. If two objects have different hash codes, they **cannot** be equal. The `HashSet` can immediately determine that the objects are different without ever calling `equals()`.
- **Distribution**: A good hash function distributes objects evenly across buckets to avoid "collisions" (when different objects land in the same bucket).

### 2. The Role of `equals()` (The Final Verdict)
The `equals()` method defines what it actually means for two objects to be "the same."

- **Precision**: Since different objects can occasionally have the same hash code (a collision), the `HashSet` uses `equals()` to check every object in the targeted bucket.
- **Uniqueness**: If `equals()` returns `true`, the `HashSet` knows the object is a duplicate and rejects it.

### The "Contract" between `hashCode()` and `equals()`
For a `HashSet` to work correctly, a class must follow the **HashCode Contract**:
1. If `obj1.equals(obj2)` is `true`, then `obj1.hashCode()` **must** be equal to `obj2.hashCode()`.
2. If `obj1.hashCode() == obj2.hashCode()`, it does **not** necessarily mean they are equal (this is a collision).

### What happens if the contract is broken?
- **If `equals()` is overridden but `hashCode()` is not**: Two objects that are logically equal will have different hash codes. They will land in different buckets, and the `HashSet` will fail to detect the duplicate, allowing both into the set.
- **If `hashCode()` is overridden but `equals()` is not**: Two objects might land in the same bucket, but `equals()` (which defaults to comparing memory addresses) will return `false`. The `HashSet` will treat them as different objects even if they are logically the same.

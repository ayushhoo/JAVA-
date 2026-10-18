// Section: Java Annotations and Its Types
// Question: Name three built-in Java annotations and their uses.
Question: Name three built-in Java annotations and their uses.
Answer:
1. @Override - Used on a method to show that it overrides a method from a parent class. It helps the compiler catch mistakes if the method signature does not match the parent method.
2. @Deprecated - Used on a method, class, or field to show that it is outdated and should no longer be used. The compiler will warn you if you use it.
3. @SuppressWarnings - Used to tell the compiler to ignore specific warnings, such as unchecked cast warnings or unused variable warnings.

Example:
class Parent {
    void greet() {
        System.out.println("Hello from parent");
    }
}

class Child extends Parent {
    // @Override tells the compiler this method overrides the parent method.
    @Override
    void greet() {
        System.out.println("Hello from child");
    }

    // @Deprecated marks this method as outdated.
    @Deprecated
    void oldMethod() {
        System.out.println("This method is old");
    }

    // @SuppressWarnings hides the unchecked warning for this line.
    @SuppressWarnings("unchecked")
    void useUnsafeCast() {
        Object o = new String("text");
        String s = (String) o;
        System.out.println(s);
    }
}
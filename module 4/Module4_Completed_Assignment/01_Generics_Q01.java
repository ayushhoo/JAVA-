/*
 * Question:
 * What is the purpose of generics in Java, and how do they improve type safety and code reusability?
 * Explain the syntax for creating a user-defined generic class in Java. Provide an example.
 */

/**
 * Explanation:
 *
 * Purpose of Generics:
 * Generics allow types (classes and interfaces) to be parameters when defining classes, interfaces, and methods.
 * This means you can create a single class, interface, or method that can work with different types of data.
 *
 * How they improve Type Safety:
 * Without generics, you would have to use the Object class and perform explicit casting, which is
 * error-prone and can lead to ClassCastException at runtime. Generics move these checks to compile-time,
 * ensuring that only the correct type of object is added to a collection or passed to a method.
 *
 * How they improve Code Reusability:
 * You can write a single implementation of a class or method that works with any data type,
 * avoiding the need to write separate versions of the same logic for Integers, Strings, etc.
 *
 * Syntax:
 * To create a generic class, you add a type parameter in angle brackets <T> after the class name.
 * 'T' is a placeholder for the actual type that will be provided when the class is instantiated.
 */

class GenericContainer<T> {
    private T content;

    public void add(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public static void main(String[] args) {
        // Using the generic class with Integer
        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.add(10);
        System.out.println("Integer Value: " + intContainer.get());

        // Using the same generic class with String
        GenericContainer<String> strContainer = new GenericContainer<>();
        strContainer.add("Hello Generics");
        System.out.println("String Value: " + strContainer.get());
    }
}

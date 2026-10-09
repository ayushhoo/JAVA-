/*
 * Question:
 * What is the difference between ? extends T and ? super T in generics?
 * Provide an example of when to use each.
 */

/**
 * Explanation:
 *
 * 1. Upper Bounded Wildcard (? extends T):
 *    - It means "any type that is T or a subclass of T".
 *    - Use case: When you want to READ from a collection of T or its subclasses.
 *    - Restriction: You cannot add elements to a collection defined with '? extends T'
 *      (except for null) because the compiler doesn't know the specific subclass.
 *
 * 2. Lower Bounded Wildcard (? super T):
 *    - It means "any type that is T or a superclass of T".
 *    - Use case: When you want to WRITE (add) elements of type T or its subclasses to a collection.
 *    - Restriction: When reading, you can only be sure that the returned object is an Object.
 */

import java.util.*;

public class WildcardDemo {

    // Use '? extends Number' to read numbers regardless of specific subclass
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        // list.add(10); // COMPILE ERROR: Cannot add to 'extends' wildcard
    }

    // Use '? super Integer' to add integers to a list of Integer or its superclasses
    public static void addInteger(List<? super Integer> list) {
        list.add(10); // VALID: We can safely add an Integer
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        System.out.println("Printing Integer List:");
        printNumbers(intList);

        System.out.println("Printing Double List:");
        printNumbers(doubleList);

        List<Number> numList = new ArrayList<>();
        addInteger(numList);
        System.out.println("Number list after adding integers: " + numList);
    }
}

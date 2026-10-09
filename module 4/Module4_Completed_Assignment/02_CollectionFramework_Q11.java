/*
 * Question:
 * Write a program to iterate over a List of integers using:
 * A simple for loop
 * An enhanced for loop
 * A while loop with an Iterator
 */

import java.util.*;

public class ListIterationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("List of integers: " + numbers);
        System.out.println("--------------------------------------------------");

        // 1. Simple for loop
        System.out.println("1. Using Simple for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
        System.out.println();

        // 2. Enhanced for loop
        System.out.println("2. Using Enhanced for loop:");
        for (Integer num : numbers) {
            System.out.println("Value: " + num);
        }
        System.out.println();

        // 3. While loop with Iterator
        System.out.println("3. Using while loop with Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Value: " + iterator.next());
        }
    }
}

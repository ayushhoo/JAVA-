/*
 * Question:
 * Write a program to implement a Stack using the Stack class.
 * Perform operations like push, pop, peek, and check if it is empty.
 */

import java.util.*;

public class StackOperationDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("--- Stack Operations Demo ---");

        // push: Add elements to top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push(10, 20, 30): " + stack);

        // peek: Look at top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // pop: Remove and return top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop(): " + stack);

        // isEmpty: Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Popping remaining elements
        stack.pop();
        stack.pop();
        System.out.println("After popping all: " + stack);
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}

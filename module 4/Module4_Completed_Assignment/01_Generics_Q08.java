/*
 * Question:
 * Develop a user-defined generic class Stack<T> that provides standard stack operations
 * like push(T item), pop(), and peek(). Demonstrate with integers and strings.
 */

import java.util.ArrayList;
import java.util.EmptyStackException;

class MyGenericStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        // Integer Stack
        System.out.println("--- Integer Stack ---");
        MyGenericStack<Integer> intStack = new MyGenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Is Empty? " + intStack.isEmpty());

        // String Stack
        System.out.println("\n--- String Stack ---");
        MyGenericStack<String> strStack = new MyGenericStack<>();
        strStack.push("Java");
        strStack.push("Python");
        strStack.push("C++");
        System.out.println("Peek: " + strStack.peek());
        System.out.println("Pop: " + strStack.pop());
        System.out.println("Size: " + strStack.size());
    }
}

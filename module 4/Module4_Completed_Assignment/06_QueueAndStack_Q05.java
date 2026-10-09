/*
 * Question:
 * Write a program to check if a string is a palindrome using a Deque.
 */

import java.util.*;

public class PalindromeDequeDemo {
    public static boolean isPalindrome(String text) {
        // Remove case sensitivity and non-alphanumeric characters for better testing
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Add each character of the string to the deque
        for (char c : cleanText.toCharArray()) {
            deque.addLast(c);
        }

        // Compare elements from both ends until only one or zero remain
        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                return false; // Not a palindrome
            }
        }

        return true; // All matched
    }

    public static void main(String[] args) {
        String[] testStrings = {"Racecar", "Hello", "A man a plan a canal Panama", "Java", "Madam"};

        for (String s : testStrings) {
            System.out.println("Is \"" + s + "\" a palindrome? " + isPalindrome(s));
        }
    }
}

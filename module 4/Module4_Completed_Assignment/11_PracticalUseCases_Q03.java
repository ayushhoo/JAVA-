/*
 * Question:
 * Write a program to count the frequency of characters in a string using a HashMap.
 */

import java.util.*;

public class CharFrequencyCounter {
    public static void main(String[] args) {
        String input = "Hello World! Welcome to Java Programming";
        System.out.println("Input String: " + input);

        // HashMap: Key = Character, Value = Frequency (Count)
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Convert string to char array and iterate
        for (char c : input.toCharArray()) {
            // Ignore spaces for cleaner output
            if (c == ' ') continue;

            // If char exists, increment count; otherwise set to 1
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("\nCharacter Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

/*
 * Question:
 * Write a program to shuffle and sort an ArrayList using methods from the Collections class.
 */

import java.util.*;

public class CollectionSortShuffleDemo {
    public static void main(String[] args) {
        List<String> deck = new ArrayList<>(Arrays.asList(
            "Ace of Spades", "King of Hearts", "Queen of Diamonds",
            "Jack of Clubs", "10 of Hearts", "2 of Spades", "5 of Clubs"
        ));

        System.out.println("Initial List: " + deck);

        // 1. Sorting the list alphabetically
        Collections.sort(deck);
        System.out.println("\nSorted List (Alphabetical): " + deck);

        // 2. Shuffling the list (randomly permuting)
        Collections.shuffle(deck);
        System.out.println("\nShuffled List (Random Order): " + deck);
    }
}

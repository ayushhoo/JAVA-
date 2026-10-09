/*
 * Question:
 * Implement a simple program using Queue (with LinkedList) to simulate a ticket booking system.
 */

import java.util.*;

public class TicketBookingSystem {
    public static void main(String[] args) {
        // Queue is an interface; LinkedList implements Queue
        Queue<String> ticketQueue = new LinkedList<>();

        System.out.println("--- Welcome to the Movie Ticket Booking System ---");

        // Customers arrive and join the queue
        ticketQueue.add("Customer 1: Alice");
        ticketQueue.add("Customer 2: Bob");
        ticketQueue.add("Customer 3: Charlie");
        ticketQueue.add("Customer 4: Diana");

        System.out.println("Current Queue: " + ticketQueue);

        // Processing customers in order (FIFO)
        while (!ticketQueue.isEmpty()) {
            String currentCustomer = ticketQueue.poll(); // Removes and returns the head
            System.out.println("Processing ticket for: " + currentCustomer + ". Ticket issued!");
            System.out.println("Remaining Queue: " + ticketQueue);
        }

        System.out.println("\nAll tickets have been issued. Queue is empty.");
    }
}

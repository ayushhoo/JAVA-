/*
 * Question:
 * Use a PriorityQueue to store a list of tasks with priorities.
 * Add tasks, remove the highest-priority task, and print the queue.
 */

import java.util.*;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Natural ordering: Lower number = Higher Priority (e.g., 1 is highest)
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class PriorityTaskSystem {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>();

        // Adding tasks with different priorities
        pq.add(new Task("Fix Critical Bug", 1));
        pq.add(new Task("Update Documentation", 3));
        pq.add(new Task("Email Client", 2));
        pq.add(new Task("Check Emails", 4));

        System.out.println("Initial PriorityQueue: " + pq);
        System.out.println("\nProcessing tasks based on priority...");

        // Removing highest priority (lowest number)
        while (!pq.isEmpty()) {
            Task current = pq.poll();
            System.out.println("Processing: " + current);
        }
    }
}

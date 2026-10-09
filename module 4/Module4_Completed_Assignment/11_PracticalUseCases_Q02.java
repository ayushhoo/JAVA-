/*
 * Question:
 * Implement a basic to-do list application using ArrayList to store tasks.
 * Add functionality to add, remove, and display tasks.
 */

import java.util.*;

public class TodoListApp {
    private static List<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("--- Welcome to the Basic To-Do List App ---");

        while (running) {
            System.out.println("\n1. Add Task | 2. Remove Task | 3. Display Tasks | 4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    scanner.nextLine(); // consume newline
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("List is empty. Nothing to remove.");
                    } else {
                        System.out.println("Current Tasks: " + tasks);
                        System.out.print("Enter task index to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < tasks.size()) {
                            String removed = tasks.remove(index);
                            System.out.println("Removed task: " + removed);
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;
                case "3":
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty.");
                    } else {
                        System.out.println("\n--- Your To-Do List ---");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

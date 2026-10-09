/*
 * Question:
 * Create a program to implement a book catalog system using HashMap, where
 * book titles are the keys and author names are the values. Allow searching by title.
 */

import java.util.*;

public class BookCatalogSystem {
    public static void main(String[] args) {
        HashMap<String, String> catalog = new HashMap<>();

        // Adding books to catalog
        catalog.put("The Great Gatsby", "F. Scott Fitzgerald");
        catalog.put("1984", "George Orwell");
        catalog.put("The Hobbit", "J.R.R. Tolkien");
        catalog.put("Clean Code", "Robert C. Martin");

        System.out.println("--- Welcome to the Book Catalog System ---");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Book | 2. Search by Title | 3. Display All | 4. Exit");
            System.out.print("Choice: ");
            String choice = scanner.next();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case "1":
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    catalog.put(title, author);
                    System.out.println("Book added successfully!");
                    break;
                case "2":
                    System.out.print("Enter Title to search: ");
                    String searchTitle = scanner.nextLine();
                    if (catalog.containsKey(searchTitle)) {
                        System.out.println("Author: " + catalog.get(searchTitle));
                    } else {
                        System.out.println("Book not found in catalog.");
                    }
                    break;
                case "3":
                    System.out.println("\n--- Current Catalog ---");
                    catalog.forEach((t, a) -> System.out.println(t + " by " + a));
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting catalog. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}

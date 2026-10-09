/*
 * Question:
 * Write a program to implement a simple banking system using Map to store
 * customer IDs and their account balances.
 */

import java.util.*;

public class SimpleBankingSystem {
    private static Map<String, Double> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("--- Welcome to the Simple Bank System ---");

        while (running) {
            System.out.println("\n1. Create Account | 2. Deposit | 3. Withdraw | 4. Check Balance | 5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.print("Enter Customer ID: ");
                    String id = scanner.next();
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists!");
                    } else {
                        accounts.put(id, 0.0);
                        System.out.println("Account created successfully.");
                    }
                    break;
                case "2":
                    System.out.print("Enter Customer ID: ");
                    String depId = scanner.next();
                    if (accounts.containsKey(depId)) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        accounts.put(depId, accounts.get(depId) + amount);
                        System.out.println("Deposit successful. New balance: " + accounts.get(depId));
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter Customer ID: ");
                    String withId = scanner.next();
                    if (accounts.containsKey(withId)) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        if (accounts.get(withId) >= amount) {
                            accounts.put(withId, accounts.get(withId) - amount);
                            System.out.println("Withdrawal successful. Remaining balance: " + accounts.get(withId));
                        } else {
                            System.out.println("Insufficient funds!");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "4":
                    System.out.print("Enter Customer ID: ");
                    String balId = scanner.next();
                    if (accounts.containsKey(balId)) {
                        System.out.println("Balance for " + balId + ": $" + accounts.get(balId));
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting Bank System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}

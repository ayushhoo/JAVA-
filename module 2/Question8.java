// Question 8: Create a custom exception InvalidAgeException that is thrown when a user's age is less than 18. Write a program to demonstrate its use.

// Source Code
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Question8 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid. Must be 18 or older.");
        } else {
            System.out.println("Age " + age + " is valid. Welcome!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

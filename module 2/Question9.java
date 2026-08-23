// Question 9: Create a custom exception InvalidAgeException that is thrown when a user's age is less than 18. Handle the exception and log the error to a file using java.util.logging.

// Source Code
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class InvalidAgeException2 extends Exception {
    InvalidAgeException2(String message) {
        super(message);
    }
}

public class Question9 {
    static Logger logger = Logger.getLogger(Question9.class.getName());

    static void setupLogger() {
        try {
            FileHandler fh = new FileHandler("error.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("Could not set up file logger: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException2 {
        if (age < 18) {
            throw new InvalidAgeException2("Age " + age + " is not valid. Must be 18 or older.");
        } else {
            System.out.println("Age " + age + " is valid.");
        }
    }

    public static void main(String[] args) {
        setupLogger();

        try {
            checkAge(15);
        } catch (InvalidAgeException2 e) {
            System.out.println("Exception: " + e.getMessage());
            logger.severe(e.getMessage());
        }

        try {
            checkAge(25);
        } catch (InvalidAgeException2 e) {
            System.out.println("Exception: " + e.getMessage());
            logger.severe(e.getMessage());
        }
    }
}

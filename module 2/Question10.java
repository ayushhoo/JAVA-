// Question 10: Demonstrate the use of throw and throws keywords in a program that calculates the factorial of a number. Throw an exception if the input number is negative.

// Source Code
class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

public class Question10 {
    static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Factorial is not defined for negative numbers: " + n);
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5 = " + factorial(5));
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Factorial of -3 = " + factorial(-3));
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Factorial of 0 = " + factorial(0));
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

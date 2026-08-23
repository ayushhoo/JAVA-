// Question 7: Write a program that demonstrates the difference between try-catch and try-catch-finally blocks by dividing two numbers and handling ArithmeticException.

// Source Code
public class Question7 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        System.out.println("Using try-catch only:");
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Using try-catch-finally:");
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}

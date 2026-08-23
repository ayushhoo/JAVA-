// Question 4: Use Calculator functional interface with lambdas for add, subtract, multiply.

package functionalinterface;

public class Question4 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        int x = 20;
        int y = 10;

        System.out.println("Addition = " + add.compute(x, y));
        System.out.println("Subtraction = " + subtract.compute(x, y));
        System.out.println("Multiplication = " + multiply.compute(x, y));
    }
}

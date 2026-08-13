// Question 4: Write a program to demonstrate method overloading and method overriding.
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void display() {
        System.out.println("Parent display");
    }
}

class AdvancedCalculator extends Calculator {
    void display() {
        System.out.println("Child display");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2: " + c.add(5, 10));
        System.out.println("Sum of 3: " + c.add(5, 10, 15));
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.display();
    }
}

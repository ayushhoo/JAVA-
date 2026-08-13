// Question 14: Implement a program to demonstrate the use of if-else, switch, and for loops.
public class Question14 {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative or zero");
        }

        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

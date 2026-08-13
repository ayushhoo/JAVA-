// Question 20: Write a program to find the largest of three numbers entered by the user.
public class Question20 {
    public static void main(String[] args) {
        int a = 25, b = 78, c = 42;
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest: " + largest);
    }
}

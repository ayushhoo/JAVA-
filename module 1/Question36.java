// Question 36: Write a program to demonstrate operator precedence in Java.
public class Question36 {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result);
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
    }
}

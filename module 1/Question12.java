// Question 12: Write a program to demonstrate the immutability of the String class.
public class Question12 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1 + " World";
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Different references, proving immutability.");
    }
}

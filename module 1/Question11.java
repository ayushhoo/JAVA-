// Question 11: Write a program that uses Java's StringBuilder for efficient string operations.
public class Question11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        System.out.println("Result: " + sb);
    }
}

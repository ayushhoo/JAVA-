// Question 17: Write a program to identify valid and invalid identifiers in Java.
public class Question17 {
    public static void main(String[] args) {
        int validName = 1;
        int _valid = 2;
        int $valid = 3;
        int valid123 = 4;
        System.out.println("Valid identifiers: " + validName + ", " + _valid + ", " + $valid + ", " + valid123);
        // int 123invalid = 5; // INVALID: starts with digit
        // int class = 6; // INVALID: reserved keyword
        // int my-var = 7; // INVALID: hyphen not allowed
        System.out.println("Invalid examples: 123invalid, class, my-var");
    }
}

// Question 47: Write a program to reverse a string without using built-in methods.
public class Question47 {
    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}

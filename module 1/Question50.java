// Question 50: Create a program to check if a given string is a palindrome.
public class Question50 {
    public static void main(String[] args) {
        String s = "level";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) System.out.println(s + " is a palindrome.");
        else System.out.println(s + " is not a palindrome.");
    }
}

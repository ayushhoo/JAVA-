// Question 22: Write a program to check if a given string or number is a palindrome.
public class Question22 {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(str + " is palindrome: " + isPalindrome(str));
    }
}

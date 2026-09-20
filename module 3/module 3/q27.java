// q27: Create a program that uses the Pattern and Matcher classes from the java.util.regex package to check if a given string is a valid email address.
import java.util.regex.*;

public class q27 {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is an invalid email address.");
        }
    }
}

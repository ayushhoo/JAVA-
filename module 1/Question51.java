// Question 51: Implement a program to split a string into words and print each word on a new line.
public class Question51 {
    public static void main(String[] args) {
        String s = "Java is a powerful programming language";
        String[] words = s.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}

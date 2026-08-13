// Question 49: Write a program to demonstrate the immutability of the String class.
public class Question49 {
    public static void main(String[] args) {
        String original = "Java";
        String modified = original.concat(" Programming");
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
        System.out.println("Original is unchanged, proving immutability.");
    }
}

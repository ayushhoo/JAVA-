// Question 48: Implement a program to count the frequency of characters in a string.
public class Question48 {
    public static void main(String[] args) {
        String s = "hello world";
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}

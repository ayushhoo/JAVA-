// q16: Create a program that writes a string into a file using the FileOutputStream. Ensure that the program writes the string "Java I/O Streams Example" to a file named output.txt.
import java.io.*;

public class q16 {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Successfully written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

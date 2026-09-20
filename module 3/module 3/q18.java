// q18: Write a program that writes a string to a file using the FileWriter class. The string should be written to a file named example.txt.
import java.io.*;

public class q18 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write("This is written using FileWriter.");
            System.out.println("Successfully written to example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

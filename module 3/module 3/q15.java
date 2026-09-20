// q15: Write a program that reads a text file using the FileInputStream and prints the contents to the console.
import java.io.*;

public class q15 {
    public static void main(String[] args) {
        try {
            // Create a dummy file first
            FileWriter fw = new FileWriter("byte_read.txt");
            fw.write("This is a Byte Stream read test.");
            fw.close();

            FileInputStream fis = new FileInputStream("byte_read.txt");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

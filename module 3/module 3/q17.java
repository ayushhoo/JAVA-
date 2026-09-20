// q17: Write a program that reads a file using the FileReader class and prints the contents of the file to the console.
import java.io.*;

public class q17 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("char_read.txt");
            fw.write("This is a Character Stream read test.");
            fw.close();

            FileReader fr = new FileReader("char_read.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

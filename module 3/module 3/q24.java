// q24: Create a program that uses the RandomAccessFile class to read and write to specific positions within a file.
import java.io.*;

public class q24 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
            raf.writeBytes("Hello World");
            System.out.println("Initial content written.");

            // Seek to position 6 to overwrite 'W'
            raf.seek(6);
            raf.writeBytes("J");

            raf.seek(0);
            String line = raf.readLine();
            System.out.println("Modified content: " + line);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

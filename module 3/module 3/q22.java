// q22: Create a program that copies the contents of one file to another using byte streams (FileInputStream and FileOutputStream).
import java.io.*;

public class q22 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Copying this content to destination.txt");
            fw.close();

            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

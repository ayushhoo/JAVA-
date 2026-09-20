// q23: Write a Java program that deletes a file from the system using the File class.
import java.io.*;

public class q23 {
    public static void main(String[] args) {
        try {
            File file = new File("delete_me.txt");
            file.createNewFile();
            System.out.println("File created for deletion test.");

            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

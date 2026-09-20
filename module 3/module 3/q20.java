// q20: Write a program that checks if a file exists in the system. If the file does not exist, create the file using the File class.
import java.io.*;

public class q20 {
    public static void main(String[] args) {
        File file = new File("check_existence.txt");
        try {
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                if (file.createNewFile()) {
                    System.out.println("File did not exist, so it was created.");
                } else {
                    System.out.println("File could not be created.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

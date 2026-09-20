// q21: Write a Java program that lists all files in a directory specified by the user. The program should handle exceptions appropriately.
import java.io.*;
import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory path (e.g. . for current): ");
        String path = sc.nextLine();

        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}

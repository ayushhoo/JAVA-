// q19: Modify the previous FileReader and FileWriter examples to use BufferedReader and BufferedWriter respectively to read from and write to the file, improving performance.
import java.io.*;

public class q19 {
    public static void main(String[] args) {
        try {
            // Writing with BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("Writing with buffered streams is more efficient!");
            bw.close();

            // Reading with BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("buffered.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

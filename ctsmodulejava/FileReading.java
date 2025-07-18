import java.io.*;

public class FileReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

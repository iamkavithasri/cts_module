import java.io.*;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String data = sc.nextLine();
        FileWriter fw = new FileWriter("output.txt");
        fw.write(data);
        fw.close();
        System.out.println("Data written to output.txt");
        sc.close();
    }
}

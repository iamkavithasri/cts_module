import java.io.*;
import java.net.*;

public class TcpChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        Socket client = server.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
        pw.println("Connected to server.");
        pw.println("Send 'bye' to quit.");
        String input;
        while (!(input = br.readLine()).equals("bye")) {
            System.out.println("Client: " + input);
        }
        client.close();
        server.close();
    }
}

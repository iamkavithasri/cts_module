import java.io.*;
import java.net.*;

public class TcpChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        String msg;
        while (!(msg = user.readLine()).equals("bye")) {
            pw.println(msg);
        }
        socket.close();
    }
}

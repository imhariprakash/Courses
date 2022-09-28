import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;


public class SocketClient{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8787);
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        String str = "Hello, I am client";

        while(!str.equals("stop")){
            str = scanner.nextLine();
            bos.write(str.getBytes());  // send to server
            bos.flush();
            System.out.println("From server : " + bis.read()); // read from server
        }

        bis.close();
        bos.close();
        socket.close();
        scanner.close();
    }
}
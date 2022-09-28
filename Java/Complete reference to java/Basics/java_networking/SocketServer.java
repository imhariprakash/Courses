import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.IOException;


public class SocketServer{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8787);
        Socket socket = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(bis));

        String str = "Hello Client";

        while(!str.equals("stop")){
            str = br.readLine();
            System.out.println("Client says : " + str);
            bos.write(str.getBytes());
            bos.flush();
        }

        bis.close();
        bos.close();
        socket.close();
        serverSocket.close();

    }
}
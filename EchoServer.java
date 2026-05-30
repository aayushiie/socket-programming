import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Client connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream());
            out.println("Server: " + str);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

import java.net.*;

public class ServerConnection {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

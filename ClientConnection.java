import java.net.*;

public class ClientConnection {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            Socket soc = new Socket("localhost", 9806);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
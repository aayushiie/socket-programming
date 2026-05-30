import java.net.*;
import java.io.*;

public class TwoWayServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(9806)) {
            System.out.println("S: Waiting for client...");
            Socket soc = ss.accept();
            System.out.println("S: Connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);

            String str = in.readLine();
            System.out.println("S: Client data: " + str);

            String nickname = str.substring(0, 3);
            out.println("Your nickname: " + nickname);

            in.close();
            out.close();
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

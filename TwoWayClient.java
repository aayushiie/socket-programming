import java.net.*;
import java.io.*;

public class TwoWayClient {
    public static void main(String[] args) {
        try (Socket soc = new Socket("localhost", 9806)) {
            System.out.println("Client connected");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            System.out.print("Enter your name: ");
            String str = userInput.readLine();
            out.println(str);

            System.out.println("Server replied: " + in.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.net.*;
import java.io.*;

public class ServerFactorial {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int num = Integer.parseInt(in.readLine());

            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Factorial: " + calcFactorial(num));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int calcFactorial(int num) {
        // if(num==1){
        // return 1;
        // }
        // return num*num-1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

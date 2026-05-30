import java.net.*;
import java.io.*;

public class ClientFactorial {
    public static void main(String[] args) {
        try{
            Socket soc = new Socket("localhost", 9806);
            System.out.println("Connected");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number whose factorial needs to be calculated:  ");
            int num = Integer.parseInt(userInput.readLine());

            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(num);

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

import java.io.*;
import java.net.*;

public class ClientTwo {
    public static void main(String args[]) throws IOException {
        // Connect to the server at localhost on port 7000 to receive the token
        Socket s = new Socket("localhost", 8000);
        PrintStream out = new PrintStream(s.getOutputStream());

        // Connect to ClientOne at localhost on port 7001 to pass the token
        Socket s2 = new Socket("localhost", 8001);
        BufferedReader in2 = new BufferedReader(new InputStreamReader(s2.getInputStream()));
        PrintStream out2 = new PrintStream(s2.getOutputStream());

        // Setup input stream for user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        // Infinite loop to continuously check for token and send/receive data
        while(true) {
            // Wait for the token from ClientOne
            System.out.println("Waiting for Token");
            str = in2.readLine();

            // If token received, check if user wants to send data
            if (str != null && str.equalsIgnoreCase("Token")) {
                System.out.println("Do you want to send some Data?");
                System.out.println("Enter Yes or No");
                str = br.readLine();

                // If user wants to send data, prompt for input and send it to the server
                if(str.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter the data:");
                    str = br.readLine();
                    out.println(str);
                }

                // Pass the token to ClientOne
                out2.println("Token");
            }
        }
    }
}

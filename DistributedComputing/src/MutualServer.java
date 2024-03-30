import java.io.*;
import java.net.*;
public class MutualServer implements Runnable {
    private Socket socket;
    public MutualServer(Socket newSocket) {
        this.socket = newSocket;
    }
    // Main method to start the server
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            System.out.println("Server Started");
            while (true) {
                Socket s = ss.accept();
                MutualServer mutualServer = new MutualServer(s);
                Thread t = new Thread(mutualServer);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Method to handle client communication
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

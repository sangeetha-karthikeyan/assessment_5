
import java.io.*;
import java.net.*;

public class App {

    private static final int PORT = 5000;

    public void startServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started on port " + PORT);
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");
        
        BufferedReader input = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter output = new PrintWriter(
            clientSocket.getOutputStream(), true
        );
        
        String message = input.readLine();
        System.out.println("Received: " + message);
        
        output.println("Echo: " + message);
        
        input.close();
        output.close();
        clientSocket.close();
        serverSocket.close();
    }

    public String echo(String message) {
        return "Echo: " + message;
    }

    public static void main(String[] args) throws IOException {
        App app = new App();
        app.startServer();
    }
}


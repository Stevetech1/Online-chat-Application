import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private static final int PORT = 5500; // Define server port
    private static int clientId = 1; // Unique user ID
    private static Set<ClientHandler> clientHandlers = new HashSet<>(); // List of connected clients

    public static void main(String[] args) {
        System.out.println("Chat server started...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connection
                ClientHandler clientHandler = new ClientHandler(clientSocket, clientId++);
                clientHandlers.add(clientHandler); // Add new client
                clientHandler.start(); // Handle client in a new thread
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }

    // Broadcast message to all clients
    private static void broadcastMessage(String message) {
        for (ClientHandler clientHandler : clientHandlers) {
            clientHandler.sendMessage(message);
        }
    }

    // Remove client from the active list
    private static void removeClient(ClientHandler clientHandler) {
        clientHandlers.remove(clientHandler);
    }

    // ClientHandler class to manage individual clients
    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private int userId;

        public ClientHandler(Socket socket, int userId) {
            this.socket = socket;
            this.userId = userId;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                out.println("Welcome! Your User ID is: " + userId);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("User " + userId + ": " + message);
                    broadcastMessage("User " + userId + ": " + message); // Send to all clients
                }
            } catch (IOException e) {
                System.err.println("Error handling client " + userId + ": " + e.getMessage());
            } finally {
                try {
                    socket.close();
                    removeClient(this); // Remove client from the list when disconnected
                } catch (IOException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }

        public void sendMessage(String message) {
            out.println(message); // Send message to the client
        }
    }
}

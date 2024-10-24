# Online-chat-Application

Overview
This is a simple Java-based chat application that allows multiple users to connect to a central server, send messages, and receive messages from other users in real time. The project demonstrates socket programming and multi-threading concepts in Java.

Files
ChatServer.java: The server-side implementation that handles connections and broadcasts messages to all clients.
ChatClient.java: The client-side implementation that connects to the server, sends user messages, and receives messages from other clients.
Instructions to Run the Application
Compile the Java Files:

Open a terminal/command prompt.
Navigate to the folder containing the .java files.
Compile the server and client using the following commands:

javac ChatServer.java
javac ChatClient.java
Run the Server:

Start the chat server by running:

java ChatServer
Run the Client:

In a separate terminal or command prompt, run the client:

java ChatClient
You can start multiple instances of ChatClient (in separate terminals) to simulate different users connecting to the server.

Chatting:

Once the client connects, each user can send a message by typing in the terminal. The message will be broadcasted to all connected clients.
The server assigns a unique user ID to each client upon connection.
Features
Multi-threaded server for handling multiple clients simultaneously.
Message broadcasting from one client to all other connected clients.
Simple text-based user interface for sending and receiving messages.
Screenshots
Please refer to the screenshots of the text-based user interface for both the client and the server (not provided in this README but should be submitted with the project).

Requirements
Java 8 or later.
Basic understanding of socket programming and multi-threading.
Credits
This chat application was developed as part of an assignment for demonstrating socket programming in Java.

4. Sample Output
Server Output

Chat server started...
User 1: Hello everyone!
User 2: Hi! How's it going?
User 3: I'm here too!
Client Output

Welcome! Your User ID is: 1
Hello everyone!
User 2: Hi! How's it going?
User 3: I'm here too!

# Online-chat-Application

This assignment aims to assess your skills in socket programming, client-server communication, and user interface design. 


Assignment Instructions
You are tasked with developing a simple online chat application using Java. The application should allow multiple users to connect to a central server, send messages, and receive messages from other users. 

Requirements: 

Server Implementation: 
a. Create a server class, ChatServer, using socket programming to manage connections from multiple clients. 

b. The server should be able to handle incoming connections, assign a unique user ID to each connected client, and maintain a list of connected users. 

Client Implementation: 
a. Implement a client class, ChatClient, that connects to the server using sockets. 

b. Each client should be able to send messages to the server, which will broadcast the messages to all connected clients. 

c. Clients should also be able to receive messages from other users. 

User Interface: 
a. Include a simple text-based for the client to facilitate message input and display.  



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

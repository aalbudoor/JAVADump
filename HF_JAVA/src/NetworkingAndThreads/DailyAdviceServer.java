package NetworkingAndThreads;

//This program makes a ServerSocket and waits for client requests
//when it gets a client request (i.e client said new Socket() for this application).
//The server makes a new socket connection to that client. 
//THe server makes a PrintWriter (using SocketOutputStrea) and sens a message to the client 

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans", "No they do not make you fat", "One word: innapropriate", 
			"Just for today be honest, tell your boss what you really think", "You might want to rethink that haircut" };
	
	public void go() {
		
		try {
			//ServerSocket makes the server application 'listen' for client rewuest on port
			//4242 on the machine the code is running on
			ServerSocket serverSock = new ServerSocket(4242);
			
			//The server goes on a permanant loop,
			//waiting and recieving for client requests
			
			while(true) {
				
				//The accept method blocks (just sits there) unitl a request comes in, and then the method returns 
				//a socket for communication with the client
				Socket sock = serverSock.accept();
				
				//Now we use the socket connection to the client to make a PrintWriter and send it (println())
				//a string advice message. Then we close the coket because we are done with this client
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}//close go
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main (String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
		
	}

}

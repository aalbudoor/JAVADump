package NetworkingAndThreads;
//The Advice guy is a server program that offfers up practical, insiprational tips to get you through those long days of coding

//Were building a client for The Advice guy program, whihc pulls message from the server each time it connects

//1. Connect: client connects to the server and gets an input dtream from it

//2. Read: Client reads a message from the server

//This program makes a socket, makes a BufferedREader (with the help of other Streams) and reaads a single line from 
//The server application (whatever is running at port 4242)

import java.io.*;
import java.net.*;


public class DailyAdviceClient {
	
	public void go() {
		
		try {
			//Make a socket connection to whatever is running on port 4242, on the same host
			//This code is running on.
			Socket s = new Socket("127.0.0.1", 4242);
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			//chain a bufferedReader to an InputStreamReader to the input Stream from the Socket
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);
			
			reader.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}

}

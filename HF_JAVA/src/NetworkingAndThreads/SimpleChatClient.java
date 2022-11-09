package NetworkingAndThreads;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient {
	
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleChatClient client = new SimpleChatClient();
		client.go();

	}
	
	public void go() {
		
		JFrame frame = new JFrame("Ludicrously Simple Chat client");
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15,20);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		outgoing = new JTextField(20);
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JButton sendButton = new JButton("send");
		sendButton.addActionListener(new sendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		
		//were strating a new thread, using new inner class as the Runnable (job)
		//for the thread, the threads job is to read from the servers
		//socket stream, displaying any incoming messages in the scrolling 
		//text area
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(800,500);
		frame.setVisible(true);
		//close go()
	}
	
	private void setUpNetworking() {
		//this is where we create the socket and the printWriter (its called from the go right before displaying the app gui)
		try {

			
			//were using the socket to get the input
			//and output streams. We were already using the output stream to send to the server,
			//but now we're using the input stream so that the new 'reader' thread can get messages from the server
			sock = new Socket("127.0.0.1", 5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Networking established");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}//close setUpNetworking
	
	public class SendButtonListener implements ActionListener {
		
		//Now we actually do the writing remmebr, the writer is chained to the output stream from the socket so whenever we do a println(),
		//it goes over the network to the server
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
			
			outgoing.setText("");
			outgoing.requestFocus();
		}

		
	}	//close SendButtonListener inner class
	
	
	//This is what the thread does
	
	//in the run() method, it stays in a loop (as long as what it gets from the server is not null), reading
	//a line at a time and adding each line to the scrolling text area (along with a new line character)
	
	public class IncomingReader implements Runnable {
		
		public void run() {
			String message;
			
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read " + message);
					incoming.append(message + "\n");
					
				}//close while
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}//close run
		
	}//close inner class 


}

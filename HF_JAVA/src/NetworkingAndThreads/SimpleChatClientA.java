package NetworkingAndThreads;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA {
	
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	public void go() {
		JFrame frame = new JFrame("Ludicrously Simple Chat client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("send");
		sendButton.addActionListener(new sendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(400,500);
		frame.setVisible(true);
		//close go()
	}
	
	private void setUpNetworking() {
		//this is where we create the socket and the printWriter (its called from the go right before displaying the app gui)
		try {
			//were using localHost so you can test, the client and server on one machine
			sock = new Socket("127.0.0.1", 5000);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleChatClientA().go();

	}

}

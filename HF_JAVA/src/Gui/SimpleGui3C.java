package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//THe circle changes color each time you click the button

public class SimpleGui3C implements ActionListener{
	
	JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
		

	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		//add the listener (this) to the button
		button.addActionListener(this); 
		
		MyDrawPanel drawPanel = new MyDrawPanel();// calls the class with the paintComponent() method which is called everytime the user clicks
		
		//Add the two widgets (button and drawing panel) to the two regions of the frame
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//when the user clicks, tell the frame
		// to repaint() itself. That means paintComponent() is called on every widget in the frame
		frame.repaint();
	}
	
	

}

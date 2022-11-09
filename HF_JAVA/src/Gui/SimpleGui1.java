package Gui;
import javax.swing.*;

public class SimpleGui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make a frame and a button
		JFrame frame  = new JFrame();
		JButton button = new JButton("click me");
		
		//this line makes the program quit as soon as you close
		//the window (if you leave this out it will just sit there forever)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add the button to the frames content pane
		frame.getContentPane().add(button);
		
		//give the frame size in pixels
		frame.setSize(300,300);
		
		//finally make it visible (if you forget this step, you wont see anything when this runs)
		frame.setVisible(true);
		

	}

}

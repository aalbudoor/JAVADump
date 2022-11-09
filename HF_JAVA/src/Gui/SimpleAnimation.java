package Gui;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	
	int x = 70;
	int y = 70; //MAke two instance variables in the main GUI class, for the x and y coordinates of the circle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
		

	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for (int i = 0; i < 130; i++) {//repeat this 130 times 
			
			x++;
			y++;
			
			drawPanel.repaint();// tell the panel to repaint itslef (so we can see the circle in the new location)
			
			try {
				Thread.sleep(50); //slow it down a little (otherwise it will move so quickly you wont SEE it move).
			} catch (Exception ex) {	}
		}
	}//close go method 
	
		//inner class 

	class MyDrawPanel extends JPanel {
		//fill in the entire panel with the background color, before painting the circle each time.
		//the code below add two lines at the start of the method: one to set the color to white (the background color of the drawing panel)
		//and the other to fill the entire panel rectangle with that color.
		//"fill a rectangle starting at x and y of 0 (0 pixels from the left and 0 pixels from the top)
		//and make it as wide and as high as the panel is currently"
		public void paintComponent (Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());//getWidth() and getHeight() are methods inherited from JPanel
			
			g.setColor(Color.green);		//use the continually-updated x and y coordinates of the outer class 
			g.fillOval(x, y, 40, 40);
			
		}
	}//close inner 

}//close outer 

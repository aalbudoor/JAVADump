package Gui;

//Make your own drawing widget
//make a subclass of JPanel and override one method, paintComponent()

//All of your graphics code goes inside the paintComponent() method
//Think of the paintComponent() method as the method called by the system to say "hey widget, time to paint yourself"
//If you want to draw a circle, the paintComponent() method will have code for drawing a circle
//When the frame holding your drawing panel is displayed paintComponent() is called andcicle appears 
// one more thing, you never call this method yourseld. The argument to this method (a graphics object) 
//is the actual drawing canvas that gets slapped on the real display

import java.awt.*;
import javax.swing.*;

//make a subclass of jPanel, a widget
//that you can add to a frame just like anything else.
//Except tis one is your own customized widget
public class MyDrawPanel extends JPanel{
	
	//This is the big important Graphics method. 
//	You will never call this yourself. the
//	system calls it and says "heres a nice
//			 fresh drawing surface, of types graphics,
//			 that you may paint on now"
	public void paintComponent(Graphics g) {
		
//		Imagine that 'g' is a painting machine. youre telling it what color
//		to paint with and then what shape to paint (with coordinates
//				for where it goes and how big)
		g.setColor(Color.orange);
		
		g.fillRect(20, 50, 100, 100);
		

		
	}
	
	class innerDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			
			Graphics2D g2d = (Graphics2D) g;
			
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			
			Color startColor = new Color(red, green, blue);
			
			Color endColor = new Color(red, green, blue);
			
			GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
			
			
		}
		
	}

}

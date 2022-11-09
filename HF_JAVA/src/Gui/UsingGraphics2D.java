package Gui;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class UsingGraphics2D extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		// cast it so we can call something that Graphics2D has but Graphics doesnt
	
	Graphics2D g2d = (Graphics2D) g;
	
	//parameter (starting point, starting color, ending point, ending color)
	GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
	
	// this ses=ts the virtual paint brush to a gradient instead of a solid color
	g2d.setPaint(gradient);
	
	// the fillOval() method really means "fill the oval with whatever is loaded on your paintbrush(i.e the gradient)
	g2d.fillOval(70,70,100,100);
	
	}
	
	//This is just like the one above, except it makes random colors for the start
	//and stop colors of the gradient
	public void paintComponent1(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		Color startColor = new Color(red, green, blue);
		
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		
		
	}

}

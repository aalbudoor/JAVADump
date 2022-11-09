package Gui;

import java.awt.*;
import javax.swing.*;

public class PaintACicleOnBackGround extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		
		//Paint a randomly-colored circle on a black background
			
			//fill the entire panel with black (the default color)
			//
			//the first two args define the (x,y) upper left corner, relative to the panel, for where drawing starts
			// so 0,0 means "start 0 pixels from the left edge". the left edge and 0 pixels from the top edge."
			//the other two args say "make the width of this rectangle as wide as the panel (this.width()), and
			//make the height as tall as the panel (this.height)"
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			
			
			//you can make a color by passing in 3 ints to repersent the RGB values
			Color randomColor = new Color(red , green , blue);
			
			g.setColor(randomColor);
			
			//start 70 pixels from the left, 70 from te top, make it 100 pixels wide and 100 pixels tall
			g.fillOval(70, 70, 100, 100);
		
	}

}

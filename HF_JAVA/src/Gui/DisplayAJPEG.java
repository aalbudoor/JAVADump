package Gui;
import java.awt.Image;
import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;

public class DisplayAJPEG extends JPanel{

	
	//Display a JPEG
	
	public void paintComponent(Graphics g) {
	//Your file name goes here
	Image image = new ImageIcon("catzilla.jpg").getImage();
	
	//the x,y coordinates for where the pictures top left corner
	//should go. This says "3 pixels from the left edge of the panel and 4 pixels from the 
	//top edge of the panel". These numbers are always relative to the widget (int this case you
	//jPAnel subclass), not the entire frame
	g.drawImage(image, 3, 4, this);
	
	}
	
}

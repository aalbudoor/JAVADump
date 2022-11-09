package SwingIntro;
import javax.swing.*;
import java.awt.*;

//Border Layouts

public class Button1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button1 gui = new Button1();
		gui.go();

	}
	
	public void go() {
		
		JFrame frame = new JFrame();
//		JButton button = new JButton("Click me");
		//Watch what happens when you only change the text of the button
		JButton button = new JButton("Click me like you mean it");		// the button gets its preffered width but not height
		
									//specify region
		frame.getContentPane().add(BorderLayout.EAST, button);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	//A Button in the North region 
	public void go1() {
			
			JFrame frame = new JFrame();
			JButton button = new JButton("There is no spoon...");		
			
										//specify region
			frame.getContentPane().add(BorderLayout.NORTH, button); //The button is as tall as it wants to be, but as wide as the frame 
			frame.setSize(200,200);
			frame.setVisible(true);
	}
	
	//Now lets make the button as to be taller 
	//How do we do that? 
	//THe button is already as wide as it can ever be - as wide as the frame. But we can try to make it 
	//taller by giving it a bigger font.
	public void go2() {
			
			JFrame frame = new JFrame();
			JButton button = new JButton("Click This!");
			Font bigFont = new Font("serif", Font.BOLD, 28); // A bigger font will force the frame to allocate more space for the buttons height
			
			button.setFont(bigFont);
										//specify region
			frame.getContentPane().add(BorderLayout.NORTH, button);
			frame.setSize(200,200);
			frame.setVisible(true);
		}
	
	
	//I think im getting it..if im in east or west, I get my preferred width but the height is up to the 
	//layout manager. And if im in north or south, its just the opposite - I get my preferred height, but not width
	
	
	//But what happens in the center region
	//The center region gets whatevers left
		public void go3() {
				
				JFrame frame = new JFrame();
				JButton east = new JButton("East");	
				JButton west = new JButton("West");	
				JButton north = new JButton("North");	
				JButton south = new JButton("South");	
				JButton center = new JButton("Center");	
				
											//specify region
				frame.getContentPane().add(BorderLayout.EAST, east);
				frame.getContentPane().add(BorderLayout.EAST, west);
				frame.getContentPane().add(BorderLayout.EAST, north);
				frame.getContentPane().add(BorderLayout.EAST, south);
				frame.getContentPane().add(BorderLayout.EAST, center);
				
				frame.setSize(200,200);
				frame.setVisible(true);
				
				//Notes : Components in the center get whatever space is left over, based on the frame dimensions(300*300 in this code)
				//COmponents in the east and west get their preferred width
				//COmponents in the north and south get their preferred height
				
				//When you put something in the north or south, it goes all away across the frame, so the things in the east and west wont be as tall 
				//as they would be if the north and south regions were empty.
			}

}

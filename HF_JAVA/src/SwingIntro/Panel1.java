package SwingIntro;

import javax.swing.*;
import java.awt.*;

//A JPanels layout manager is a FlowLayout, by defualt. when we add a panel to a frame, the sixe and placement of the panel is still 
//under the BorderLayout managers control. But anything inside the panel (in other words, components added to the panel by calling
//panel.add(aComponent) ) are under the panels flowLayout manager control. we'll start by putting an empty panel in the frames
//east region

public class Panel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Panel1 gui = new Panel1();
		gui.tryThis();
		

	}
	
	public void go1() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	
		
		panel.setBackground(Color.darkGray); //make the panel gray sp we can see where it is on the frame 
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	}
	
	//lets add a button to the panel
	
	public void go2() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Shock me!");
		
		panel.setBackground(Color.darkGray); //make the panel gray sp we can see where it is on the frame 
		
		panel.add(button); //add the button to the panel and add the panel to the frame.
							//The panels layout (flow) controls the button, and the frame's layout manager (border) controls the panel 
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(250,200);
		frame.setVisible(true);
		
		//results: THe panel expanded, 
		//And the button got its preffered size in both dimensions, because the panel uses flow layout, and the
		//button is part of the panel (not the frame)
		
	}
	
	//What happens if we add TWO buttons to the panel?
	
	public void go3() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Shock me!");
		JButton button1 = new JButton("Bliss");
		
		panel.setBackground(Color.darkGray); //make the panel gray sp we can see where it is on the frame 
		
		panel.add(button); 
		panel.add(button1); //added both Buttons to the panel
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(250,200);
		frame.setVisible(true);
		
		//results: We wanted the buttons stacked ontop of each other 
				//What we got instead is th panel expanded to fit both buttons side by side
				//notice that the bliss button is smaller than the shock me button..thats how flow layout works
				//the button gets just what it needs (and no more)
				
	}
		
		
		public void tryThis() {
			
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JButton buttonTwo = new JButton("Shock me!");
			JButton buttonThree = new JButton("Bliss");
			JButton buttonFour = new JButton("Four");
			panel.setBackground(Color.darkGray);
			
			
			//panel.add(buttonTwo); 
			panel.add(buttonThree); 
			panel.add(buttonFour); 
			
			
			frame.getContentPane().add(BorderLayout.NORTH, buttonThree);
			//note if you do not add the panel to the frame, the components (buttons) will not be visible
			
			frame.getContentPane().add(BorderLayout.CENTER, panel);
			
			
			frame.setSize(250,200);
			frame.setVisible(true);
	}
		
		//BoxLayout to the rescue
		//unlike flowlayout, boxlayout can force a new line to make the components wrap to the next line, even if theres room for them to fit 
		//horizontally
		public void boxLayout() {
			
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			panel.setBackground(Color.darkGray);
			
			//change the layout manager to a new instance of boxlayout 
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //THe BoxLayout constructor needs to know 
																	//the component its laying out (i.e the panel) and
																	//which axis to use (we use Y_AXIS for a vertical stack)
			
			JButton buttonTwo = new JButton("Shock me!");
			JButton buttonThree = new JButton("Bliss");
			panel.add(buttonTwo); 
			panel.add(buttonThree);
			frame.getContentPane().add(BorderLayout.EAST, panel);
			
			frame.setSize(250,200);
			frame.setVisible(true);
			
//			results: notice how the panel is narrower again, because it doesnt need to fit
//			both buttons horizontally. So the panel told the frame it needed enough room for only the largest button,
//			'shock me '
			
		}
	
	

}

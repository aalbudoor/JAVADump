package Gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TwoButtons {
	
	JFrame frame;
	JLabel label;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoButtons gui = new TwoButtons();
		gui.go();
		

	}
	
	public void go() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change Label");
		
		//instead of passing (this) to the buttons listener registartion
		//method, pass a new instance of the appropriate listener class
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Circle");
		
		//instead of passing (this) to the buttons listener registartion
		//method, pass a new instance of the appropriate listener class
		colorButton.addActionListener(new ColorListener());
		
		
		label = new JLabel("Im a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	//Now you get to have TWO ActionListners in a sincle class 
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch!"); //the inner class knows about label
		}
		
		
	}//close inner
	
	//Now you get to have TWO ActionListners in a sincle class 
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();// the inner class gets to use the 'frame' insatnce var, without having an explicit refrence to the outer class object
		}
	}//close inner 

}

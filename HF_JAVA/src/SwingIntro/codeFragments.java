package SwingIntro;

import javax.swing.*;
import java.awt.*;

public class codeFragments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		codeFragments gui = new codeFragments();
		gui.fragment5();

	}
	
	
	public void fragment() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("tesuji");
		JButton button2 = new JButton("watari");
		
		
		panel.add(button2);
		
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	}
	

	public void fragment2() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("tesuji");
		JButton button2 = new JButton("watari");
		
		panel.add(button2);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	

	}
	
	public void fragment3() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("tesuji");
		JButton button2 = new JButton("watari");
		
		panel.add(button2);
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	

		}
	
	
	public void fragment4() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("tesuji");
		JButton button2 = new JButton("watari");
		
		panel.add(button);
		
		frame.getContentPane().add(BorderLayout.NORTH, button2);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	

		}
	
	public void fragment5() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		JButton button = new JButton("tesuji");
		JButton button2 = new JButton("watari");
		

		
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		
		panel.add(button2);
		
		frame.getContentPane().add(BorderLayout.NORTH, button);
		
		frame.setSize(200,200);
		frame.setVisible(true);
		
	

		
	}
	
	
	

}
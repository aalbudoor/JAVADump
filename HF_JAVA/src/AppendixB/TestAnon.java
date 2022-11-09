package AppendixB;
import java.awt.event.*;
import javax.swing.*;

public class TestAnon {
	
	public static void main (String[] args) {
		
		
		//we made a frame and addeda button, and now we need to register an actionlistener  
		//with the button except we never made a class that implements the ActionListener interface
		JFrame frame = new JFrame();
		JButton button = new JButton("click");
		frame.getContentPane().add(button);
		//button.addActionListener(quitListener) //normally wed do something like
													//this - passing in a refrence to an instance if an inner class.. 
													//an inner class that implements actionlistner (and the actionPerformed method)
		
		//But now instead of paddin in an object refrence, we pass in the whole new class definition. in other words we write 
		//the class that immplements actionlistener RIGHT HERE WHERE WE NEED IT. the syntax also creates an instance of the class automaticallys 
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
			System.exit(0);
		}
		
		
		
	});	//Till here is 	

}

}
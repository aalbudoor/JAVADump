package RemoteDeploymentWithRMI;
import java.awt.*;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


//class DayOfTheWeek (a universal service, implements Service )

public class DayOfTheWeekService  implements Service {
	
	JLabel outputLabel;
	JComboBox month;
	JTextField day;
	JTextField year;
	
	public JPanel getGuiPanel() {
		JPanel panel = new JPAnel();
		JButton button = new JButton("do it");
		button.addActionListner(new DoItListener());
		outputLabel = new JLabel("date appears here");
		DateFormatSymbols dataStuff = new DataFromatSymbols();
		month = new JComboBox(dateStuff.getMonths());
		day = new JTextField(8);
		year = new JTextField(8);
		JPanel inputPanel = new JPanel(new GridLayout(3,2));
		inputPanel.add(new JLabel("Month"));
		inputPanel.add(month);
		inputPanel.add(new JLabel("Day"));
		inputPanel.add(day);
		inputPanel.add(new JLabel("Year"));
		inputPanel.add(year);
	
		inputPanel.add(inputPanel);
	
		inputPanel.add(button);
		
		inputPanel.add(outputLabel);
		return panel;
		
	}
		
		public class DoItListener implements ActionListener{
			public void actionPerformed(ActionEvent ev) {
				int monthNum = month.getSelectedIndex();
				int dayNum = Integer.parseInt(day.getText());
				int yearNum = Integer.parseInt(year.getText());
				Calender c = Calender.getInstance();
				c.set(Calender.MONTH, monthNum);
				c.set(Calender.DAY_OF_MONTH, dayNum);
				c.set(Calender.YEAR, yearNum);
				Date date = c.getTime();
				Strinf dayOfWeek = (new SimpleDateFormat("EEE")).format(date);
				outputLabel.setText(dayOfWeek);
				
			}
		}
	}




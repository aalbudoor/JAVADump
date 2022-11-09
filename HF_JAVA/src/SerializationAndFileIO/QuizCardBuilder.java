package SerializationAndFileIO;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {
	
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	
	public static void main(String[] args) {
		
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
		
	}
	
	
	public void go() {
		//build GUI
		frame = new JFrame("Quiz card Builder");
		
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Nect Card");
		
		cardList = new ArrayList<QuizCard>();
		
		JLabel qLabel = new JLabel("Question:");
		JLabel aLabel = new JLabel("Answer:");
		
		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);
		
		nextButton.addActionListener(new NextCardListener());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		
		//We make a menu bar, make a File menu,
		//then put 'new' and 'save' menu items into the File menu
		//we add the menu to the menu bar, then tell the frame to use this menu bar.
		//menu items can fire an ActionEvent
		JMenuItem saveMenuItem = new JMenuItem("Save");
		
		newMenuItem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
		
		
		
		
		}
	
	public class NextCardListener implements ActionListener {
		
		public void actionPerformed(ActionEvent ev) {
			
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}


	}
	
	public class SaveMenuListener implements ActionListener {
		
		public void actionPerformed(ActionEvent ev) {
			
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			
			cardList.add(card);
			
			//bring up a file dialog box and waits on this line until the user chooses 'save' from the dialog Box. All
			//the file dialog navigation and selecting a file, etc. is done for you by the
			//JFileChooser! it really is this easy
			
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}

	}
	
	public class NewMenuListener implements ActionListener{
		
		public void actionPerformed(ActionEvent ev) {
			cardList.clear();
			clearCard();
		}

	}
	
	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	
			//The method that does the actual file writing (called by the SaveMenuListener's event hanfles)
			//the argument is the 'File' object the user is saving.
	private void saveFile(File file) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));	//we chain a bufferedWriter on to a new FileWriter to make writing more 
																				//efficient 
			for (QuizCard card : cardList) {
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");			//walk throught the ArrayList of cards and write them out, one card per line
																//with the question and answer seperated by "/" and then add a new line "\n"
			}
			
			writer.close();
		} catch (IOException ex) {
			System.out.println("couldn't write the cardList out");
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}

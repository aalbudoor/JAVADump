package SerializationAndFileIO;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardPlayer {
	
	private JTextArea display;
	private JTextArea andwer;
	private ArrayList<QuizCard> cardList;
	private QuizCard currentCard;
	private int currentCardIndex;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuizCardPlayer reader = new QuizCardPlayer();
		reader.go();

	}
	
	public void go() {
		//build gui
		
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		display = new JTextArea(10,20);
		display.setFont(bigFont);
		
		display.setLineWrap(true);
		display.setEditable(false);
		
		JScrollPane qScroller = new JScrollPane(display);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		nextButton = new JButton("Show question");
		mainPanel.add(qScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());
		
		JMenuBar menuBar= new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Load card set");
		loadMenuItem.addActionListener(new OpenMenuListener());
		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(640, 500);
		frame.setVisible(true);
	}//close go
	
	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
				//show the answer because they've seen the question
				//check isShowAnser boolean flag to
				//see if theyre currently viewing a question
				//or an answer
				//and do the appropriate thing depending on the answer
			if (isShowAnswer) {
				display.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				isShowAnswer = false;
				
			} else {
				//show the next question
				if (currentCardIndex < cardList.size()) {
					
					showNextCard();
					
				} else {
					//there are no more cards!
					display.setText("That was last card");
					nextButton.setEnabled(false);
				}
			}
		}
		
	}
	
	public class OpenMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile()); //Bring up the file dialog box and let them navigate to and choose the file to open
		}
		
	}
	
	private void loadFile(File file) {
		
		cardList = new ArrayList<QuizCard>();
		
		try {
			//make a BufferedReader chained to a new FileREader, giving the FileREader the File 
			//object the user chose from the open file dialog
			BufferedReader reader = new BufferedReader(new FileReader(file));
			//read a line at a time, passing the line to the makeCard() method that parses it and turns it into a real
			//QuizCard and adds it to the ArrayList.
			String line = null;
			while ((line = reader.readLine()) != null) {
				makeCard(line);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("Couldnt read the card file");
			ex.printStackTrace();
		}
		//now time to start by showing the first card
		showNextCard();
	}
	
	private void makeCard(String lineToParse) {
		//Each line of text corresponds to a single flashCard,
		//but we have to parse out the question and answer as seperate pieces
		//we use the String split(0 method to break the line into two tokens (one for the 
		//question and one for the answer).
		String[] result = lineToParse.split("/");
		QuizCard card = new QuizCard(result[0], result[1]);
		cardList.add(card);
		System.out.println("made a card");
	}
	
	private void showNextCard() {
		curentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		display.setText(currentCard.getQuestion());
		nextButton.setText("Show Answer");
		isShowAnswer = true;
	}


}//close class

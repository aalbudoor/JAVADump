import java.util.*;

public class DotComBust {
	
	//Decalre and intitialize the varivbles we'll need
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses= 0 ;
	
	private void setUpGame() {
		//first make some dot coms and give them locations
		//make three dotComs object, give them names and stick them in the arrayList
		DotCom one = new DotCom();
		one.setName("pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//print brief instructions
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		
		for (DotCom dotComToSet : dotComsList) { // repeat with EACH DotCom in the list
			
			ArrayList<String> newLocation = helper.placeDotCom(3); //Ask the helper for a Dotcom locations ( a array list of strings)
			
			dotComToSet.setLocationCells(newLocation); // call the setter method on this DotCOm to give it the location you just got from the helper
			
			
		}// close for loop
		
		
	} //close setUpGame method
	
	private void StartPlaying() {
		
		while (!dotComsList.isEmpty()) { //As long as the DotCOm list is NOT empty (!) the same as (dotCOmList.isEmpty() == false)
			
			String userGuess = helper.getUserInput("Enter a guess:");
			
			checkUserGuess(userGuess);
		
		} //close while 
		
		finishGame(); // call our own finishGame method.
		
	} //close startPlayingMethod
	
	
	private void checkUserGuess (String userGuess) {
		
		numOfGuesses++; // increment the number of guess the user made 
		
		String result = "miss"; //assume its a 'miss', unless told otherwise 
		
		for (int x = 0; x < dotComsList.size(); x++) { //repeat with ALL DotComs in the List
			
			result = dotComsList.get(x).checkYourself(userGuess); //ask the DotCom to check the user guess, looking for a hit (or Kill)
			
			if (result.equals("hit")) {
				
				break; //get out of the loop early, no point in testing the others
			}
			
			if (result.equals("kill")) {
				
				dotComsList.remove(x);		//this guys dead, so take him out of the DotComs List the get out of the loop
				break;
				
			}
			
		} // close for
		
		System.out.println(result); // print user result
		
		
	} //close method


	private void finishGame() { //print a message telling the user how he did in the game
		
		System.out.println("All Dot Coms are dead! your stock is now wortheless.");
		
		if (numOfGuesses <= 18) {
			
			
		System.out.println("It only took you " + numOfGuesses + "guesses.");
		System.out.println(" You got out before your options sank. ");
		} else {
			
			System.out.println("Took you long enough. " + numOfGuesses + "guesses. ");
			System.out.println("Fish are dancing with your options");
		}
		
	} // close method 
	
	public static void main (String[] args) {
		
		DotComBust game = new DotComBust();	//create the game object 
		game.setUpGame();	// tell the game object to setup the game 
		game.StartPlaying(); // tell the game object to start the main game play loop (keeps asking for user input and checking the guess)
	} //close method 
		
	}

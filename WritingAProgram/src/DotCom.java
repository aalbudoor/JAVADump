import java.util.ArrayList;

public class DotCom {
	
	//DotCOm's instance variables: 1. an arrayList of cell Locations, 2. the DotComs name
	private ArrayList<String> locationCells; // change the int array into the array list that holds strings 
	private String name;
	
	
	public void setLocationCells(ArrayList<String> loc) { // change the int array the array list that holds strings 
															// A setter method that updates the DotCOms locations. (Random location provided by the GameHelper placeDotCOm() method)
		
		locationCells = loc;
		
	}
	
	public void setName(String n) { //your basic setter method 
		
		name = n;
	}
	
	public String checkYourself(String userInput) {
		
		String result = "miss";
													//If the user guess is one of the entries in the ArrayList, indexOf will return its ArrayList location. of not will return -1
		int index = locationCells.indexOf(userInput); //Find out if the user guess is in the Array list, by asking for its index. if its not, then indexOf() returns -1
		
		if (index >= 0) { /// if index is greater than or equal to zero, the guess is definitely in the list, so remove it
			
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) { //using the isEMpty() method to see if all of the locations have been guessed 
				
				result = "kill";
				System.out.println("Ouch!! you sunk " + name  + "  : ("); //tell the user when a DotCOm has been sunk 
			
			} else {
				
				result = "hit";
			}//close if 
		
		}// close outer if
		
		return result; // rerun: 'miss', or 'hit', or 'kill'
		
	}///close method

}//close class

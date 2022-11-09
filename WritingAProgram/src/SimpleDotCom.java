
public class SimpleDotCom {
	
	/* use prep code as criteria */
	
	int[] locationCells;
	int numOfHits = 0;
	
	
	public void setLocationCells(int[] locs) {
		
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		
		
		//make a variable to hold the result we'll return. put "miss" in as the defualt i.e we assume a "miss"
		String result = "Miss";
	
		
		for (int cell : locationCells) {
			
			//Convert the String to an Int
			int guess = Integer.parseInt(stringGuess);
			
	
			
			//compare the user guess to this element (cell) in the array
			if (guess == cell) {
				
				//we got a hit
				result = "hit";
				
				numOfHits++;
				
				break;
				//get out of the loop, no need to test the other cells
			
			} //end if
			
		} //end for 
		
		if (numOfHits == locationCells.length) {
			
			result = "kill";
			
		
		} //end if 
		
		System.out.println(result);
		
		//return the result back to the calling method 
		return result;
		
	}

}

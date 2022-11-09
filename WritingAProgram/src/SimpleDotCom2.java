
public class SimpleDotCom2 {

	public static void main(String[] args) {
		
		//make a variable to track how many guess the user made
		int numbOfGuesses = 0;
		
		//special class that has method for getting user input, pretend its part of java
		GameHelper helper = new GameHelper();
		
		
		SimpleDotCom dot2 = new SimpleDotCom();
		
		int randomNum = (int) (Math.random() * 5);
		
		
		int[] Locations = {randomNum, randomNum + 1, randomNum + 2};
		
		
		dot2.setLocationCells(Locations);
		
		
		boolean isAlive = true;
		
		while (isAlive == true) {
			
			String guess = helper.getUserInput("enter a number: ");
			
			String result = dot2.checkYourself(guess);
			
			numbOfGuesses++;
			
			
			if (result.equals("Kill")) {
				
				isAlive = false;
				
				System.out.println("You took " + numbOfGuesses + "guesses");
			}
			
			
		}
		
		
		
		
		
		

	}

}




package RemoteDeploymentWithRMI;


public class PhraseOMatic {
	
	public static String makePhrase() {
		
		String[] wordListOne = {"24/7","Turn", "Left", "Sign", "Hold", "Temp","Where" ,"Almost"};
		
		String[] wordListTwo = {"Set","Solution", "14", "kind", "loving", "heat","there" ,"again"};
		
		String[] wordListThree = {"Humble","cardio", "lift", "force", "symbol", "hyphen","endever" ,"say"};
		
		//find out how many words are in each list
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate three random numbers, to pull random words from each list
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//now build a phrase 
		
		String phrase = wordListOne[rand1] + " " +wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//now return it
		return ("What we need is a " + phrase);
		
		
	}

}


public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate a SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();
		
		//make an int array for the location of the dotcom (3 consecative ints out of a possible 7)
		int[] Locations = { 2, 3, 4};
		
		//invoke the setter method on the dotcom
		
		dot.setLocationCells(Locations);
		
		//make a fake user guess
		String userGuess = "2";
		
		//invoke the checkYouself() method on the dot com object and pass it to the fake guess 
		String result = dot.checkYourself(userGuess);
		
		String testResult = "Failed";
		
		if (result.equals("hit") ) {
			
			//if the fake guess (2) gives back a "hit", its working 
			testResult = "Passed";
			
		
		}
		//print out the test result (passed or failed)
		System.out.println(testResult);
		

	}

}

import sheffield.*;
import java.text.DecimalFormat;

public class Change {

	public static void main(String[] args) {   
		
		//Task 1
		EasyReader reader = new EasyReader();
		double cost = reader.readDouble("How much is your shopping?");      //Asks user for shopping cost 
		double cash = reader.readDouble("How much cash did you offer?");    // Asks user for cash
		double change = cash - cost;		//	calculates the change 
		EasyWriter writer = new EasyWriter();
		System.out.print("Your change should be "); 	
		writer.println(change, 2);			////prints out the change into two decimal points
		System.out.println("Made up of");

		
		// Task 2:
		DecimalFormat df = new DecimalFormat("0.00");   //defines format up to two decimal points
		String formattedChange = df.format(change); // specifically formats the change up to two decimal points
		String[] parts = formattedChange.split("\\."); /// splits change into pounds and pence
		int pounds = Integer.parseInt(parts[0]);
		int pences = Integer.parseInt(parts[1]);

		// If statements used for counting notes
		
		if (pounds >= 10) {                             
			int tenPoundsNotes = pounds / 10;
			System.out.println("10 pound notes: " + tenPoundsNotes);
			pounds = pounds % 10;		// updates pounds to the reminder of 10 
		} else {
			System.out.println("10 pound notes: " + 0);
		}

		if (pounds >= 5) {		// If and else statements used for counting 5 pound notes 
			int fivePoundsNotes = pounds / 5;
			System.out.println("5 pound notes: " + fivePoundsNotes);
			pounds = pounds % 5; 		// updates pounds to the reminder of 5
		} else {
			System.out.println("5 pound notes: " + 0);
		}

		if (pounds >= 2) {    	// If and else statements used for counting 2 pound notes
			int twoPoundsCoins = pounds / 2;
			System.out.println("2 pound coins: " + twoPoundsCoins);
			pounds = pounds % 2; 						// updates pounds to the reminder of 2
		} else {
			System.out.println("2 pound coins: " + 0);
		}

		if (pounds > 0) {	// If and else statements used for counting 1 pound coins
			System.out.println("1 pound coins: " + pounds);
		} else {
			System.out.println("1 pound coins: " + 0);
		}

		
		// If statements used for counting pence
		
		if (pences >= 50) {		
			int fiftyPenceCoins = pences / 50;
			System.out.println("50 pence coins: " + fiftyPenceCoins); 
			pences = pences % 50; 						// updates pounds to the reminder of 50
		} else {
			System.out.println("50 pence coins: " + 0);
		}

		if (pences >= 20) {				// If and else statements used for counting 20 pence
			int twentyPenceCoins = pences / 50;
			System.out.println("20 pence coins: " + twentyPenceCoins);
			pences = pences % 20; 			// updates pounds to the reminder of 20
		} else {
			System.out.println("20 pence coins: " + 0);
		}

		if (pences >= 10) {			// If and else statements used for counting 10 pence
			int tenPenceCoins = pences / 10;
			System.out.println("10 pence coins: " + tenPenceCoins);
			pences = pences % 10; 						// updates pounds to the reminder of 10
		} else {
			System.out.println("10 pence coins: " + 0);
		}

		if (pences >= 5) {			// If and else statements used for counting 5 pence
			int fivePenceCoins = pences / 5;
			System.out.println("5 pence coins: " + fivePenceCoins);
			pences = pences % 5;				
			// updates pounds to the reminder of 5
		} else {
			System.out.println("5 pence coins: " + 0);
		}

		if (pences >= 2) {		// If and else statements used for counting 2 pence
			int twoPenceCoins = pences / 2;
			System.out.println("2 pence coins: " + twoPenceCoins);
			pences = pences % 2;	// updates pounds to the reminder of 2
		} else {
			System.out.println("2 pence coins: " + 0);
		}

		if (pences > 0) { // If and else statements used for counting 1 pence 
			System.out.println("1 pence coins: " + pences);
		} else {
			System.out.println("1 pence coins: " + 0);
		}
		
		// Task 3: asks user to input the file name 
		String fileName = reader.readString("What is the name of your file?"); 
		reader = new EasyReader(fileName);
		
		
		// reading cash and price for three inputs
		double price1 = reader.readDouble(); 			
		double paid1 = reader.readDouble();
		
		double price2 = reader.readDouble();
		double paid2 = reader.readDouble();
		
		double price3 = reader.readDouble();
		double paid3 = reader.readDouble();
		
		// calculating change for all three inputs 
		
		double change1 = paid1-price1;
		double change2 = paid2-price2;
		double change3 = paid3-price3;
		
		// printing data in table format 
		
		System.out.println("Price\tPaid\tChange");
		System.out.println(df.format(price1)+ "\t"+ df.format(paid1)+ "\t"+ df.format(change1));
		System.out.println(df.format(price2)+ "\t"+ df.format(paid2)+ "\t"+ df.format(change2));
		System.out.println(df.format(price3)+ "\t"+ df.format(paid3)+ "\t"+ df.format(change3));

	}

}

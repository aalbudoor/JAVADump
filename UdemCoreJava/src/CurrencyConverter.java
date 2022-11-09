
public class CurrencyConverter {

/*NameRates[] nameRates = { new NameRates(), new NameRates(), new NameRates(), new NameRates(), new NameRates(), new NameRates(), new NameRates()};
	

	nameRates[0].name = "rupee";
	nameRates[1].name = "Dirham";
	nameRates[2].name = "Real";
	nameRates[3].name = "Chilean peso";
	nameRates[4].name = "Mexican peso";
	nameRates[5].name = "Yen";
	nameRates[6].name = "Austrelian Dollar"; 
	
	*
	*
		System.out.println("One Dollar in rupee is " + nameRates[0].name+ exchangeRates[0] );
		System.out.println("One Dollar in Dirham is " + nameRates[1].name + exchangeRates[1] );
		System.out.println("One Dollar in real is " + nameRates[2].name + exchangeRates[2] );
		System.out.println("One Dollar in Chilean peso is " + nameRates[3].name + exchangeRates[3]);
		System.out.println("One Dollar in Mexican Peso is " + nameRates[4].name + exchangeRates[4]);
		System.out.println("One Dollar in Yen is  " + nameRates[5].name + exchangeRates[5]);
		System.out.println("One Dollar in Austrelian dollar is  " + nameRates[6].name + exchangeRates[6]); */
	
	//set exchange rates to null and include the rates after the main method 
	double[] exchangeRates1 ;
	
	//using this instance method we are manipulating the state 
	 void setExchangeRates1(double[] rates ) {
		
		exchangeRates1 = rates;
		
	}
	
	//creating a method that would update a single array
	 
	 void updateExchangeRates1(int countryIndex, double newVal) {
		 
		 exchangeRates1[countryIndex] = newVal;
		 
	 }
	 
	 //fetching a value for a particular country
	 
	 double getExchangeRates1(int countryIndex) {
		 
		 return exchangeRates1[countryIndex];
		 
	 }
	 //Lets say we want to transfer a certain amount for US dollars (paramters: arrayIndex (rupees) and amount for dollars)
	 double transferAmount(int countryIndex, double amount) {
		 
		 return amount * getExchangeRates1(countryIndex);
	 }
	
	void printCurrencyConverter() {
		
		System.out.println("\nOne Dollar in rupee is " + exchangeRates1[0] );
		System.out.println("One Dollar in Dirham is " + exchangeRates1[1] );
		System.out.println("One Dollar in real is "  + exchangeRates1[2] );
		System.out.println("One Dollar in Chilean peso is "  + exchangeRates1[3]);
		System.out.println("One Dollar in Mexican Peso is "  + exchangeRates1[4]);
		System.out.println("One Dollar in Yen is  "  + exchangeRates1[5]);
		System.out.println("One Dollar in Austrelian dollar is  "  + exchangeRates1[exchangeRates1.length - 1]);
		
		
		
	}
	
	public static void main(String[] args) {
	
		CurrencyConverter cc = new CurrencyConverter();
		
		//set of valueas for jan 1st
		double[] rates = { 63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
		
		cc.setExchangeRates1(rates);
		
		cc.printCurrencyConverter();
		
		//since you are assigning new values for Feb1st you need to add NEW
		rates = new double[]{ 65.0, 5.0, 9.0, 595.5, 18.0, 107.0, 2.0};
		
		cc.setExchangeRates1(rates);
		
		cc.printCurrencyConverter();
		
		//invoking 3rd method (parameters updates the array at index 0 to new value of 66)
		cc.updateExchangeRates1(0, 66);
		cc.printCurrencyConverter();
	
		//for computing transfer amount
		double amount = cc.transferAmount(0, 1000);
		System.out.println("\nTransfer amount  " + amount);
	}
}

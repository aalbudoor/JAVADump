
public class MoneyTransferService {

	double[] exchangeRates2;
	
	void setExchangeRates2(double[] rates) {
		
		exchangeRates2 = rates;
	}
	
	double getExchangeRates2(int countryIndex){
		
		return exchangeRates2[countryIndex];
		
	}
	
	double computeTransferAmount(int countryIndex, double amount) {
		
		return getExchangeRates2(countryIndex) * amount; 
	}
	
	double computeTransferFee(int countryIndex ,double amount) {
		
		double fee = 0.02;
		
		return getExchangeRates2(countryIndex) * amount * fee; 
	}
	
	//Alternate method for computeTransferFee
	
	/*
	 * double computeTransferFee(int countryIndex, double amount) {
        double transferAmount = computeTransferAmount(countryIndex, amount);
        double transferFee = transferAmount * 0.02;
        return transferFee;
        
        */
		
	
	public static void main(String[] args) {
		
		MoneyTransferService transferService = new MoneyTransferService();

		double[] rates = { 63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
		
		transferService.setExchangeRates2(rates);
		
		double transferAmount = transferService.computeTransferAmount(0, 1000);
		
		System.out.println("Transfer Amount : " + transferAmount);
		
		double transferFee = transferService.computeTransferFee(0, 1000);
		
		 System.out.println("Transfer Fee: " + transferFee);
		
	}

}

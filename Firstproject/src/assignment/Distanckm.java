package assignment;
import sheffield.*;



public class Distanckm {

	public static void main(String[] args) { 
	
		EasyReader keyboard = new EasyReader();
		
		int miles = keyboard.readInt("Enter the amount of miles");
		int yards = keyboard.readInt("Enter the amount of yards");
		
	
	
		double convertedMiles = ((double)yards/1760);
		double finalMiles = (miles + convertedMiles ); 
	 double convertedKm = (finalMiles * 1.60934);	
	 
	 System.out.println(miles + "miles and " + yards + " is equivelant to " + Math.round(convertedKm));
	}
	

}

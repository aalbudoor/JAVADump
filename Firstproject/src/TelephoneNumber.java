

import sheffield.EasyReader;
/**
 * 
 * @author Abdullah
 * Java Program to Read telephone number and 
 * print Area code & number
 *
 */
public class TelephoneNumber {
	
	public static void main(String[] args) {
		EasyReader reader = new EasyReader();
		String telephoneNumber = reader.readString("Please enter the telephone number: ");
		// Splits telephone number by ")"
		String[] parts = telephoneNumber.split("\\)");
		// Area code starts with index 1
		String areaCode = parts[0].substring(1);
		// Removes whiteSpaces before the number
		String number = parts[1].trim();
		System.out.println("The area code is: "+areaCode);
		System.out.println("The telephone number is: "+number);		
	}

}

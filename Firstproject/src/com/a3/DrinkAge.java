package com.a3;

import sheffield.EasyReader;
/**
 * 
 * @author Abdullah
 * Java Program to validate age for alcohol consumption
 *
 */
public class DrinkAge {
	// Minimum age
	private static final int EIGHTEEN = 18;
	// Valid age but needs proof of age
	private static final int TWENTY_FIVE = 25;

	public static void main(String[] args) {
		EasyReader reader = new EasyReader();
		int age = reader.readInt("Please enter your age: ");
		if (age < EIGHTEEN) {
			System.out.println("You can not buy alcohol.");
		} else if (age < TWENTY_FIVE) {
			System.out.println("You can buy alcohol.");
			System.out.println("But ,we need proof of your age.");
		} else {
			System.out.println("You can buy alcohol.");
		}
	}

}

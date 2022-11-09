package com.a3;

import sheffield.EasyReader;
/**
 * 
 * @author Abdullah
 * Java Program to Read givenName and familyName
 * and print greeting with fullName
 *
 */
public class FullName {

	public static void main(String[] args) {
		EasyReader reader = new EasyReader();
		String givenName = reader.readString("What is your given name? ");
		String familyName = reader.readString("What is your family name? ");
		String greeting = "Hello " + givenName + " " + familyName;
		//Printing greeting using full Name
		System.out.println(greeting);

	}

}
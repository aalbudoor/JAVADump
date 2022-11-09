/** 
* Steps.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet1;

public class Steps {
	
	// Instance variables
	private int value;
	
	// Constructor
	public Steps(int value) { 
		this.value = value;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int newValue) {
		this.value = newValue;
	}	
	
	public String toString() {
		return "Steps [value=" + value + "]";
	}
	
}

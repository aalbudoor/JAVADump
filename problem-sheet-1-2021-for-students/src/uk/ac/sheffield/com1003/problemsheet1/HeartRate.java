/** 
* HeartRate.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet1;

public class HeartRate {
	
	// Instance variables
	private double value;
	
	// Constructor
	public HeartRate(double value) { 
		this.value = value;
	}
	
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double newValue) {
		this.value = newValue;
	}
	
	public String toString() {
		return "HeartRate [value=" + value + "]";
	}
	
}

/** 
* Distance.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet1;

public class Distance {
	
	// Enum of distance units
	public enum DistanceUnit {
		KILOMETRES,
		MILES
	}
	
	// Constants
	private static final double KMS_PER_MILE = 1.609; 
	private static final double MILES_PER_KM = 0.621; 
	
	// Instance variables
	private double value;
	private DistanceUnit distanceUnit;
	
	// Constructors 
	public Distance(double value) {
		this.value = value;
		// Default unit is km
		this.distanceUnit = DistanceUnit.KILOMETRES;
	}

	public Distance(double value, DistanceUnit distanceUnit) {
		this.value = value;
		this.distanceUnit = distanceUnit;
	}
	
	
	public double getValue() {
		return value;
	}
	
	public double getValue(DistanceUnit unit) {

		if (this.distanceUnit.equals(unit)) {
			return value;
		} else if (this.distanceUnit.equals(DistanceUnit.KILOMETRES) && unit.equals(DistanceUnit.MILES)) {
			return value * MILES_PER_KM;
		} else {
			return value * KMS_PER_MILE;
		}
	}
	
	public void setValue(double newValue) {
		this.value = newValue;
	}
	
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	
	public void changeDistanceUnit(DistanceUnit newDistanceUnit) {
		this.value = getValue(newDistanceUnit);
		this.distanceUnit = newDistanceUnit;
	}
	
	public static double convertToMiles(double kilometres) {
		return kilometres*MILES_PER_KM;
	}
	
	public static double convertToKilometres(double miles) {
		return miles*KMS_PER_MILE;
	}	
	
	public String toString() {
		return "Distance [value=" + value + ", distanceUnit = " + distanceUnit + "]";
	}
	
	
}

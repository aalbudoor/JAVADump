/** 
* MeasurementGenerator.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet1;

import uk.ac.sheffield.com1003.problemsheet1.Distance.DistanceUnit;

public class MeasurementGenerator {
	
	
	public static void main(String[] args) {
		// Instantiating 2 Steps objects
		Steps steps1 = new Steps(100);
		Steps steps2 = new Steps(200);
		
		// Instantiating 2 HeartRate objects
		HeartRate heartRate1 = new HeartRate(99);
		HeartRate heartRate2 = new HeartRate(102);
		
		// Instantiating 3 Distance objects
		Distance distance1 = new Distance(100);
		
		Distance distance2 = new Distance(100,DistanceUnit.KILOMETRES);		
		
		Distance distance3 = new Distance(100,DistanceUnit.MILES);
		
		//Displaying the number of steps of each object
		System.out.println("Number of steps of steps1 --> " + steps1.getValue());
		System.out.println("Number of steps of steps2 --> " + steps2.getValue());
		
		//Displaying the heart rate of each object
		System.out.println("Heart rate of heartRate1 --> " + heartRate1.getValue());
		System.out.println("Heart rate of heartRate2 --> " + heartRate2.getValue());
		
		//Displaying the distance of each object
		System.out.println(distance1);
		System.out.println(distance2);
		System.out.println(distance3);
		
		//Changing the units of each Distance object
		distance1.changeDistanceUnit(DistanceUnit.MILES);
		System.out.println(distance1);
		
		distance3.changeDistanceUnit(DistanceUnit.KILOMETRES);
		System.out.println(distance3);
		
		System.out.println(Distance.convertToMiles(100));
		
	}
	
}

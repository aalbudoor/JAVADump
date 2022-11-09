/** 
* HeartRateFitnessTracker.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet2;

import uk.ac.sheffield.com1003.problemsheet1.HeartRate;

public class HeartRateFitnessTracker extends FitnessTracker {


	// Cumulative moving average HeartRate
	HeartRate avgHeartRate;
	// Number of heart rate measurements
	int numMeasurements;
	
	public HeartRateFitnessTracker(String modelName, HeartRate heartRate) {
		super(modelName);
		// Only one HeartRate to begin with; average is equal to single measurement
		this.avgHeartRate = heartRate;
		this.numMeasurements = 1;
	}
	
	public void addHeartRate(HeartRate heartRateToAdd) {
		// Calculate cumulative moving average of heart rate
		// See https://en.wikipedia.org/wiki/Moving_average
		double newHR = heartRateToAdd.getValue();
		double cmaHR = this.avgHeartRate.getValue();
		double cmaNext = (newHR + (cmaHR * numMeasurements)) / (numMeasurements + 1);
		
		this.avgHeartRate.setValue(cmaNext);
		
		numMeasurements ++;
	}
	
	// Getter for average heart rate
	public HeartRate getAvgHeartRate() {
		return avgHeartRate;
	}

	public String toString() {
		return "Heart Rate Tracker " + getModelName() + 
				"; Average Heart Rate: " + getAvgHeartRate().getValue() + 
				", for " + numMeasurements + " measurements";
	}

	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		HeartRateFitnessTracker otherObj = (HeartRateFitnessTracker)obj;
		return this.avgHeartRate.equals(otherObj.getAvgHeartRate())
				&& this.numMeasurements == otherObj.numMeasurements;
	}
	
	
	

}

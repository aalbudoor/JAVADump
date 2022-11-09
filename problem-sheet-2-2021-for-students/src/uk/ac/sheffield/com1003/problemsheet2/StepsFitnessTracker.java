/** 
* StepsFitnessTracker.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet2;

import uk.ac.sheffield.com1003.problemsheet1.Steps;

public class StepsFitnessTracker extends FitnessTracker {

	// Stores total number of steps
	private Steps totalSteps;
	
	public StepsFitnessTracker(String modelName, Steps steps) {
		super(modelName);
		this.totalSteps = steps;
	}
	
	// Add steps to the total
	public void addSteps(Steps stepsToAdd) {
		int numSteps = this.totalSteps.getValue() + stepsToAdd.getValue();
		this.totalSteps.setValue(numSteps);
	}
	
	// Getter for total number of steps
	public Steps getTotalSteps() {
		return totalSteps;
	}
	
	public String toString() {
		return "Steps Tracker " + getModelName() + 
				"; Total Steps: " + getTotalSteps().getValue();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else if(obj == null) {
			return false;
		}else if(!obj.getClass().equals(getClass())){
			return false;
		}else {
			StepsFitnessTracker otherObj = (StepsFitnessTracker)obj;
			if(null == this.getTotalSteps() && otherObj.getTotalSteps() == null) {
				return  this.getModelName().equals(otherObj.getModelName());
			}
			return this.getTotalSteps().equals(otherObj.getTotalSteps())
					&& this.getModelName().equals(otherObj.getModelName());
		}
	}
	
	
	

}

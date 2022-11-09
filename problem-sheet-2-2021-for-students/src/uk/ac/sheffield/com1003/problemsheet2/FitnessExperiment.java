/** 
* FitnessExperiment.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet2;

import java.util.ArrayList;
import java.util.Arrays;
import uk.ac.sheffield.com1003.problemsheet1.*;

public class FitnessExperiment {
	
	FitnessTracker[] fitnessTrackers;
	
	public static void main(String[] args) {
		FitnessTracker[] trackers = {
				new StepsFitnessTracker("steps", new Steps(230)), 
				new StepsFitnessTracker("steps2", new Steps(150)), 
				new StepsFitnessTracker("steps2", new Steps(150)), 
				new HeartRateFitnessTracker("hr", new HeartRate(80)), 
				new HeartRateFitnessTracker("hr", new HeartRate(80)), 
				new DistanceFitnessTracker("dist1", new Distance(1000)), 
				new DistanceFitnessTracker("dist2", new Distance(2430)),
				new DistanceFitnessTracker("dist2", new Distance(2430)) 
				};
		
		FitnessExperiment fitnessExperiment = new FitnessExperiment(trackers);
		fitnessExperiment.printExperimentDetails();
		
		fitnessExperiment.printAllEqualTrackers();

	}
	
	// Constructor
	public FitnessExperiment(FitnessTracker[] fitnessTrackers) {
		this.fitnessTrackers = fitnessTrackers;
	}
	
	// Methods to implement:

	
	// Implementation hint: Should it use the corresponding toString() methods for 
	// each of the objects stored in the fitnessTrackers array?
	public String toString() {
		String output = "";
		for(FitnessTracker fitnessTracker : fitnessTrackers) {
			output+= fitnessTracker.toString()+"\n";
		}
		return output;
	}
	
	// Method displays in console the details of this experiment which include:
	// - Summary of the measurements of each individual fitness tracker 
	//   (indicating if they are steps, distance or heart rate measurements)
	// - The total number of fitness trackers that participated in this experiment
	// - A summary of total number of steps and total distance walked in this experiment
	// Implementation hint:  Should it use the toString() method right above this method?	
	public void printExperimentDetails() {
		System.out.println("---------------Summary of the measurements------------------");
		System.out.println(toString());
		System.out.println("Total number of fitness trackers : "+ fitnessTrackers.length);
		System.out.println("Summary of total number of steps : "+ getTotalSteps());
		System.out.println("Summary of total distance walked : " + getTotalDistance() );
	}
	
	// Method should iterate through all fitness tracker step measurements and returns a double 
	// with the total step count (see Task 2) 
	// Implementation hint: The instanceof operator and casting may become handy here 	
	public int getTotalSteps() {
		int totalSteps =0;
		for(FitnessTracker fitnessTracker : fitnessTrackers) {
			if (fitnessTracker instanceof StepsFitnessTracker) {
				totalSteps+= ((StepsFitnessTracker) fitnessTracker).getTotalSteps().getValue();
			}
			
		}
		return totalSteps;
	}
	
	// Method should iterate through all fitness tracker distance measurements and returns a double with the total distance  
	// Implementation hint: The instanceof operator and casting may become handy here
	public double getTotalDistance() {
		double totalDistance = 0.0;
		for(FitnessTracker fitnessTracker : fitnessTrackers) {
			if (fitnessTracker instanceof DistanceFitnessTracker) {
				totalDistance+= ((DistanceFitnessTracker) fitnessTracker).getTotalDistance().getValue();
			}
			
		}
		return totalDistance;
	}
	
	public FitnessTracker[] getTrackersEqualTo(FitnessTracker tracker) {
		// TODO Implement a method that finds the trackers which are equal to tracker
		ArrayList<FitnessTracker> trackers = new ArrayList<>();
		for(FitnessTracker fitnessTracker : fitnessTrackers) {
			if(fitnessTracker.equals(tracker)) {
				trackers.add(fitnessTracker);
			}
		}
		FitnessTracker[] arrayTrackers =  new FitnessTracker[trackers.size()];
		arrayTrackers = trackers.toArray(arrayTrackers);
		return arrayTrackers;
		
	}
	
	// Implementation hint: use the above getTrackersEqualTo() method 
	public void printAllEqualTrackers() {
		// TODO Implement a method which prints every duplicate tracker
		for(FitnessTracker fitnessTracker : fitnessTrackers) {
			FitnessTracker[] arrayTrackers = getTrackersEqualTo(fitnessTracker);
			System.out.println("Equal Trackers for "+ fitnessTracker);
			System.out.println(Arrays.toString(arrayTrackers));
		}
	}
	
	
}

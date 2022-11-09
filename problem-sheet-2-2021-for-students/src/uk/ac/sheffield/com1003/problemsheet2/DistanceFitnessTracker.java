package uk.ac.sheffield.com1003.problemsheet2;

import uk.ac.sheffield.com1003.problemsheet1.Distance;

public class DistanceFitnessTracker extends FitnessTracker {

	private Distance totalDistance;

	public DistanceFitnessTracker(String modelName, Distance distance) {
		super(modelName);
		this.totalDistance = distance;
	}

	// Add distance to the total
	public void addDistance(Distance distanceToAdd) {
		double numDistance = this.totalDistance.getValue() + distanceToAdd.getValue();
		this.totalDistance.setValue(numDistance);
	}

	/**
	 * @return the totalDistance
	 */
	public Distance getTotalDistance() {
		return totalDistance;
	}

	@Override
	public String toString() {
		return "Distance Fitness Tracker" + getModelName() + "; Total distance: " + getTotalDistance().getValue();
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(!super.equals(obj)) {
			return false;
		}
		DistanceFitnessTracker otherObj = (DistanceFitnessTracker)obj;
		return this.totalDistance.equals(otherObj.getTotalDistance());
	}

}

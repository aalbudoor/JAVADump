/** 
* FitnessTracker.java
* 
* Copyright (c) University of Sheffield, 2021
* 
* @version 1.3 11/01/2021
* 
* @author Maria-Cruz Villa-Uriol
* @author Ben Clegg
*/

package uk.ac.sheffield.com1003.problemsheet2;

public class FitnessTracker {
	
	// String containing model name of fitness activity tracker
	private String modelName;
	
	public FitnessTracker(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelName() {
		return modelName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitnessTracker other = (FitnessTracker) obj;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}

	
	
	
	
	
}

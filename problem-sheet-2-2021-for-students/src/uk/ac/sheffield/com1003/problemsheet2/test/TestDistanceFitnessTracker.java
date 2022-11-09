package uk.ac.sheffield.com1003.problemsheet2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.sheffield.com1003.problemsheet1.Distance;
import uk.ac.sheffield.com1003.problemsheet2.DistanceFitnessTracker;

public class TestDistanceFitnessTracker {

	@Test
	public void testTrackersDifferentSumNotEqual() {
		DistanceFitnessTracker a = new DistanceFitnessTracker("hr", new Distance(20));
		DistanceFitnessTracker b = new DistanceFitnessTracker("hr", new Distance(20));
		b.addDistance(new Distance(10));
		assertNotEquals(a, b);
		assertNotEquals(b, a);
	}

}

package uk.ac.sheffield.com1003.problemsheet2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.sheffield.com1003.problemsheet1.HeartRate;
import uk.ac.sheffield.com1003.problemsheet1.Steps;
import uk.ac.sheffield.com1003.problemsheet2.HeartRateFitnessTracker;
import uk.ac.sheffield.com1003.problemsheet2.StepsFitnessTracker;

public class TestHeartRateFitnessTracker {

	@Test
	public void testSameReferenceEqual() {
		HeartRateFitnessTracker a = new HeartRateFitnessTracker("a", new HeartRate(10));
		HeartRateFitnessTracker b = a;
		assertEquals(a, b);
	}
	
	@Test
	public void testDifferentClassesNotEqual() {
		HeartRateFitnessTracker a = new HeartRateFitnessTracker("a", new HeartRate(10));
		StepsFitnessTracker b = new StepsFitnessTracker("a", new Steps(10));
		assertNotEquals(a, b);
	}
	

}

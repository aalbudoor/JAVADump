package uk.ac.sheffield.com1003.problemsheet2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.sheffield.com1003.problemsheet2.FitnessTracker;

public class TestFitnessTracker {

	@Test
	public void testSameTrackersEqual() {
		FitnessTracker a = new FitnessTracker("a");
		FitnessTracker b = new FitnessTracker("a");
		assertEquals(a, b);
	}

	@Test
	public void testDifferentNamesNotEqual() {
		FitnessTracker a = new FitnessTracker("a");
		FitnessTracker b = new FitnessTracker("b");
		assertNotEquals(a, b);
	}
	@Test
	public void testNullNotEqual() {
		FitnessTracker a = null;
		FitnessTracker b = new FitnessTracker("a");
		assertNotEquals(a, b);
	}

}

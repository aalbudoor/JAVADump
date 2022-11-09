package uk.ac.sheffield.com1003.problemsheet2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.sheffield.com1003.problemsheet1.Steps;
import uk.ac.sheffield.com1003.problemsheet2.StepsFitnessTracker;

public class TestStepsFitnessTracker {

	@Test
	public void testTrackersSameSumEqual() {
		StepsFitnessTracker a = new StepsFitnessTracker("hr", new Steps(20));
		StepsFitnessTracker b = new StepsFitnessTracker("hr", new Steps(10));
		b.addSteps(new Steps(10));
		assertEquals(a, b);
	}

	@Test
	public void testBothNullEqual() {
		StepsFitnessTracker a = new StepsFitnessTracker("a", null);
		StepsFitnessTracker b = new StepsFitnessTracker("a", null);
		assertEquals(a, b);
	}
	
	@Test
	public void testGetTotalSteps() {
		StepsFitnessTracker a = new StepsFitnessTracker("a", new Steps(10));
		StepsFitnessTracker b = new StepsFitnessTracker("b", new Steps(10));
		StepsFitnessTracker c = new StepsFitnessTracker("c", new Steps(20));

		assertTrue(a.getTotalSteps().getValue() == b.getTotalSteps().getValue());
		assertFalse(a.getTotalSteps().getValue() == c.getTotalSteps().getValue());
	}
	
}

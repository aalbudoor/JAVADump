package uk.ac.sheffield.com1003.problemsheet2.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import uk.ac.sheffield.com1003.problemsheet1.Distance;
import uk.ac.sheffield.com1003.problemsheet1.HeartRate;
import uk.ac.sheffield.com1003.problemsheet1.Steps;
import uk.ac.sheffield.com1003.problemsheet2.*;

public class TestFitnessExperiment {

	private static final FitnessTracker[] TRACKERS = {
			new StepsFitnessTracker("steps", new Steps(230)), 
			new StepsFitnessTracker("steps2", new Steps(140)), 
			new StepsFitnessTracker("steps2", new Steps(140)), 
			new HeartRateFitnessTracker("hr", new HeartRate(70)),
			new HeartRateFitnessTracker("hr2", new HeartRate(40)),
			new DistanceFitnessTracker("dist1", new Distance(1490)),
			new DistanceFitnessTracker("dist2", new Distance(2430)),
			new FitnessTracker("ft"),
			new FitnessTracker("ft")
	};

	private static final int TOTAL_STEPS = 510;

	
	@Test
	public void testPrintDetailsNotEmpty() {
		PrintStream original = System.out;
		ByteArrayOutputStream capture = new ByteArrayOutputStream();
		
		try {
			System.setOut(new PrintStream(capture));
			
			FitnessExperiment fe = new FitnessExperiment(TRACKERS);
			fe.printExperimentDetails();
		} finally {
			System.setOut(original);
		}
		assertFalse(capture.toString().isEmpty());			
	}
	
	@Test
	public void testGetTotalSteps() {
		FitnessExperiment fe = new FitnessExperiment(TRACKERS);
		assertTrue(fe.getTotalSteps() == TOTAL_STEPS);
	}
	
	@Test
	public void testGetTrackersEqualToSomeEqual() {
		// TRACKERS[5] & [6] equal
		
		FitnessExperiment fe = new FitnessExperiment(TRACKERS);
		FitnessTracker[] eq = fe.getTrackersEqualTo(TRACKERS[1]);
		List<FitnessTracker> list = Arrays.asList(eq); 

		assertTrue(list.contains(TRACKERS[2]));
		// Unequal elements cannot appear
		assertFalse(list.contains(TRACKERS[0]));
		for (int i = 3; i < TRACKERS.length; i++) {
			assertFalse(list.contains(TRACKERS[i]));
		}
	}
	
	@Test
	public void testGetTrackersEqualToNoneEqualOutsideList() {
		FitnessExperiment fe = new FitnessExperiment(TRACKERS);
		FitnessTracker[] eq = fe.getTrackersEqualTo(new StepsFitnessTracker("another tracker", new Steps(999)));
		assertTrue(eq.length == 0);
	}
	
	@Test
	public void testPrintTrackersEqualToDoesntContainUnexpected() {
		PrintStream original = System.out;
		ByteArrayOutputStream capture = new ByteArrayOutputStream();
		FitnessExperiment fe = new FitnessExperiment(TRACKERS);
		
		try {
			System.setOut(new PrintStream(capture));
			
			fe.printAllEqualTrackers();
		} finally {
			System.setOut(original);
		}

		System.out.println(capture.toString());
		assertFalse(capture.toString().contains("dist1"));
		assertFalse(capture.toString().contains("hr2"));
	}

}

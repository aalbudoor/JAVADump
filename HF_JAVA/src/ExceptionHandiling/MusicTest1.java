package ExceptionHandiling;

import javax.sound.midi.*;


public class MusicTest1 {
	
	
	public void play() {
		
		try { //put the risky thing in a try block
			
			//We need a sequencer object. . its the main part of the MIDI device/instrument were using.
			//its the thing that sequences all the MIDI information into a 'song'. but we dont make a brand
			//new one ourselves == we have to ask the MidiSystem to give us one
			Sequencer sequencer = MidiSystem.getSequencer(); 
			
			System.out.println("We got a sequencer");
			
		} catch(MidiUnavailableException ex) { //Make a catch block for what to do if the exceptional situation happens
												//In other words, a MidiUnavailableExceptionis thrown by the call to getSequencer
			System.out.println("Bummer");
		}
		
		
	}//close play
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicTest1 mt = new MusicTest1();
		mt.play();

	}

}

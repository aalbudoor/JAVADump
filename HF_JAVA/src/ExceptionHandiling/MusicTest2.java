package ExceptionHandiling;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest2  {	
	public void play() {
	
		
		//We need a sequencer object. . its the main part of the MIDI device/instrument were using.
		//its the thing that sequences all the MIDI information into a 'song'. but we dont make a brand
		//new one ourselves == we have to ask the MidiSystem to give us one
		Sequencer sequencer = MidiSystem.getSequencer(); 
		
		System.out.println("We got a sequencer");
		

	
				}//close play



		public static void main(String[] args) {

			MusicTest1 mt = new MusicTest1();
				mt.play();

}

}

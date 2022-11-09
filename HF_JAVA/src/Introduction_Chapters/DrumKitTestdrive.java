package Introduction_Chapters;

public class DrumKitTestdrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrumKit d = new DrumKit();
		
		d.snare = false;
		
		d.playSnare();
		d.playTopHat();
		
		if (d.snare == true) {
			
			d.playSnare();
			
		}

	}

}

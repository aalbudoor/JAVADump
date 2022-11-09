package Introduction_Chapters;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Output o = new Output();
		o.go();
	}
	
	void go() {
		int y = 7;
		
		for (int x = 1; x < 8; x++) {
			y++;
			
			if (x > 4) {
				System.out.print(++y + " ");
			}
			
			if ( y > 14) {
				System.out.println(" x = " + x);
				break;//gets you out of the loop immedietly, right here. No iteration, no boolean test, just get out now!
			}
		}
	}

}

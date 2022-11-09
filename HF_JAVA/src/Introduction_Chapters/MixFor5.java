package Introduction_Chapters;

public class MixFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 30;
		
		for (int outer = 0 ; outer < 3 ; outer++) {
			//System.out.println("outer: " + outer );
			for (int inner = 4; inner > 1; inner--) {
				//System.out.println("inner: " + inner );
				//
				x = x + 0;
				//System.out.println("x-- : " + x);
				
				y= y -2;
				//System.out.println("y= y -2: " + y);
				
				if ( x == 6) {
					//System.out.println("if met");
					break;
				}
				 x = x + 3;
				// System.out.println("(2nd)x = x + 3: " + x);
			
				 //System.out.println("inner loop end");
			}
			
			
			y = y -2;
			//System.out.println("(2nd)y = y - 2: " + y);
		
			//System.out.println("outer loop end");
		}
		
		System.out.println(x + " " + y);

	}

}

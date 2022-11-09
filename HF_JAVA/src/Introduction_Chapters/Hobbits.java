package Introduction_Chapters;

public class Hobbits {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hobbits[] h = new Hobbits[3];
		
		int z = 0;
		
		while(z < 3) {
			
			
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			
			if( z == 1) {
				
				h[z].name = "frido";
			}
			
			if( z == 2) {
				
				h[z].name = "sam";
			}
			
			

			
			System.out.print(h[z].name + " is a ");
			System.out.println( " good hobbit name");
			z = z+1;
		}
			
			

	}

}

package Introduction_Chapters;

public class Mix4 {
	
	int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		Mix4[] m4a = new Mix4[20];
		
		int x = 0;
		
		//
		while ( x < 19) {
			
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			System.out.println(" m4a[x].counter = m4a[x].counter + 1;  " + m4a[x].counter);
			count = count + 1;
			System.out.println( "count = count + 1: " + count);
			count = count + m4a[x].maybeNew(x);
			System.out.println( " count = count + m4a[x].maybeNew(x); " + count);
			x = x +1;
			//System.out.println(count);
			
		}
		//once the while and method parts are met then print statement will run 
		System.out.println(count + " " + m4a[1].counter);
		

	}
	
	public int maybeNew(int index) {
		
		//System.out.println(index);
		//
		if (index < 1) {
			
			Mix4 m4 = new Mix4();
			m4.counter = m4.counter + 1;
			System.out.println(" m4.counter = m4.counter + 1;  " + m4.counter );
			return 1;
		}
		
		return 0;
	}

}

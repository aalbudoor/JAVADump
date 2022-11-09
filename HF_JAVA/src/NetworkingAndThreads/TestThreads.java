package NetworkingAndThreads;


//Threads from two different classes are updating the same object in a third class, because both threads are accessing
//single instance of Accum the line of code:

//private static Accum a = new Accum();creates a static instance of Accum (remember static means one per class).
//and the private constructor in Accum means that no one else can make an Accum object. These two techniques
//(private constructor and static getter methods) used together, create whats known as a 'Singleton' -- an OO patern to restrict
//the number of instances of an object that can exist in an application. (usually theyres just a single instance of 'singleton' hence the name)
//but you can use the pattern to restrict the instance creation in whatever way you choose.

public class TestThreads {
	

	public static void main (String[] args) {
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();

		
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		
		one.start();
		two.start();
		
	}
	
}
	
	class Accum {
		
		//create a static instance of class Accum
		private static Accum a = new Accum();
		
		private int counter = 0;
		
		//A private constructor
		private Accum() { }
		
		public static Accum getAccum() {
			
		return a;
		}
		
		
		
		public void updateCounter(int add) {
			counter =+ add;
			
		}
		
		
		public int getCount() {
			return counter;
		}
		
	
	
		
	}
	
	
	class ThreadOne implements Runnable {
		
		Accum a = Accum.getAccum();
		
		public void run() {
			
			for (int x = 0; x < 98; x++) {
				a.updateCounter(1000);
				
			
			
			try {
					
				
				
				Thread.sleep(50);
				
				
			} catch(InterruptedException ex) {	}
			
			
			}
			
			System.out.println("one " + a.getCount());
		}
		
		
	}
	
	
	class ThreadTwo implements Runnable {
		
		Accum a = Accum.getAccum();
		
		
		
		public void run() {
			
			for (int x = 0; x < 99; x++) {
				a.updateCounter(1);
				
			
			
			try {
				
			
				
				Thread.sleep(50);
				
				
			} catch(InterruptedException ex) {}
			
			
			}
			
			System.out.println("two " + a.getCount());
			
		}
		
	}
		

	
	



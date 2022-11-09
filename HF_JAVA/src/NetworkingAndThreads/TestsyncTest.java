package NetworkingAndThreads;
//see page 513 and 515 for details

public class TestsyncTest {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.start();
		b.start();
		
		

	}

}

class TestSync implements Runnable {
	private int balance;
	
	public void run() {
		for (int i = 0; i <5; i++) {		//each thread runs 50 times, incrementing the balance on each iteration
			increment();
			System.out.println("balance is " + balance);
		}
	}
	
	public void increment() {
		int i = balance;			//heres the crucial part! we increment the balance by adding 1 
									// to whatever the value of balance was AT THE TIME WE READ IT (rather than adding 1 to whatver the 
									//current value is)
		balance = i + 1;			
	}
	


}

//Solution: 
//
//	public synchronized void increment() {
//	int i = balance;			//heres the crucial part! we increment the balance by adding 1 
//								// to whatever the value of balance was AT THE TIME WE READ IT (rather than adding 1 to whatver the 
//								//current value is)
//	balance = i + 1;			
//}
package NetworkingAndThreads;

public class MyRunnable2 implements Runnable{

	
	//Runnable has only one method to implement (public void run()) with no arguments. This
	//is where you put the JOB the thread is supposed to run. This is the method that goes at the bottom of the new Stack

	public void run() {
		go();
		
	}

	public void go() {
		
		try {
			Thread.sleep(2000);						//calling sleep here will force the new thread to leave the currently-running state
		} catch (InterruptedException ex) {			
			ex.printStackTrace();
		}
											//The main thread will become the currently-running, thread again, and print out 
											//"back in main". Then there will be a pause (for 2 secs) before we get to THIS LINE
											//which calls doMore() and prints out "top o the stack"
		doMore();							// <--------THIS LINE
	}
	
	public void doMore() {
		System.out.println("top 'o the stack");
	}
	

}
	
	
 class ThreadTestDrive {
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable theJob = new MyRunnable2();
		//pass the new Runnable instance into the new THread constructor. This tells
		//the thread what method to put on the bottom of the new stack. In ohter words, 
		//the first method that the new Thread will run
		Thread t = new Thread(theJob);
		
		t.start();
		
		System.out.println("back in main");

	}


}
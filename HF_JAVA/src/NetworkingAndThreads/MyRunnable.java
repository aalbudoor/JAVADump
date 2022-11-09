package NetworkingAndThreads;

public class MyRunnable implements Runnable { 
	
	//Runnable has only one method to implement (public void run()) with no arguments. This
	//is where you put the JOB the thread is supposed to run. This is the method that goes at the bottom of the new Stack
	//2.
	public void run() {
		go();
		
	}
	//2.
	public void go() {
		doMore();
	}
	//2.
	public void doMore() {
		System.out.println("top 'o the stack");
	}
	

}
	
	
 class ThreadTester {
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable threadJob = new MyRunnable();
		//pass the new Runnable instance into the new THread constructor. This tells
		//the thread what method to put on the bottom of the new stack. In ohter words, 
		//the first method that the new Thread will run
		Thread myThread = new Thread(threadJob);
		
		//1.
		myThread.start();
		
		System.out.println("back in main");

	}


}
 
 //The stacks look like the following:				
 
 //1. (main thread)					2.(new Thread)
 
 //------------------------			---------------
 //	|	myThread.start()  |			|	doMore()  |	
 //	-----------------------			---------------
 //	|	main()			  |			|	go()	  |
 //------------------------			---------------
 //									|	run()	  |
 //									---------------
 
 
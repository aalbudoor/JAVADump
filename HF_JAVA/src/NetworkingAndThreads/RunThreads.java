package NetworkingAndThreads;
//Making and starting two threads

////Giving your threads name and using the names to tell which thread is runnning
public class RunThreads implements Runnable {
	
	public static void main (String[] args) {
		RunThreads runner = new RunThreads();		//make one runnable instance
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);		//Make two threads, with the same Runnable (the same job)
		alpha.setName("Alpha thread");
		beta.setName("Beta Thread");		//name the threads
		alpha.start();
		beta.start();		//start the threads
	}
	
	public void run() {
		for (int i = 0 ; i < 25 ; i++) {				//each thread will run through the loop, printing its name each time 
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
		}
	}

}

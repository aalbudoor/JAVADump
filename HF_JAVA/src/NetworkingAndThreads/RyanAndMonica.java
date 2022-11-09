package NetworkingAndThreads;



class BankAccount {
	private int balance = 100;	//The account starts with a balance of 100
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

public class RyanAndMonica implements Runnable {
	
	//There will be only ONE instance of the RyanandMonicaJob. That means only ONE instance of the bank account
	//Both threads will access this one account 
	private BankAccount account = new BankAccount();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RyanAndMonica theJob = new RyanAndMonica();	//instantiate the Runnable (job)
		//Make two threads, giving each thread the same runnable
		//job. That means both threads will be accesing the one account instance variable in the Runnable class
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();

	}

	@Override
	public void run() {
		//In the run() method, a thread loops through and tries to make a withdrawl with each iteration. After
		//the withdrawl, it checks the balance once again to see if the account is overdrawn.
		
		for (int x = 0; x< 10; x++) {
			makeWithdrawal(10);
			
			if (account.getBalance() < 0) {
				System.out.println("Overdrawn!");
			}
		}
		
	}
	
	private void makeWithdrawal(int amount) {
		
		//check the account balance, and if theres not enough money,
		//we just print a message. If there is enough, we go to sleep, then wake up and complete the 
		//withdrawl, just like Ryan did.
		
		if (account.getBalance() >= amount) {		
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " woke up");
			account.withdraw(amount);//withdrawing 
			System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
			System.out.println(account.getBalance());
			
		} else {
			System.out.println(" Sorry, not enough for " + Thread.currentThread().getName());
		}
	}

}
//The makeWithdraw() method always checks the balance before making a withdrawal but still we overdraw the account.

//results:
//	
//	Ryan checks the balance sees that theres enogh money, and then falls asleep.
//	
//	Meanwhile, monica comes in and checks the balance. She too sees that theres enogh money. she has no idea that Ryan is going
//	to wake up and complete a withdrawal
//	
//	Monica falls asleep
//	
//	Ryan wakes up and completes his withdrawal.
//	
//	monica wakes up and completes her withdrawal. Big problem!! in between the time when she checked the balance and made
//	a withdrawal, Ryan woke up and pulled money from the account
//	
//	Monica's check of the account was not valid, because ryan had alreads checked and was still in the middle of making a withdrawal
//	
//	Monica must be stopped from getting into the account until Ryan wakes up and finishes his transaction. and vice-versa



//Solution: they need a lock for account access

//We need to make sure that once a thread enters the makeWithdraw() methid, It MUST BE ALLOWED TO FINSIH THE METHOD  
//before any other thread can enter

//use the synchronized keyword to modify a method so that only one thread at a time can access it.

//That how to protect the bank account. you dont put a lock on the bank account but you lock the method that does the banking transaction
//That way one thread gets to complete the whole transaction, start to finish, even if that thread falls asleep
//in the middle of the method (simple, just add synchrozide to the method decleration)

//private synchronized void makeWithdrawal(int amount) {
//	
//	//check the account balance, and if theres not enough money,
//	//we just print a message. If there is enough, we go to sleep, then wake up and complete the 
//	//withdrawl, just like Ryan did.
//	
//	if (account.getBalance() >= amount) {		
//		System.out.println(Thread.currentThread().getName() + " is about to withdraw");
//		
//		try {
//			System.out.println(Thread.currentThread().getName() + " is going to sleep");
//			Thread.sleep(500);
//		} catch (InterruptedException ex) {
//			ex.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName() + " woke up");
//		account.withdraw(amount);//withdrawing 
//		System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
//		
//	} else {
//		System.out.println(" Sorry, not enough for " + Thread.currentThread().getName());
//	}
//}

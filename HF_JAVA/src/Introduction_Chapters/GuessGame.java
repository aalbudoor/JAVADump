package Introduction_Chapters;

public class GuessGame {

	
	public void startGame() {
	
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3= new Player();

	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;
	
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	
	int targetNumber = (int) (Math.random() * 10);
	System.out.println("I am guessing between a number of 0 and 9");
	
	while (true) {
		
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.println("The number I am guessing is.." + guessp1);
		
		guessp2 = p2.number;
		System.out.println("The number I am guessing is.." + guessp2);
		
		guessp3 = p3.number;
		System.out.println("The number I am guessing is.." + guessp3);
		
		if (guessp1 == targetNumber) {
			p1isRight = true;
		}
		if (guessp2 == targetNumber) {
			p2isRight = true;
		
		}
		if (guessp3 == targetNumber) {
			p3isRight = true;
		}
		
		if (p1isRight || p2isRight || p3isRight) {
			
			System.out.println("We have a winner!!!!!");
			System.out.println("The target number was   " + targetNumber);
			System.out.println("Player 1 got it right..." + p1isRight);
			System.out.println("Player 2 got it right..." + p2isRight);
			System.out.println("Player 3 got it right..." + p3isRight);
			System.out.println("Game is over");
			
			break;
			
		}
		else {
			System.out.println("Try again....");
		}
		
	
		
	}

	}
}

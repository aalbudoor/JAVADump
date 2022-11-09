package NumbersAndStatic;

public class Foof {
	
	//non-static final variables
	
	final int size = 13;
	final int whuffie;
	
	Foof() {
		whuffie = 42;
	}
	
	void doStuff(final int x) {
		//you cant cange x
	}
	
	void doMore() {
		final int z = 7;
		//you cant change z
		
	}
		//final method 
		final void calcWhuffie() {

			//important things that must never be overidden
		}
		//can make class final means class cannot be extended 

	
	

}

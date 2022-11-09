package AppendixB;


//you can add a bunch of things to your enum like a constructor, methods, variables and something called a constant-specific class body. 
//Theyre not common, but you might run into them.

import java.lang.Enum.*;

public class HfjEnum {
	
	//for each enum theyre is an argument passed in to the constructor declared
	//there are the so-called sonstanct-specidic class bodies. think of them as overriding the basic
	//enum methos (in this case the sing() method) if sing() 
	//is called on a variable with an enum value of JERRY ot BOBBY
	enum Name { JERRY("Lead guitar") { public String sings() return "plaintively"; } 	
		
		},
	
	BOBBY("rhythm guitaar") { public String sings() return "hoarsley"; } 
	
		},

	PHIL("bass") ;
			
		private String instrument;
		
		Names(String instrument) {				//This is the enums cinstructor it runs once for each declared enum value (in this case it runs three)
			this.instrument = instrument;
			
		}
		public String getInstrument() {
			return this.instrument;
		}
		
		public String sings() {
			return "occasionally";
		}
		
		
	public static void main (String[] args) {
		
		for (Names n : Names.values()) {
			
			System.out.println(n);
			System.out.println(", instrument: " + n.getInstrument());
			System.out.println(", sings: " + n.sings());
		}

}

package AppendixB;
//You can create your own constants by making a varbialbe static final. but sometimes youll want to create a set
//of valid values to repersent the Only valid value for a varibale


//Whos in the band?

//Lets say that youre creating a website fot your favoite band, and you want to make sure that all of the comments are directed to a particular
//band member

public class TestEnum {
	
	public enum Members {JERRY, BOB, PHIL} ;
	public Members selectedBandMember;			//the selectedBandMemeber variable of type members and can only have a value of JERRY BOB or PHIL
	
	//later in the code
	
	if (selectedBandMemeber == Members.JERRY) {
		//do jerry related stuff
	}
	
	
	//usgin if/swith with enums
	
	//using the enums we just  created we can perform branches in our code either the if or sewith statement. sloe notice
	//that we can compare enum instances using either == or the .equals() method. usually == is considered better styls
	
	
	Members n = Members.BOB;		//assigingn an enum to a variable
	
	if (n.equals(Members.JERRY)) System.out.println("JERRY!!");
	if (n == Members.BOB) System.out.println("RatDog!!");
	
	Memebers ifName = Memebers.PHIL:
		
		switch(ifName) {
		
		case JERRY : System.out.println("Make it Sting");
		case PHIL : System.out.println("Go away");
		case BOB : System.out.println("Cassidy!!");
		}
		

}

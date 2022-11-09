package NumbersAndStatic;

public class PlayerATestDrive {
	
	
	//initializing a static varibale
	public static void main (String[] args) {
		System.out.println(PlayerA.playerCount);
		
		PlayerA a = new PlayerA("Tiger Woods");
		
		System.out.println(PlayerA.playerCount + a.name);
		
		
		//using PlayerA to access a static variable just like a static method - with the class name
		
		//output : 
		//0 (before any instances are made)
		//1 After an object is created 
	}

}

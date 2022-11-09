package NumbersAndStatic;
public class StaticSuperTests1 extends StaticSuper1 {


	static int rand;
	
	static {
		
		rand = (int) (Math.random() * 6);
		System.out.println("static block " + rand);
	
	}
	
	StaticSuperTests1() {
	
	System.out.println("Constructor");
	
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("in main");
		StaticSuperTests1 st = new StaticSuperTests1();
		
		
	}




}
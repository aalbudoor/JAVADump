package ExceptionHandiling;

class MyEx1 extends Exception {

}

public class ExTestDrive1 {
	
	
	static void doRisky(String t) throws MyEx1 {
		
		System.out.print("h");
		
		if ("yes".equals(t)) {
			throw new MyEx1();
		}
		
			System.out.print("r");
			System.out.print("o");

	}
		
	public static void main(String[] args) {
		
			String test = "no";
		
			try { 
				
			System.out.print("t");
			doRisky(test);
				
			} catch (MyEx1 e) {
					
			System.out.print("a");
			
			} finally {
				
			System.out.print("w");
			System.out.print("s");
			
			}


			
			
			
			
			
	}


}
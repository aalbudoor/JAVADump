package ExceptionHandiling;

public class TestExceptions {
	
	public static void main (String[] args) {
		
		String test = "no";
		
		//TestExceptions te = new TestExceptions();
		
		try {
			System.out.println("Start try");
			
			//if method was not static 
			//te.doRiskyThing(test)
			doRiskyThing(test);
			System.out.println("end try");
		} catch( ScaryException se) {
			System.out.println("scary exception");
		} finally {
			System.out.println("finally");
		}
			
			System.out.println("end of main");
	}
		
		
		static void doRiskyThing(String t) throws ScaryException {
			
			System.out.println("Start of Risky");
			
			if (t.equals("yes")) {
				
				throw new ScaryException();
				
			}
			
			System.out.println("end of risky");
			return;
			
		}
	

}

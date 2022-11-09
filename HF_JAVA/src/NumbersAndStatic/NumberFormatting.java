package NumbersAndStatic;

public class NumberFormatting {

	public static void main(String[] args) {

		//note that there are only two argumnets to this method 
		// te first part of the method is the instructions and the second argument is what the 
		//instructions are going to be applied to
		String s = String.format("% , d" ,  1000000000);
		
		
		String l = String.format("I have %.2f bugs to fix", 476578.09876);
		
		//output: I have 476578.10 bugs to fix
		
		// Adding a comma
		
		String n = String.format("I have %,.2f bugs to fix", 476578.09876);
		
		//output: I have 476,578.10 bugs to fix
		
		//___________________________
		
		// The format specifier
		
		// %[argument number][flags][width][.precision] type
		
		// format("% , 6 . 1 f", 42.000);
		
		//format("%,6.1f", 42.000);
		
		//Having more than one argument
		
		int one = 20456654;
		double two = 100567890.248907;
		String s3 = String.format("the rank is %,d out of %,.2f", one, two);

	}

}

package NumbersAndStatic;

public class WrapperUtilityMethods {
	
	String s = "2";
	// cannot do String t = "two";
	// int y = Integer.parseInt(t);
	int x = Integer.parseInt(s);
	double d = Double.parseDouble("429.24");
	
	boolean b = Boolean.parseBoolean("true");
	
	
	//Now in reverse turning a primitive number into a String
	
	double d2 = 42.5;
	String doubleString = "" + d; // remember concatenating with a string becomes stringified
	
	//or
	
	double d3 = 43.5;
	String doubleString1 = Double.toString(d3);
			
	
	

}

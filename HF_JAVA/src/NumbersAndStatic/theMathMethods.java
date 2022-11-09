package NumbersAndStatic;

public class theMathMethods {
	
//	Math.random()
//	returns a double between 0.0 through (but not including) 1.0
//	
	double r1 = Math.random();
	int r2 = (int) (Math.random() * 5);
	
//	MAth.abs()
//	returns a double that is absolute value of the argument.
//	the method is overloaded, so if you pass it an int
//	it returns an int. pass it a double it returns a double
	
	int x = Math.abs(-240);// 240
	double d = Math.abs(240.45);//240.45
	
//	Math.round()
//	returns an int or long (depending on whether the argument is a float
//	or a double) rounded to the nearest integer value.
//	
	int x1 = Math.round(-24.8f);//25
	int y = Math.round(24.45f);//24
	
//	Math.min()
//	returns a value that is the minimum of the two arguments. the 
//	method is overloaded to take ints, longs, floats, or doubles
//	
	int x2 = Math.min(240, 245); //240
	double y2 = Math.min(240.68, 245.32);//245.32
	
//	Math.max()
//	returns a value that is max of the two arguments.
//	the method is overloaded to take ints, longs,floats or doubles
//	
	int x3 = Math.max(24,240);//240
	double y3 = Math.max(3.4, 3.5); //3.5
	
	

}

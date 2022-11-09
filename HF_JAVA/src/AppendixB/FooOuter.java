package AppendixB;
// Static nested classes 

//WE STARTED USING NESTED INNER CLASSES AS A SOLUTION FOR IMPLEMENTING LISTENER INTERFACES, where the class is 
//simply nested within the curly braces of another emclosing class. And remember it means you
//need an instance of the outer class in order to get an instance of the inner class, because the inner class is a memebr of the outer/enclosing class 

//But there are other kinds of inner classes starting with static and anonymous.


//Static nested class
//Satic means something tied to a class, not a particulat instance. A static nested class 
//looks just like the non-static classes we used for event listeners, except theyre marked with the keyword static

public class FooOuter {
	
	//A static nested class is just that - a class enclosed within another, and marked with the static modifier
	static class BarInner {
		void sayIt() {
			System.out.println("method of a static inner class");
		}
	}

}


class Test {
	public static void main (String[] args) {
		
		//becasue static nested class is static, you dont use an instance of the outer class. You just use the name of the class, the same way you invoke
		//static methods ot access static variables
		FooOuter.BarInner foo = new FooOuter.BarInner();
	}
}


//Static nested class are mostre like regular non-nested class in that they dont enjoy a special relationship with 
//the enclosing object. But because static nested class res still
//a member of the enclsoiging class, theys tilll get access to any private memebrs of the outer class. BUT ONLY THE ONES THAT ARE STATIC.
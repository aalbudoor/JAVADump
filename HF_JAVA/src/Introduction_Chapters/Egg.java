package Introduction_Chapters;

import java.util.ArrayList;

public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. A new ArrayList object is created on the heap. its Little because its empty
		//<Egg> means make this a list of Egg objects
		ArrayList<Egg> myList = new ArrayList<Egg>();
		
		//2. put something in it 
		//Now the ArrayList grows a "box" to hold the egg object
		Egg s = new Egg();
		

		myList.add(s);
		
		//3.The ArrayList grows again to hold the second Egg object
		Egg b = new Egg();
		
		myList.add(b);
		
		
		//4. Find out how many things are in it
		//The ArrayList is holding 2 objects so the size() method returns 2.
		int theSize = myList.size();
		
		//5.Find out if it contains something
		//the ArrayList Does contain the Egg object referenced by 's', so contains() return true
		boolean isIn = myList.contains(s);
		
		//6.Find out where something is(i.e its index)
		//ArraylList is zero-based (means first index is 0) and size the object referenced by 'b' was the second thing in the list,
		//indexOf() returns 1.
		int idx = myList.indexOf(b);
		
		//7.FInd out if its empty
		//its definitely NOT empty, so isEmpty() returns false
		boolean empty = myList.isEmpty();
		
		//Remove something from it
		myList.remove(s);
		
		System.out.println(theSize);
		System.out.println(isIn);
		System.out.println(idx);
		System.out.println(empty);
	}

}

package CollectionsWithGenerics;
import java.util.*;

//imagine you want a collection that acts like a property list, where you give it a name and it gives you backa a value associated with that name

//Each element in a map is actually Two objects - a key and a value. You can have duplicate values, but NOt duplicate keys 


public class TestMap {
	
	public static void main (String[] args) {
		
		//Hash map needs two type parameters - one for the key and one for the value
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		//use put instead of Add() and now of course it takes two arguments (key, value)
		scores.put("Kathy", 42);
		scores.put("Bert", 343);
		scores.put("sky",420);
		
		
		System.out.println(scores);
		System.out.println(scores.get("Bert"));		//the get() method takes a key, and returns the value (in this case an integer)
	}
}

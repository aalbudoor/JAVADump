package Abstract;


public class MyDogList extends MyAnimalList{
	
	//use plain old Dog array behind the scenes 
	private MyDogList[] dogs = new MyDogList[5];
	
	//we'll increment this each time a new DOg is added
	private int nextIndex;
	
	/*
	public void add(MyDogList d) {
		
		//if we are not already at the limit of the MyDogList array
		//add the dog and print the message 
		if (nextIndex < dogs.length) {
			
			dogs[nextIndex] = d;
			
			System.out.println("Dog added at " + nextIndex);
			
			//increment, to give us the next index to use 
			nextIndex++;
		}
	}
	*/

}

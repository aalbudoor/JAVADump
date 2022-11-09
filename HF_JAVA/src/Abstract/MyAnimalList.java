package Abstract;

public class MyAnimalList {
	
	private MyAnimalList[] animals = new MyAnimalList[5];
	
	private int nextIndex = 0;
	
	public void addAnimal(MyAnimalList an) {
		
		if (nextIndex < animals.length) {
			
			animals[nextIndex] = an;
			
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
			
		}
		
	}
	
	

}

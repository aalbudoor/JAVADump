package Introduction_Chapters;

public class DogBark {
	
	int weight;
	String name;

	
	
	void barkWeight() {
		
		if (weight > 20) {
			
			System.out.println("Woof Woof !!");
		
		} else if (weight > 14) {
			
			System.out.println("Ruff Ruff !!");
		
		} else  {
			
			System.out.println("Yupp Yupp !!");
		}
	}
	
	
	void barkWeight2(int numOfBark) {
		
		while (numOfBark > 0) {
			
			System.out.println("Yippy Yippy!!");
			
			numOfBark = numOfBark - 1;
		}
	}

}

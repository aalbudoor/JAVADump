package Introduction_Chapters;

public class GoodDog {
	
	private int weight1;
	String name;

	
	
	public int getWeight1() {
		return weight1;
	}
	
	public void setWeight1 (int w1) {
		
		weight1 = w1;
	}
	
	void barkWeight1() {
		
		if (weight1 > 20) {
			
			System.out.println("Woof Woof !!");
		
		} else if (weight1 > 14) {
			
			System.out.println("Ruff Ruff !!");
		
		} else  {
			
			System.out.println("Yupp Yupp !!");
		}
	}

}

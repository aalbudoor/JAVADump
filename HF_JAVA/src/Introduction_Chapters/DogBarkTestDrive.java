package Introduction_Chapters;

public class DogBarkTestDrive {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DogBark dog1 = new DogBark();
		dog1.name = "Dominos";
		dog1.weight = 35;
		//d1.bark();
		
		
		DogBark dog2 = new DogBark();
		dog2.name = "Al";
		dog2.weight = 15;
		//d2.bark();
		
		DogBark dog3 = new DogBark();
		dog3.name = "Terry";
		dog3.weight = 3;
		//d3.bark();
		
		dog1.barkWeight();
		dog2.barkWeight();
		dog3.barkWeight();
		
		
		DogBark dog4 = new DogBark();
		dog4.name = "Terry";
		dog4.weight = 5;
		
		dog4.barkWeight2(3);
		
		
	}

}

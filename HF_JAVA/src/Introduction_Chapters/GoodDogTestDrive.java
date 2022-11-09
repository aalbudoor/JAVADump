package Introduction_Chapters;

public class GoodDogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDog one = new GoodDog();
		one.setWeight1(21);
		
		GoodDog two = new GoodDog();
		two.setWeight1(5);
		
		System.out.println("Dog one:" + one.getWeight1());
		System.out.println("Dog one:" + two.getWeight1());
		
		one.barkWeight1();
		two. barkWeight1();
		
		
		//DEclare and create a dog array to hold 7 dog refrences
		
		GoodDog[] pets = new GoodDog[7];
		
		//Create two new dog objects and assign them to the first two array elements
		pets[0] = new GoodDog();
		pets[1] = new GoodDog();
		
		
		// call methods on the two dog objects
		pets[0].setWeight1(16);
		
		int x = pets[0].getWeight1();
		
		pets[1].setWeight1(25);
	}

}

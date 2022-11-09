package CollectionsWithGenerics;
import java.util.*;

//If a method argument is an array of Animals, it will also take an array of any Animal subType.
//
//in other words, if a method is declared as:
//	
//	void foo(Animal[] a) {}
//
//Assuming Dog extends Animal, you are free to call both:
//	
//	foo(anAnimalArray);
//	
//	foo(aDogArray);

public class TestGenerics1 {

	public static void main(String[] args) {
		new TestGenerics1().go();

	}
	
	public void go() {
		//Declare an animal array that takes both dogs and cats 
		AnimalB[] animalsB = {new DogB(), new CatB(), new DogB()};
		//declare and create a dog array that holds only dogs (the compiler wont let you put a cat in)
		DogB[] dogsB = {new DogB(), new DogB(), new DogB()};
		//call takeAnimal() using both array types as arguments 
		takeAnimals(animalsB);
		takeAnimals(dogsB);
	}
	
	//Ghe crucial point is that the takeAnimlas() method can take an Animal[] or a Dog[], since Dog IS-A Animal (polymorphisim action)
	public void takeAnimals(AnimalB[] animalsB) {
		
		for (AnimalB a: animalsB) {
			//remember we can only call the meothds declared in type animal, since the animlas parameter is of type Animal array,
			//and we dont need to do any casting
			a.eatB();
		}
	}

}


/*

//Now trying ArrayList instead of Arrays
		
		public void go() {
				ArrayList<AnimalB> animalsB = new ArrayList<AnimalB>();		//changing from AnimalB[] to ArrayList<AnimalB>
				animlasB.add(new DogB());
				animlasB.add(new CatB());
				animlasB.add(new DogB());
				
				takeAnimalsB(animalsB);					//taking ArrayList instead of arrays
				
				public void takeAnimals(ArrayList<AnimalB> animalsB) {				//The method now takes ArrayList instead of Arrays 
	
				for (AnimalB a: animalsB) {
	
				a.eatB();
				
			}



*/

/*

//Now trying with ArrayList<Dog> with the takeAnimals method will it work? no!.
		
		public void go() {
				ArrayList<AnimalB> animalsB = new ArrayList<AnimalB>();		
				animlasB.add(new DogB());
				animlasB.add(new CatB());
				animlasB.add(new DogB());
				takeAnimalsB(animalsB);				//we know this line worked fine
				
				//make a dog arraylist and put a couple dogs in
				
				ArrayList<DogB> dogsB = new ArrayList<DogB>	();
				dogsB.add(new DogB());
				dogsB.add(new DogB());
				takeAnimalsB(dogsB);				//this is where it goes wrong
				
				public void takeAnimals(ArrayList<AnimalB> animalsB) {				
	
				for (AnimalB a: animalsB) {
	
				a.eatB();
				
			}

		//Reason/Summary: If you declare a method to take ArrayList<Animal> it can take only an ArrayList<Animal>, not ArrayList<Dog> or ArrayList<Cat>

*/

//____________________________________________________



/*


//Wild card to the rescue 

		
		public void go() {
				ArrayList<AnimalB> animalsB = new ArrayList<AnimalB>();		
				animlasB.add(new DogB());
				animlasB.add(new CatB());
				animlasB.add(new DogB());
				takeAnimalsB(animalsB);				//we know this line worked fine
				
				//make a dog arraylist and put a couple dogs in
				
				ArrayList<DogB> dogsB = new ArrayList<DogB>	();
				dogsB.add(new DogB());
				dogsB.add(new DogB());
				takeAnimalsB(dogsB);				//this is where it goes wrong
				
				public void takeAnimals(ArrayList<? extends AnimalB> animalsB) {	//here the wildCard is used			
	
				for (AnimalB a: animalsB) {
	
				a.eatB();
				
			}
			
			//Alternate Syntax:
			 
			 // public <T extends AnimalB> void takeThing(ArrayList<T> list)

		//If you have two arguments then you can use the following syntax
		 
		 // public <T extends AnimalB> void takeThing(ArrayList<T> one, ArrayList<T> two)
		  
		  //or
		   
		   // public void takeThing(<? extends AnimalB> one, <? extends AnimalB> two)

*/










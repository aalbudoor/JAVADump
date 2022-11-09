package Introduction_Chapters;

public class Dog {
	
	String name;
	 int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make a dog object and access it 
		
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "fido";
		
		
		//now make a dog array
		Dog[] myDogs = new Dog[3];
		
		//and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//now access the dogs using the array
		//refrences
		myDogs[0].name = "fred";
		myDogs[1].name = "marge";
		
		//what is myDogs[2] name ?
		System.out.print("Last dogs name is ");
		System.out.println(myDogs[2].name);
		
		//now loop through the array
		//and tell the dogs to bark
		
		int x = 0;
		while (x < myDogs.length) {
			
			myDogs[x].bark();
			x = x +1;
		}
		
		
		

	}
	
	public void bark() {
		System.out.println(name + " says woof !!");
	}

}

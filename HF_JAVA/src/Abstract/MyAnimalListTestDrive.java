package Abstract;
import extended.Dog;

public class MyAnimalListTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAnimalList list = new MyAnimalList();
		
		MyDogList a = new MyDogList();
		MyCatList c = new MyCatList();
		
		
		
		list.addAnimal(a);
		list.addAnimal(c);
	}

}

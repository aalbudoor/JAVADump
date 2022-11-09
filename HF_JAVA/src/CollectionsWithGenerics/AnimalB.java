package CollectionsWithGenerics;


abstract class AnimalB {
	
	public void eatB() {
		System.out.println("animal eating");
	}

}


class DogB extends AnimalB {
	void bark() {}
}

class CatB extends AnimalB {
	void meow() {}
}
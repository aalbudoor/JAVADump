package IntroConstructors;

public class Duck {
	
	int pounds = 6;
	float floatability = 2.1F;
	String name = "generic";
	long[] feathers = {1,2,3,4,5,6};
	boolean canFly = true;
	int maxSpeed = 25;
	
	
	public Duck() {
		System.out.println("type 1 Duck");
	}
	
	public Duck(boolean fly) {
		canFly = fly;
		System.out.println("type 2 Duck: " + " , canFly: " + canFly);
	}
	
	public Duck(String n, long[] f) {
		name = n;
		feathers = f;
		System.out.println("type 3 Duck: " + " , name: " + name + " , feathers: " + feathers);
	}
	
	public Duck(int w, float f) {
		pounds = w;
		floatability = f;
		System.out.println("type 4 Duck: " + " , pounds: " + pounds + " , floatability: " + floatability);
		
	}
	
	public Duck(float density, int max) {
		floatability = density;
		maxSpeed = max;
		System.out.println("type 5 Duck" + " , floatability: "+  floatability + " , maxSpeed: " + maxSpeed);
	}
}

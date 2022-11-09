package InheritanceAndPolymorphisim;

public class Mixed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();
		
		
		/*
		b.m1();
		c.m2();
		a.m3();
		*/
		
		/*
		c.m1();
		c.m2();
		c.m3();
		*/
		
		//acts like a C object
		a2.m1();
		a2.m2();
		a2.m3();
	}

}

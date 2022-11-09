package Introduction_Chapters;

public class TestStuff {
	
		
	void go() {
		
		TestStuff t = new TestStuff();
		t.takeTwo(12, 34);
				
	}
	
	void takeTwo(int x, int y) {
		
		int z = x + y;
		System.out.println("total is" + z);
	}
	
	void go1(int x, int y) {
		
		TestStuff t = new TestStuff();
		int foo = 3;
		int bar = 10;
		t.go1(foo, bar);
		
		int z = x + y;
		System.out.println("Total is " + z);
				
	}


}

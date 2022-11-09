package NumbersAndStatic;

public class TestBox {
	
	Integer i;
	int j;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestBox t = new TestBox();
		t.go();

	}
	
	public void go() {
		j = i;
		System.out.println(i);
		System.out.println(j);
	}

}

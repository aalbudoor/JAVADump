package Introduction_Chapters;

public class TryArea {
	
	public static int calcArea(int x, int y) {
		
		// height(x) * length(y)
		int area = x * y;
		
		return area;
	}
	
	int calcArea2(int height, int length) {
		
		return height * length;
	}
	
	public static void main (String[] args) {
		
		
		int a = calcArea(7, 12);
		
		short c = 7;
		
		System.out.println(a);
		
		calcArea(2,3);
		
		
		
	}

}

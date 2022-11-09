import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		int num1;
	
		
		System.out.println("Enter an Integer");
		num1 = console.nextInt();
		
		
		if (isEven(num1)) {
			
			System.out.println("is even");
		}
		else {
			
			System.out.println("is odd");
			
		}

	}

	public static boolean isEven(int number) {
		
		if ( number % 2 == 0) {
		
			return true;
	}
		else {
			
			return false;
			}
	}
	
}

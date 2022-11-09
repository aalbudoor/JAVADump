import java.util.Scanner;

public class CalculatingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Enter a Integer");
		num1 = console.nextInt();
		
		System.out.println("Enter a Integer");
		num2 = console.nextInt();
		
		int sum = getTotal(num1, num2);
		System.out.println("sum" + sum);

	}
	
	public static int getTotal(int number1, int number2) {
		
		int sum = number1 + number2;
		
		return sum;
		
	}

}

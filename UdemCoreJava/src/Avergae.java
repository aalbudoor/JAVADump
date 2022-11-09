import java.util.Scanner;

public class Avergae {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		  int num1, num2, num3;
		  
		  System.out.println("Enter Integer 1");
		  num1 = console.nextInt();
		  
		  System.out.println("Enter Integer 2");
		  num2 = console.nextInt();
		  
		  System.out.println("Enter Integer 3");
		  num3 = console.nextInt();
		  
		  
		  int  Calculating = avg(num1, num2, num3); 
		 System.out.println(Calculating);
		  }

		 
		 public static int avg(int number1, int number2, int number3){
		 
		 int adding = number1 + number2 + number3;
		 int avergae = adding/3;
		 return avergae ; 
		}
		
	}



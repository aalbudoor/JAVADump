package Introduction_Chapters;
import java.util.*;


public class ArrayListMagnet {
	
	public static void printAl(ArrayList<String> al) {
		
		for (String element : al) {
			
			
			System.out.print(element + " ");
		}
		System.out.println(" ");
			
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		//a.add(int index, obj element)
		a.add(0,"zero");
		a.add(1,"one");
		a.add(2,"two");
		
		a.add(3,"three");
		printAl(a);
		
		a.remove(2);
	

		
		
		if (a.contains("three")) {
			a.add("four");//because array list is of type string then object element will be a "four" instead of 4
		}
		printAl(a);
		
		if (a.indexOf("four") != 4) {
			a.add(4, "4.2");
		}

		printAl(a);
		
		
		if(a.contains("two")) {
			a.add("2.2");
		}
		
		printAl(a);
		

	}

}

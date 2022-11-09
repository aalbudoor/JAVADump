
public class Grades {

	public static void main(String[] args) {
		
		System.out.println("\nDisplaying Student Grades ...");

		  int[][] studentGrades = {{76, 52, 69, 83, 45, 90}, {22, 71, 67, 69, 40}, {53, 87, 91, 25}};

		  for (int i = 0; i < studentGrades.length; i++) {

		    System.out.print("\nDisplaying grades of students from class " + i + ": ");

		int max = 0; //re-initializing the max

		for (int j = 0; j < studentGrades[i].length; j++) {

		    if (studentGrades[i][j] > max) {

		    max = studentGrades[i][j];

		}

		System.out.print(studentGrades[i][j] + " ");

		}

		System.out.println("\nmax: " + max);

		  }  

		 

		    } 
	}



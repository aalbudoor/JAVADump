import java.util.Arrays;

public class Gpa2 {

	 public static void main(String[] args){
	        double lower =3.2;
	        double higher = 3.5;
	        int[] studentIdList = {1002,1003};
	        char[][] studentsGrades = {{'A','A','A','B'},{'A','B','B'}};
	        int[] output = getStudentsByGPA(lower,higher,studentIdList,studentsGrades);
	        System.out.println(Arrays.toString(output));

	    }
	
	 public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		 
		 double[] totalGpa = new double[studentIdList.length];
		 
		 int index = 0;
		 
		 for (int i = 0; i < studentIdList.length ; i++) {
			 
			 double sum = 0;
			
			 for (int j = 0 ; j <studentsGrades[i].length ; j++) {
				 
				char grade = studentsGrades[i][j];
				
				if (grade == 'A') {
					
					sum += 4.0;
				
				} else if (grade == 'B') {
					
					sum += 3.0;
				
				} else if (grade == 'C') {
					
					sum += 2.0;
				}
				
				double AvgGpa = grade/studentsGrades[i].length ;
				totalGpa[index] = AvgGpa;
				index++;
	 }
	 
		 }
		 return totalGpa;
		 
	 }
	 public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
		 
		 if (lower> higher || lower<0 || higher< 0 ) {
			 return null; 
		 }
		 
		 int[] filterdStudentIdList = new int[studentIdList.length];
		 double[] gpas = calculateGPA(studentIdList, studentsGrades);
		 
		 int filterdIndex = 0;
		 
		 for (int i = 0 ; i < gpas.length ; i++) {
			 
			 if (lower <= gpas[i] && higher >= gpas[i]) {
				 filterdStudentIdList[filterdIndex] = studentIdList[i];
				 filterdIndex++;
			 
		 }
	 }
		 System.out.println(Arrays.toString(studentIdList));
	        System.out.println(Arrays.toString(filterdStudentIdList));
		 return filterdStudentIdList;
		 
		 
		 }
	 
	 
	 }
	 

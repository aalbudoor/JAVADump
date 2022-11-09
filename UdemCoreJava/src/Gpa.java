import java.util.Arrays;
public class Gpa {

    public static void main(String[] args){
        double lower =3.2;
        double higher = 3.5;
        int[] studentIdList = {1002,1003};
        char[][] studentsGrades = {{'A','A','A','B'},{'A','B','B'}};
        int[] output = getStudentsByGPA(lower,higher,studentIdList,studentsGrades);
        System.out.println(Arrays.toString(output));

    }

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] gpas = new double[studentIdList.length];
        // {'A,A,A,B','A,B,C'}
        int index =0;
        for(int i=0;i<studentsGrades.length;i++){
            double sum =0;
            for(int j=0;j<studentsGrades[i].length;j++){
                    if(studentsGrades[i][j]=='A'){
                        sum = sum + 4;
                    }else if(studentsGrades[i][j]=='B'){
                        sum = sum + 3;
                    }else{
                       sum = sum + 2; 
                    }
            }
            double gpa = sum/studentsGrades[i].length;
            gpas[index] = gpa;
            index++;
        }


        return gpas;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if(lower <0 || higher < 0 || lower > higher){
            return null;
        }
        // invoke calculateGPA
       
        
        double[] gpas = calculateGPA(studentIdList,studentsGrades);
        
        System.out.println(Arrays.toString(gpas));
        
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
        
        int[] filterdStudentIdList = new int[studentIdList.length];
        
        int filterdCount =0;
        
        for(int i=0;i<gpas.length;i++){
           
        	if(lower <= gpas[i] && gpas[i] <= higher){
                
        		filterdStudentIdList[i] = studentIdList[i];
                
        		filterdCount++;
            }
        }
        
        System.out.println(Arrays.toString(filterdStudentIdList));
        
        int i=0;
        
        int[] outputStudentList = new int[filterdCount];
        
        for(int studentId : filterdStudentIdList){
            
        	if(studentId!=0){
               
        		outputStudentList[i] = studentId;
                
        		i++;
            }
        }
        System.out.println(Arrays.toString(studentIdList));
        System.out.println(Arrays.toString(filterdStudentIdList));
        return outputStudentList;



        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
    }

    
}
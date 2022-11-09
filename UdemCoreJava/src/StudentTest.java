
public class StudentTest {
	
	
public static void main(String[] args) {
		
		//This student object uses the first constructor
	Student student1 = new Student (2000, "Unita","female", 23 ,223_456_888L, 4.0, 'M');
	
	/*student2.id = 2000;
	student2.name = "Anita";
	student2.gender = "female";
	student2.phone = 223_456_888L;
	student2.GPA = 4.0;
	student2.degree = 'M';
	student2.international = false; */
	
	//Adding compute method within the constructor so no need to call it here
	//student2.compute();
	
	Student student2 = new Student(2001, "Sam", "Male", 19 ,225_783_446L, 3.2 , 'B', true );
	
	/*student3.id = 2001;
	student3.name = "Sam";
	student3.gender = "Male";
	student3.phone = 225_783_446L;
	student3.GPA = 3.2;
	student3.degree = 'B';
	student3.international = true; */

	//student3.compute();
	
	Student student3 = new Student(2002, "Eric", "Male", 21 ,673_421_999L, 2.1, 'M', true );
	
	/*student4.id = 2002;
	student4.name = "Eric";
	student4.gender = "Male";
	student4.phone = 673_421_999L;
	student4.GPA = 2.1;
	student4.degree = 'M';
	student4.international = false; */
	
	//student4.compute();
	System.out.println("\nStudent 1 : " + student1.name);
	System.out.println("\nStudent 2 : " + student2.name);
	System.out.println("\nStudent 3 : " + student3.name);
	
	student1.updateProfile("Auntia");
	System.out.println("\nupdateProfile : " + student1.name);
	
	/*Student student4 = student1;
	System.out.println("\nStudent 4 : " + student4.name);
	
	student4.updateProfile("Sally");
	System.out.println("\nupdateProfile : " + student1.name);

	 student4 = student2;
	System.out.println("\nStudent 4 : " + student4.name);
	
	student2 = student1;
	System.out.println("\nStudent 4 : " + student4.name);
	System.out.println("\nStudent 2 : " + student2.name);
	
	student4 = new Student();
	student4.updateProfile("Alex");
	System.out.println("\nStudent 4 : " + student4.name);
	
	System.out.println("\nStudent 1 : " + student1.name);
	System.out.println("\nStudent 2 : " + student2.name);
	System.out.println("\nStudent 3 : " + student3.name);
	System.out.println("\nStudent 4 : " + student4.name);*/
	
	Student[] students = {student1, student2, student3};
	
	/*Student temp = students[0];
	students[0] = students[2];
	students[2] = temp;*/
	
	swap(students, 0, 2);
	
	System.out.println("\nStudent 1 : " + students[0].name);
	System.out.println("\nStudent 2 : " + students[1].name);
	System.out.println("\nStudent 3 : " + students[2].name);
	
	
//testing out equal id method
	Student student4 = new Student (2002, "Eric", "Male", 21 ,673_421_999L, 2.1, 'M', true );
	
	boolean duplicate = student4.equals(student4);
	System.out.println(duplicate);
} 
	static void swap(Student[] students, int firstIndex, int secondIndex ) {
	
		Student temp = students[firstIndex];
		students[firstIndex] = students[secondIndex];
		students[secondIndex] = temp;
}
	public boolean equals(Student s, int id) {
		
		return id == s.id;
	}

}

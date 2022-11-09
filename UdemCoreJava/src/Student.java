
public class Student {
	
	static int studentCount;
	
	public int id;
	String name;
	String gender;
	int age;
	Long phone;
	double gpa;
	char degree;
	
	boolean international;	
	double tuitionFees = 2000.0;
	double internationalFees = 4000.0;
	
	Student(int Id, String Name ,String Gender, int Age, Long Phone, double Gpa, char Degree){
		
		//(this) allows boolean and since this constructor is for non-international include false as last parameter
		//(this) if inserting invocation statement this then it should be the first statement
		//(this) does not require to include data type
		this( Id,  Name , Gender, Age, Phone, Gpa, Degree, false);
	
		//compute()
	}
		//overloading constructor
		Student(int Id, String Name ,String Gender, int Age, Long Phone, double Gpa, char Degree, boolean International){
		
		this.id = Id;
		this.name = Name;
		this.gender = Gender;
		this.age = Age;
		this.phone = Phone;
		this.gpa = Gpa;
		this.degree = Degree;
		this.international = International;
		
		studentCount = studentCount + 1;
		
		if (international) {
			tuitionFees = tuitionFees + internationalFees;
	}
	
		System.out.println("\nID : " + id);
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("phone : " + phone);
		System.out.println("GPA : " + gpa);
		System.out.println("Degree : " + degree);
		System.out.println("Tuitioen fee : " + tuitionFees);
		System.out.println("studentCount count : " + studentCount);
	
		//compute()
	}

	/*
	void compute() {
		
		computeCount = computeCount + 1;
		
		if (international) {
			tuitionFees = tuitionFees + internationalFees;
	}
	
		System.out.println("\nID : " + id);
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("phone : " + phone);
		System.out.println("GPA : " + gpa);
		System.out.println("Degree : " + degree);
		System.out.println("Tuitioen fee : " + tuitionFees);
		System.out.println("Compute count : " + computeCount);
		

	}*/
	
	static void arraysA() {
		
		System.out.println("\nIntroduction to Arrays");
		
		/*int[] scores = new int[4];
		
		scores[0] = 50;
		scores[1] = 60;
		scores[2] = 70;
		scores[3] = 90; */
		
		//Alternate way of declaring arrays
		//int[] scores = new int[] {50, 60, 70 , 90};
		
		//Another alternate way of declaring arrays
		int[] scores ={50, 60, 70 , 90};
		
		System.out.println("Term 1: " + scores[0]);
		System.out.println("Term 2: " + scores[1]);
		System.out.println("Term 3: " + scores[2]);
		System.out.println("Term 4: " + scores[3]);
		System.out.println("No. of Terms: " + scores.length);
		
		 /*Student[] students = { new Student(), new Student(), new Student()};
		
		 student[0] = new student();
		 student[1] = new student();
		 student[2] = new student();
		 
		students[0].name = "John";
		students[1].name = "Anita";
		students[2].name = "Eric";
		
		System.out.println("Student 1: " + students[0].name);
		System.out.println("Student 2: " + students[1].name);
		System.out.println("Student 3: " + students[2].name); */
		
	}
	
	Student() {}
	
	boolean updateProfile(String name) {
		this.name = name;
		
		return true;
	}
	
	
	//arraysA();



}

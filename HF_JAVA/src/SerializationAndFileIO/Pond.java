package SerializationAndFileIO;
//Serialization is all or nothing

//Either the entrie object graph is serialized correctly or serialization fails

//You cant serializeze a pond object if its Duck instance variable refuses to be serialized
//(By not implementing Serializable)

import java.io.*;
public class Pond implements Serializable {	//Pond objects can be serialized 
	
	private Duck duck = new Duck();		//class pond has one instance variable, a duck 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pond myPond = new Pond();
		
		try {
			FileOutputStream fs = new FileOutputStream("Pond.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(myPond);		//When you serialize myPond (a pond object), its Duck instance variable automatically gets serialized
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}

//Yikes!!, Duck is not serializable, it doesnt implement serializable,
//so when you try to serialize a Pond object, it fails because the pond's Duck instance variable cannot be saved 

		/*
		public class Duck {
			
			//Duck code goes here 
		 */
			
		
		
		
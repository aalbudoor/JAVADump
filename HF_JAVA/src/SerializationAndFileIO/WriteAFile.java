package SerializationAndFileIO;
import java.io.*;

public class WriteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileWriter writer = new FileWriter("Foo.txt");	//if the file doesnt exist it will create one
			
			writer.write("hello foo!");	//the write() method takes a string
			
			writer.close();		//close when your done 
		
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}

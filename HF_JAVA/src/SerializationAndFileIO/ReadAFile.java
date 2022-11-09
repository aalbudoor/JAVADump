package SerializationAndFileIO;

//well us a File object to repersent the file, a FileReader to do the actual reading.
//and a BuddeedReader to make the reading more efficient.

//The read happpens by reading lines in a while loop, ending loop when the result of a readLine() is null.
//Summary: read stuff in a while loop termenating when theres nothing left to read (which we
//know because the result of whatever read method were using is null)

import java.io.*;

public class ReadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File myFile = new File("MyText.txt");
			//A FileREader is a connection stream for characters, that connects to a text file.
			FileReader fileReader = new FileReader(myFile);
			
			//chain the FileREader to a BufferedREader for more efficient reading.
			//it'll go back to the file read only when the buffer is empty (because the program has read everything in it)
			
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;		//Make a string variable to hold each line as the line is read 
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line); 	//THis says, "read a line of text, and assign it to the String variable 'line'". While that variable is not
											//null (because there WAS something to read) print out the line that was just read."
				
											//Or another way of saying it "while there are still lines to read, read them and print them"
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}

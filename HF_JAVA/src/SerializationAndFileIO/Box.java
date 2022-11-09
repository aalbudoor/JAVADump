package SerializationAndFileIO;
//- If you want your class to be sterializable, implempent Serializable

// THe serializable interface doesnt have any methods to implement. its sole purpose is to announce that the class implementing it is
//serializable. In other words, objects of that type are saveable through the serialization mechanisim.

//if any superclass of a class is serlizable the subclass is automatically serialized

//objectOutputStream.writeObject(myBox); //Whatever goes here MUST implement, serializable or it will fail at run time

import java.io.*;

public class Box implements Serializable { //No methods to implement because implementing Serializable
	
	private int width;
	private int height;		//These two values will be saved
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox = new Box();
		
		myBox.setHeight(50);
		myBox.setWidth(20);
		
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");	//connect to a file named "foo.ser" if it exist. if it doesnt make a new file named "foo.ser"
			ObjectOutputStream os = new ObjectOutputStream(fs);		//Make an ObjectOutputStream chained to the connection stream
			os.writeObject(myBox);									//tell it to write the object
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	

}

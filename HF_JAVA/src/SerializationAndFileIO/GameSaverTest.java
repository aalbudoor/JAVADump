package SerializationAndFileIO;
import java.io.*;

public class GameSaverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "troll", new String[] {"bare hands", "big axe"});
		GameCharacter three = new GameCharacter(50, "Elf", new String[] {"spells", "invisiblity"});
		
		//imagine coed that does things with the characters that might change their state values
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
			
		} catch(IOException ex) {
			
			ex.printStackTrace();
			
		}
		
		one = null;		//we set them to null so we cant access the objects on the heap
		two = null;
		three = null;
		
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
		
			System.out.println("One's type: " + oneRestore.getType());
			System.out.println("Two's type: " + twoRestore.getType());
			System.out.println("Three's type: " + threeRestore.getType());
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}

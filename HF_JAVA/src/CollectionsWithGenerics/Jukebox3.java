package CollectionsWithGenerics;
import java.util.*;
import java.io.*;

//Chainging the Jukebox code to use Songs instead of Strings


public class Jukebox3 {
	

	
	//Change to an ArrayList of song objects instead of Strings
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox3().go();

	}
	
	//The method that starts loading the file and then prints the contents of the songList ArrayList
	void go() {
		getSongs();
		System.out.println(songList);
		
		//Call the static Collections sort() method, then print the list again. The second print out is in alphabetical order
		Collections.sort(songList);	//This is where it breaks, it worked fine when passed in an ArrayList<String>, but as soon as we tried to sort an 
									//ArrayList<Song>, it failed, so the solution is to go on the Song class and implement the Comprable interface 
									//then implment the method compareTo() 
									
									
		System.out.println(songList);
	}
	
	//Reading the file and call the addSong() method for each line
	void getSongs() {
		
		try {
			FileReader file = new FileReader("SongList.txt");
			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		
		
		//create a new Song object using the four tokens (which means the four pieces of info 
		//in the song file for this line), then add the Song to the list
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
		
		
	}

}

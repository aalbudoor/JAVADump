package CollectionsWithGenerics;
import java.util.*;
import java.io.*;

//Adding Collections.sort() to the Jukebox code
//The Collections.sort() method sorts a list of Strings alphabetically
public class Jukebox2 {
	
	ArrayList<String> songList = new ArrayList<String>(); //we'llstore song titles in an ArrayList of Strings

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox2().go();

	}
	

	void go() {
		getSongs();
		System.out.println(songList);
		
		//Call the static Collections sort() method, then print the list again. The second print out is in alphabetical order
		Collections.sort(songList);
		System.out.println(songList);
	}
	

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
		//we only want the song title, so add only the first token to the SongList
		songList.add(tokens[0]);
		
		
		
	}

}

package CollectionsWithGenerics;
import java.util.*;
import java.io.*;

//Using TreeSet

//Treeset is similar to hashset in that it prevents duplicates. but it also keeps the list sorted

public class Jukebox8 {
	

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox8().go();

	}
	

	void go() {
		getSongs();
		System.out.println(songList);

		Collections.sort(songList);							
									
		System.out.println(songList);
		
		//inistaite a treeSet instead of HashSet calling the no-arg TreeSet constructor means the set will use
		// the Song objects compareTo() method for the sort. We can add all the songs from the Hashset using addAll()
		
		TreeSet<Song> songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
		
		
	void getSongs() {
		
		try {
			FileReader file = new FileReader("SongListMore.txt");
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

		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
		
		
	}

}

package CollectionsWithGenerics;
import java.util.*;
import java.io.*;
//Objectivve to sort title and Artist (unlike previous jukeboxes which only sorted by Title)
// 3 new things in this code,
//1. Created an inner class that implements Comparator ()and thus the compare() method that does the work previously done by compareTo().
//2. Made an instance of the Comparator inner class
//3. Called the overloaded sort() method, giving it both the song list and the instance of the Comparator inner class.
//
//note: we also updated the Song class toString() method to print both the song title and the artist.
//(it prints title: artist regardless of how the list is sorted)


public class Jukebox5 {
	

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new Jukebox5().go();

	}
	
	//Create a new inner class that implements Comparator (note that its type parameter matches the type we're going to compare- in this case Song objects)
	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist()); 
			//one.getArtist() becomes a string 
			//compareTo(two.getArtist()) were letting the String variables do the actual comparison, since Strings already know how to alphabetize themselves
		}
	}
	

	void go() {
		getSongs();
		System.out.println(songList);
		

		Collections.sort(songList);	
									
									
		System.out.println(songList);
	
	
		ArtistCompare artistCompare = new ArtistCompare(); //make an instance of the Comparator inner class
		Collections.sort(songList, artistCompare);		//invoke sort(), passing it the list and a refrence to the new custom Comparator object
		
		System.out.println(songList);
		
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

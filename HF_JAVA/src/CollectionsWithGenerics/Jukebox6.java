package CollectionsWithGenerics;
import java.util.*;
import java.io.*;

//Using a HashSet instead of ArrayList 

public class Jukebox6 {
	

	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox6().go();

	}
	

	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist()); 
			
		}
	}

	void go() {
		getSongs();
		System.out.println(songList);

		Collections.sort(songList);							
									
		System.out.println(songList);
		
		HashSet<Song> songSet = new HashSet<Song>();		//here we create a new HashSet paramatized to hold songs
		songSet.addAll(songList);			//hashSet has a simple addAll() method that can take another collection and use it to populate the Hashset.
											//its as if we added each song one at a time
		System.out.println(songSet);
	
	
		ArtistCompare artistCompare = new ArtistCompare(); 
		Collections.sort(songList, artistCompare);	
		
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

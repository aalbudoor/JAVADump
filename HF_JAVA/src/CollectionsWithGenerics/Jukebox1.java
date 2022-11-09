package CollectionsWithGenerics;
import java.util.*;
import java.io.*;


public class Jukebox1 {
	
	ArrayList<String> songList = new ArrayList<String>(); //we'llstore song titles in an ArrayList of Strings
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox1().go();

	}
	
	//The method that starts loading the file and then prints the contents of the songList ArrayList
	void go() {
		getSongs();
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
	
	//The addSong method works just like the Quiz-card in the IO chapter -- you break the line (That has both the title and artist) into
	//two pieces (tokens) using the split() method
	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		//we only want the song title, so add only the first token to the SongList
		songList.add(tokens[0]);
		
		
		
		
	}

}

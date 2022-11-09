package CollectionsWithGenerics;

//were specifying the type that the implementing class can be compared against(the class name is song and inbetween comparable brackts must also be song
//i.e <Song>)

public class Song implements Comparable<Song>{
	
	//four instance variables for the four song attributes in the file
	String title;
	String artist;
	String rating;
	String bpm;
	
	//The song class with overriden hashCode() and equals()
	
	//The hashSet (or anyone else calling this method) sends it another song
	
	public boolean equals(Object aSong) {
		Song s = (Song) aSong;					
		return getTitle().equals(s.getTitle());	//title is a string and strings have an overridden equals() method. so all we have to do is ask one title
												//if its equal to the other songs title 
	}
	
	public int hashCode() {
		return title.hashCode();			//The String class has an overridden hashCode() method, so you can just return the result
											//of calling hashCode() on the title. Notice how hashCode() and equals() are using the SAMe instance variable
	}
	
	
	//The sort() method sends a Song to compareTo() to see how that song compares to the song on which the method was invoked
	//we simply pass the title String objects since we know Strings have a compareTo() method.
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}
	
	Song(String t, String a,  String r, String b){
		//the variables are all set in the constructor when the new Song is added
		title = t;
		artist = a;
		rating = r;
		bpm = b;
		
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public String getArtist() {
		
		return artist;
	}
	
	public String getRating() {
		
		return rating;
	}
	
	public String getBpm() {
		
		return bpm;
	}
	
	//We override toString() because when you do a System.out.print(aSongObject), we want to see the title.
	//wehn you do System.out.println(aListOfSongs), it calls the toString() method of EACH element in the list.
	public String toString() {
		return title + artist;
	}


}

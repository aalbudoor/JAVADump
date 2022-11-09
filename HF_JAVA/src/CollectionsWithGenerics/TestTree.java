package CollectionsWithGenerics;
import java.util.*;

//The first version of using a TreeSet, the elements in the list must be of a type that implements Comparable
public class TestTree {
	

	public static void main(String[] args) {
		new TestTree().go();
	}
	
	public void go() {
		Book b1 = new Book("How cats work");
		Book b2 = new Book("Remix your body");
		Book b3 = new Book("Finding Emo");
		
	
	
	TreeSet<Book> tree = new TreeSet<Book>();
	tree.add(b1);
	tree.add(b2);
	tree.add(b3);
	System.out.println(tree);
	
	}
	
	

}

class Book implements Comparable {	//implementing Comparable
	String title;
	public Book(String t) {
		title = t;
	}
	
	public int compareTo(Object b) {
		Book book = (Book) b;
		return (title.compareTo(book.title));
	}
}
package CollectionsWithGenerics;
import java.util.Comparator;
import java.util.TreeSet;



//Another way of using TestTree
//use the TreeSets overloaded constructor that takes a Comparator



public class TestTree2 {
	
	public static void main (String[] args) {
		new TestTree2().go();
	}
	
	public void go() {
		Book b1 = new Book("How cats work");
		Book b2 = new Book("Remix your body");
		Book b3 = new Book("Finding Emo");
		
	BookCompare bCompare = new BookCompare();
	TreeSet<Book> tree2 = new TreeSet<Book>(bCompare);
	
	tree2.add(new Book("How cats work"));
	tree2.add(new Book("Remix your body"));
	tree2.add(new Book("Finding Emo"));
	System.out.println(tree2);
	
	}
	
	 class BookCompare implements Comparator<Book> {
			public int compare(Book one, Book two) {
			return (one.title.compareTo(two.title));
				
			}

	 }
	 
	 class Book {
			String title;
			
			public Book(String t) {
				title = t;
			}
			
		}

}
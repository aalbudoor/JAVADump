package SerializationAndFileIO;

public class TheSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In the QuizCardPlayer app, this is what a single line looks like when its read in from
		//the file
		String toTest = "What is blue + yellow?/green";
		
		//The split() method takes the "/" and uses it to break apart the string into (in this case)
		//two pieces
		String[] result = toTest.split("/");
		
		//Loop through the array and print each token (piece). in this example, there are only two tokens: "What is blue + yello?"
		//and green
		for (String token : result ) {
			System.out.println(token);
		}

	}

}

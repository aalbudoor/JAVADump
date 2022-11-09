package Introduction_Chapters;

public class Duck4{

	private int size;
	
	public static void main(String[] args){
		
		
		Duck4 d4 = new Duck4();
		d4.setSize(3);
			
			System.out.println("THe duck size is " + d4.getSize());
			
	}
	
	
	
		public void setSize(int s){
	
			size = s;
	}
	
		public int getSize(){
	
			return size;
	}



}



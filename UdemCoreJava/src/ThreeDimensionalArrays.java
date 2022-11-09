
public class ThreeDimensionalArrays {

	
	static void ThreeDimensionalArray() {
	
	int[][][] unitsSold = new int[][][] { 
										
		{//New York
			
			{0,0,0,0}, //Jan
			{0,0,0,0}, //Feb
			{0,0,0,0}, //March
			{0,850,0,0}, //April
		},
		
		{// San Fransico
			
			{0,0,0,0}, //Jan
			{0,0,0,0}, //Feb
			{0,0,0,0}, //March
			{0,0,0,0}, //April
		},

		{	//New Jersey
			
			{0,0,0,0}, //Jan
			{0,0,0,0}, //Feb
			{0,0,0,0}, //March
			{0,0,0,0}, //April
		},
		
		{	//California
			
			{0,0,0,0}, //Jan
			{0,0,0,0}, //Feb
			{0,0,0,0}, //March
			{0,0,0,0}, //April
		},
		
		
		
		
		
		
		
	};
	
	System.out.println("Units Sold[0][3][1]: " + unitsSold[0][3][1]);
	
	}
			public static void main(String[] args) {
				
				ThreeDimensionalArray();
		
				

	}

}

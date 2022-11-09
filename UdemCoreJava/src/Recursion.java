
public class Recursion {

	static int factorialNR(int n) { // if 4
		
		if (n == 0 || n==1) {
			return  1;
		}
		//if the factorial is other than one than it will assign it here
		int factorial = n;
	
	
	while (n>= 2) {
		factorial = factorial * (n-1); // 4 * 3 = 12 * (3-1) = 24 * (2-1)
		//will decremant if n is greater than 2 so if n is 4 it will decrement until it reaches 2
		n--; // 3 , 2 , 1
		
	}
	
	// once reaches 2 the while loop will fail and return the factorial 
	return factorial;
	
	}
	static int factorial(int n) {
		
		if (n == 0) {
			return 1;
		}
		return n * factorial(n-1); // 4 * factorial(3): // 4 * 6
										// 3 * factorial(2): // 3 * 2
											// 2 * factorial(1): // 2 * 1
												// 1 * factorial(0):
	}
	/*
	 * using recursion for binary search 
	 * int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91};
	 * binarySearch( a, 0 , 8, 65) // 0 and 8 are lower and higher respectively 
	 * mid = 0 + 8/2 = 4 , binarySearch(a, (mid + 1)= 5, 8, 65 )
	 * 									mid = 5 + 8/2 = 
	 * 											13/2 = 6, binarySearch(a, 5 , mid(6) - 1 = 5, 65); 
	 * 													binarySearch(a, 5 , 5, 65); // lower and higher are now same so recurion would stop
	 *
	 */
	
	//Binery Search without recursion
	 public static int binerySearch(int[] a, int target){

	int left = 0;
	int right = a.length-1;

	while ( left >= right){

    int middle = (left + right)/2;

    if ( target > a[middle]) {
        
        right = middle + 1;
    }
        else if ( target < a[middle]) {

            left = middle  - 1;
        }
            else{

                return middle;
            }
}
          return -1;

        

}
	 
	public static int binarySearch(int a[], int l, int h, int key ) {
		
		if ( l == h) {
			if (key == a[h]) {
				return h;
			} else {
					return -1; // means out=r value is not in the array
				}
			
		}
		
		int mid = (l +h)/2;
		
		if (key == a[mid]) {
			
			return mid;
		} else if(key > a[mid]) { // if this condition is true it skips the left part of the array
			return binarySearch( a , mid+1, h, key); 
		} else {
			
		return  binarySearch( a , l, mid -1 , key); // this dcans the lower part of the array
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialNR(3));
		System.out.println(factorial(4));
		
		int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91};
		int index = binarySearch( a, 0 , 8, 65);
		System.out.println("index : " + index);
	}
}

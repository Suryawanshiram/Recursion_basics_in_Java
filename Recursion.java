import java.util.*;

//  1) Print numbers in dec. order
/*
public class RecursionBasics {
	public static void printDec(int n) {
		// Base case
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n+" ");
		printDec(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=10;
       printDec(n);
	}

}
*/

// Print numbers in Inc. Order 

/*
public class RecursionBasics {
	public static void printInc(int n) {
		// Base case
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		printInc(n-1);
		System.out.println(n+" ");
	
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
   int n=10;
   printInc(n);  // 1 2 3 4 5 6 7 8 9 10
}
}
*/

//Q) 3  Print Factorial of an Number n

/*
public class RecursionBasics { 
	public static int fact(int n) {
		//base case
		if(n == 0) {
			return 1;
		}
		
		int fnm1 = fact(n-1);
		int fn = n*fact(n-1);
		return fn;
	}
	public static void main(String[] args) {
		int n =5;
		System.out.println(fact(n));  // 120
}
}
*/   // TC=O(n)   SC=O(n)


// Q 4) Print Sum of N natural numbers  Tc=O(n),   sc=O(N)

/*
public class RecursionBasics{
	public static int calcSum(int n) {
		// base case
		if(n ==1) {
			return 1;
		}
		
		int Snm1 = calcSum(n-1);
		int Sn = n +Snm1;
		return Sn;
	}
	public static void main(String args[]) {
		int n=5;
		System.out.println(calcSum(n)); // 1+2+3+4+5=15
	}
}
*/

// 5) Nth Fibonacci Numbers

/*
public class RecursionBasics{
	public static int fib(int n) {
		if( n == 0 || n ==1) {
			return n;
		}
		
		int fnm1= fib(n-1);
		int fnm2=fib(n-2);
		int fn = fnm1 + fnm2;
		return fn;
	}
	public static void main(String args[]) {
		int n=10;
		System.out.println(fib(n)); // 55
	}
} */


// If Array is Sorted or not

/*
public class RecursionBasics{
	public static boolean isSorted(int arr[], int i) {
		// Base case
		if(i == arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
		return false;
		}
		return isSorted(arr, i+1);
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4};
		System.out.println(isSorted(arr, 0));
	}
}
*/

// First Occurance

/*
public class RecursionBasics{
	public static int firstOccurence(int arr[], int key, int i) {
		
		// Base case
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return firstOccurence(arr, key, i+1);
	}
	public static void main(String args[]) {
		int arr[] = {8,3,6,9,5,10,2,5,3};
		System.out.println(firstOccurence(arr, 5, 0));  // 4
	} 
	*/
	
	// Last Occurence

/*
	public class RecursionBasics{
		public static int lastOccurence(int arr[], int key, int i) {
			
			// Base case
			if(i == arr.length) {
				return -1;
			}
			int isFound = lastOccurence(arr, key, i+1);
			if(isFound == -1 && arr[i] == key) {
				return i;
			}
			return isFound;
		}
		
		public static void main(String args[]) {
			int arr[] = {8,3,6,9,5,10,2,5,3};
			System.out.println(lastOccurence(arr, 5, 0));  // 7
		} 
}  */

// Find X to the power n  BRuteFORCE Solution

/*
public class RecursionBasics{
	public static int power( int x, int n) {
		
		// Base case
		if(n == 0) {
			return 1;
		}
		return x * power(x, n-1);
	}
		public static void main(String args[]) {
			System.out.println(power(2, 10));  // 1024
		} 
	} */


// Find X to the power n Optimized Soln Tc =O(nlogn)
/*
public class RecursionBasics{
	public static int optimizedPower( int a, int n) {
		
		// Base case
		if(n == 0) {
			return 1;
		}
		// n is even
	 int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
	 
	 // n is odd
	 if(n % 2 != 0) {
		halfPowerSq = a * halfPowerSq;
	 }
	   return halfPowerSq;
	}
		public static void main(String args[]) {
			int a=2;
			int n=10;
			System.out.println(optimizedPower(a, n));  // 1024
		} 
	}
		*/
		
	// Tiling Problem

/*
public class RecursionBasics{
	public static int tilingProblem( int n) {
	 // Base Case
		if (n == 0 || n ==1) {
			return 1;
		}
		
		
		// Kaam
		// Vertical Choise
	//	int fnm1 = tilingProblem(n-1);
		
		// Horizontal Choise
		//int fnm2 = tilingProblem(n-2);
		
		//int totalWays = fnm1 + fnm2;
		return tilingProblem(n-1) + tilingProblem(n-2);
	}
	
		public static void main(String args[]) {
			System.out.println(tilingProblem(3)); // 3
		}
	}
*/


//  Duplicate String

/*
public class RecursionBasics{
	public static void removeDuplicates( String str,int idx, StringBuilder newStr, boolean map[]) {
	 // Base Case
		if (idx == str.length()) {
		System.out.println(newStr);
		return;
		}
		
		// kam
		char currChar = str.charAt(idx);
		if(map[currChar-'a'] == true) {
			// Duplicate
			removeDuplicates(str, idx+1, newStr, map );
		} else {
			map[currChar-'a'] =true;
			removeDuplicates(str, idx+1, newStr.append(currChar), map);
		}
	}
		
		public static void main(String args[]) {
			String str = "appnnacollege";
			removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]); // apncoleg
		}
	}
*/	

// Friends Pairing Problem
/*
public class RecursionBasics{
	public static int friendsPairing(int n) {
//		// Base Case
		if(n ==1 || n == 2) {
			return n;
   }
//		  
//		// Kaam , Choise
//		//Single
//		int fnm1 = friendsPairing(n-1);
//		
//		// pair
//		int fnm2 = friendsPairing(n-2);
//		int pairWays = (n-1) * fnm2;
//		
//		// TotWays
//		int  totWays = fnm1 + pairWays ;
		return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
	}
public static void main(String args[]) {
   System.out.println(friendsPairing(3));  // 4
   }
}
*/


// Binary String Problem

/*
public class RecursionBasics{
	public static void printBinStrings(int n, int lastPlace, String str) {
		
		// base case
		if(n ==0 ) {
			System.out.println(str);
			return ;
		}
		// Kaam
		printBinStrings(n-1, 0, str+("0"));
		if(lastPlace == 0) {
			printBinStrings(n-1, 1, str+("1"));
		}
	}
	public static void main(String args[]) {
		printBinStrings(3, 0, "");
	}
}
*/

//  All Occurences
/*
public class RecursionBasics{
	public static void allOccurences(int arr[], int key, int i) {
		// Base case
		if( i == arr.length) {
			return;
		}
		
		if(arr[i] == key) {
			System.out.println(i+" ");
		}
		allOccurences(arr, key, i+1);
	}
	public static void main(String args[]) {
		int arr[] = {3, 2, 4, 5, 6, 2, 7, 2};
		int key = 2;
		allOccurences(arr, key, 0);
   System.out.println();
		
	}
}   */

// Print Digits

/*
public class RecursionBasics{
	static String digits [] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	public static void printDigits(int number) {
		
		// Base case
		if(number == 0) {
			return;
		}
		
		int lastDigit = number % 10;
		printDigits(number / 10);
		System.out.println(digits[lastDigit]+" ");
	}
	public static void main(String args[]) {
		printDigits(1234);  // one two three four
		System.out.println();
      	}
	}

*/

// Find the Length of String
 
/*
 public class RecursionBasics{
	 
	 public static int length(String str) {
		 
		 // Base case
		 if(str.length() == 0) {
			 return 0;
		 }
		 return length(str.substring(1)) + 1;
	 }
 public static void main(String args[]) {
   String str = "abcde";
   System.out.println(length(str));  // 5
   
      }
 }
*/


// 
/*
public class RecursionBasics{
	public static int countSubstrs(String str, int i, int j, int n) {
		if(n == 1) {
			return 1;
		}
		if(n <= 0) {
			return 0;
		}
		
		int res = countSubstrs(str, i+1, j, n-1) +
				countSubstrs(str, i, j-1, n-1) -
				countSubstrs(str, i+1, j-1, n-2);
		
		if(str.charAt(i) == str.charAt(j)) {
			res ++;
		}
		return res;
	}
	 public static void main(String args[]) {
		 String str = "abcab";
		 int n = str.length();
		 System.out.println(countSubstrs(str, 0, n-1, n));  // 7
   }
}
*/

//
public class RecursionBasics{
	
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if(n == 1) {
		System.out.println("transfer disk " + n + " from " + src + " to " + dest);
		return;
		}
		//transfer top n-1 from src to helper using dest as 'helper'
		towerOfHanoi(n-1, src, dest, helper);
		//transfer nth from src to dest
		System.out.println("transfer disk " + n + " from " + src + " to " + helper);
		//transfer n-1 from helper to dest using src as 'helper'
		towerOfHanoi(n-1, helper, src, dest);
		}
		public static void main(String args[]) {
		int n = 4;
		towerOfHanoi(n, "A", "B", "C");
	
   }
}

// transfer disk 3 from B to A
// transfer disk 1 from A to B
// transfer disk 2 from A to B
// transfer disk 1 from B to C




/**
 * 
 * Problem Statement : Find the length of an array in O(Log(N)) without using any predefined functions.
 * 
 * Logic: 
 * Find the closet upper and lower value of last index of  an array in O(Log(N)).
 * After that apply binary search on the particular range that we get.
 * 
 */


import java.util.Scanner;

public class ArrayLength {

	//main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array: ");
		int N= sc.nextInt();
		
		// initialize array
		int arr[] = new int[N];
		
		System.out.println("Length of Array: "+ findLength(arr)); // Overall Complexity O(log(N))
	}

	// This function is used to find the closest lower and upper bound of last index of array. O(log(N))
	private static int findLength(int[] arr) {
		
		int n=0;
		int high=0;
		int low=0;
		for(int i=1;;i*=2) {
			try {
	        	//here we getting exception if i is greater than length of an array
				int dummy=arr[i];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				high=i;
				// if we getting exception that means we have upper bound
				break;
			}
			// this variable is used to store lower bound.
			low=i;
		}
		// After finding the closest range. We execute the binary search to find exact length of an array. O(log(N))
		n= BinarySearchTofindLenggth(low, high,arr);
		
		return n;
	}

	private static int BinarySearchTofindLenggth(int low, int high, int[] arr) {
		int mid=0; 
		// this loop run until -> low & high cross each other
		while(low<high) {
			//finding mid point
			if (high>=low)
	            mid=low+(high-low)/2;
	           
	        try {
	        	//here we getting exception if mid is greater than length of an array
	        	int dummy= arr[mid];
	        	// if not getting exception update low
	        	low=mid+1;
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	        	// if mid is greater than length  update high = mid
				high=mid;
			}
			
		}
		// return after completing loop. Here high is the length of the array.
		return high;
	}

}


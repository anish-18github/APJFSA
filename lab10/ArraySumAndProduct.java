package lab10;

//import java.util.Iterator;
import java.util.Scanner;

public class ArraySumAndProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];	//Create two-dimentional array
		
		// Input elements into the 3x3 array
		System.out.println("Enter 9 elements for the 3x3 array:");
		for (int i= 0; i < 3; i++) {	//Loop through row 
			for (int j = 0; j < 3; j++) {	//Loop Through columns
				arr[i][j] = sc.nextInt(); // Read elements from user
			}
		}
		sc.close();
//		Initialize sum and product
		int sum = 0; 
		int prod = 1;
		
		// Calculate sum and product of the array elements
		for (int i = 0; i < 3; i++) {	 // Loop through rows
			for (int j = 0; j < 3; j++) {	// Loop through rows
				sum += arr[i][j]; //Add current element to sum
				prod *= arr[i][j];	//Add current element to product
			}
		}
		// Print the sum and product of the array elements
		System.out.println("Sum of array elements is: " +sum);	// Output the sum
		System.out.println("Product of arra elements is: " +prod); // Output the product
	}

}

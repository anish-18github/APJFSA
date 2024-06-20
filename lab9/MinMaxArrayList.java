package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create an ArrayList to store integers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Loop to read 5 integers from the user
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			int input = sc.nextInt();	// Read an integer input
			numbers.add(input);	 // Add the input to the ArrayList
		}
		
		// Find the maximum element in the ArrayList
		int max = Collections.max(numbers);
		
		// Find the minimum element in the ArrayList
		int min = Collections.min(numbers);
		
		// Print the maximum element
		System.out.println("Maximum element: " + max);
		
		// Print the minimum element
		System.out.println("Minimum element: " + min);
		
		sc.close();
	}

}

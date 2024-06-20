package lab9;

import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		 // Create a HashSet of integers
		HashSet<Integer> numbers = new HashSet<>();
		
		// Add the numbers 5, 10, 15, 20, and 25 to the set
		 numbers.add(5);
	     numbers.add(10);
	     numbers.add(15);
	     numbers.add(20);
	     numbers.add(25);
	     
	  // Display the elements of the set
	     System.out.println("Elements are: " + numbers);
	     
	  // Check if the set contains the number 10
	     if (numbers.contains(10)) {
			System.out.println("\nNumber 10 is present in the set.");
		} else {
			System.out.println("\nNumber 10 is not present in the set");
		}
	     
	     // Remove the number 15 from the set
	     numbers.remove(15);
	     System.out.println("\nAfter removing number 15: " + numbers);
	     
	  // Display the size of the set
	     System.out.println("\nSize of the set: " + numbers.size());
	}

}

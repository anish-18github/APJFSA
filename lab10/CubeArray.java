package lab10;

import java.util.Scanner;

public class CubeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];	// Create an array of size 10
		
		// Input 10 elements into the array
		System.out.println("Enter 10 elements in array");
		for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt(); 	// Read element input from user
		}	
		sc.close();
		
		// Print the cube of prime numbers in the array
		System.out.println("Cube of prime number in the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {	// Check if the element is a prime number
				int cube = arr[i] * arr[i] * arr[i];	// Calculate the cube of the prime number
				System.out.println("Cube of " +arr[i] + " is: " + cube);	// Print the cube of the prime number
			}
		}
	}
	
	// Method to check if a number is prime
public static boolean isPrime(int num) {
	if(num <= 1) {	// Check if num is less than or equal to 1
		return false;	// Check if num is less than or equal to 1
	}
	
	 // Check if the number is 2
	if (num == 2) {
		return true;	// 2 is the only even prime number
	}
	
	// Loop to check divisors from 2 to sqrt(num)
	for (int i = 2; i <= num / 2; i++) {
		if (num % i == 0) {	// If num is divisible by i, it is not prime
			return false;
		
			}
		}
		return true;	// If no divisors found, num is prime
	}
}
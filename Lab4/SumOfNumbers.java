package practice;

import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare variables to store sums of two-digit and three-digit numbers
        int sumTowDigit = 0;
        int sumThreeDigit = 0;

        System.out.println("Enter a 10  Interger: ");

        // Input 10 integers from the user
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            // Check if the number is a two-digit number (between 10 and 99)
            if (num >= 10 && num <= 99) {
                sumTowDigit += num;
            }
            // Check if the number is a three-digit number (between 100 and 999)
            else if (num >= 100 && num <= 999) {
                sumThreeDigit += num; // Add the number to the sum of three-digit numbers
            }

        }

        // Display the sum of two-digit numbers
        System.out.println("Sum of two digit number is: " + sumTowDigit);
        // Display the sum of three-digit numbers
        System.out.println("Sum of three digit number is: " + sumThreeDigit);

        sc.close(); // Close the Scanner to release resources
    }
}
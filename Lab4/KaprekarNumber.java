package practice;

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Prompt the user to enter a positive whole number
        System.out.println("Enter positive whole number: ");
        int num = sc.nextInt(); //Ex. 9, 45, 55, 99..etc 

        // Calculate the square of the number
        long square = (long) num * num;

        // Convert the square to a string to facilitate splitting
        String squareStr = String.valueOf(square);

        // Determine the length of the square's string representation
        int length = squareStr.length();
        boolean isKaprekar = false;

        // Check for Kaprekar property by splitting the square into two parts
        for (int i = 1; i < length; i++) {
            // Split the square into two parts
            String lefPart = squareStr.substring(0, i);
            String rightPart = squareStr.substring(i);

            // Convert parts to integers
            int left = 0;
            int right = 0;

            // Parse left part to integer if it's not empt
            if (!lefPart.isEmpty()) {
                left = Integer.parseInt(lefPart);
            }

            // Parse right part to integer if it's not empt
            if (!rightPart.isEmpty()) {
                right = Integer.parseInt(rightPart);
            }

            // Check if sum of parts equals original number
            if (left + right == num) {
                isKaprekar = true;
                break;
            }
        }

        // Display the result based on Kaprekar property
        if (isKaprekar) {
            System.out.println(num + " is Kaprekar.");
        } else {
            System.out.println(num + " is not Kaprekar.");
        }

        sc.close(); // Close the Scanner to release resources
    }

}

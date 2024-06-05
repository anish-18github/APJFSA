package labs.lab6;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Prompting the user to enter a string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Initializing pointers for the start and end of the string
        int left = 0;
        int right = input.length() - 1;

        // Variable to keep track of whether the string is a palindrome
        boolean isPalindrome = true;

        // Loop to compare characters from the start and end towards the center
        while (left < right) {
            
            // Skip non-letter and non-digit characters from the left side
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            // Skip non-letter and non-digit characters from the right side
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            // Compare the characters, ignoring case differences    
            if(Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))){
                isPalindrome = false;   // If they are not equal, it's not a palindrome
                break;
            }

            // Move towards the center
            left++;
            right--;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The String is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }

        sc.close();

    }
}

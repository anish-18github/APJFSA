package labs.lab7;

import java.util.Scanner;

public class PigLatinWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take String as input from the user 
        System.out.println("Enter a String/Word: ");
        String word = sc.nextLine();
        int len = word.length(); // Get the length of the word

        word = word.toUpperCase();  // Convert the word to uppercase for uniformity
        String piglatin = "";   // Initialize the Pig Latin word as an empty string
        int flag = 0;   // Flag to check if a vowel has been found

        // Loop through each character in the word to find the first vowel
        for (int i = 0; i < len; i++) {
            char x = word.charAt(i);    // Get the current character

            // Check if the character is a vowel
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                // Form the Pig Latin word by moving the part before the vowel to the end
                piglatin = word.substring(i) + word.substring(0,i) + "AY";
                flag = 1;   // Set the flag indicating that a vowel has been found
                break;  // Exit the loop once the first vowel is found
            }
        }

        // If no vowel was found, append "AY" to the original word
        if (flag == 0)
        {
            piglatin = word + "AY";
        }

        // Print the Pig Latin format of the original word
        System.out.println("Piglatin format of " + word + " is " +piglatin);
        sc.close();
    }
}

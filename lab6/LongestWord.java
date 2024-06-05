package labs.lab6;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
         // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // get the input from the user as a sentence
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        sc.close();

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int longedtLength = 0;

        // Split the sentence into individual words using a space as delimiter
        for (String word : sentence.split(" ")) {
            // Check if the current word's length is greater than the longest seen so far
            if (word.length() > longedtLength) {
                // Update longestWord and longestLength if a longer word is found
                longestWord = word;
                longedtLength = word.length();
                
            }
        }

        // Print the longest word found in the sentence
        System.out.println("The longest word is: " +longestWord) ;
    }
}

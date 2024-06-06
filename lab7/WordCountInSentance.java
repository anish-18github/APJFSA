package labs.lab7;

import java.util.Scanner;

public class WordCountInSentance {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter the sentence
            System.out.println("Enter the sentence: ");
            String sentence = sc.nextLine().trim();
            
            // Prompt the user to enter the word
            System.out.println("Enter the word: ");
            String word = sc.nextLine().trim();

            // Convert both the word and the sentence to uppercase for case insensitive comparison
            sentence = sentence.toUpperCase();
            word = word.toUpperCase();
    
            // Split the sentence into words
            String[] words = sentence.split("\\s+");
    
            int count = 0;
    
            // Count occurrences of the word in the sentence
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }
    
            // Display the result
            System.out.println("The word '" + word + "' appears " + count + " times in the sentence.");
            
            sc.close(); // Close the Scanner object
        }
}

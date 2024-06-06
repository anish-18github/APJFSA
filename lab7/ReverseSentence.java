package labs.lab7;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user 
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // Split the input sentence into individual words
        String[] words = input.split(" ");
        String reversedSentence = "";   // Initialize an empty string to store the reversed sentence

        // Loop through the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the reversed sentence followed by a space
            reversedSentence += words[i] + " ";
        }
        // Print the reversed sentence
        System.out.println(reversedSentence);
        sc.close();
    }
}

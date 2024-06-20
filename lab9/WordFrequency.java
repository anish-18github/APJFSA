package lab9;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		// Remove all punctuation and convert the string to lower case
		str = str.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
		
		// Create a HashMap to store the frequency of each word
		HashMap<String, Integer> wordcount = new HashMap<>();
		
		// Split the string into words based on spaces
		String[] words = str.split(" ");
		
		// Iterate over each word in the array
		for (String word : words) {
			// If the word is already in the map, increment its count by 1
			if (wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word) + 1);
			} else {
				// Otherwise, add the word to the map with a count of 1
				wordcount.put(word, 1);
			}
		}
		
		// Print the frequency of each word
		for (String word : wordcount.keySet()) {
			System.out.println(word + " " + wordcount.get(word));
		}
		
		sc.close();
	}

}

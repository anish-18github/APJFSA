/*Q.3
  Write a program to
     i.       input a sentence and replace vowel with its next letter.
     ii.     input a sentence replace vowel with its next vowel.
 
 */
package lab10;

import java.util.Scanner;

public class VowelReplacement {

	// Method to replace each vowel with its next letter
			public static String replaceVowelWithNextLetter (String word) {
				StringBuilder result = new StringBuilder();
				for (char ch : word.toCharArray()) {
					if (isVowel(ch)) {
						result.append((char)(ch + 1)); // Replace vowel with the next letter
					}else {
						result.append(ch);	// To keet non-vowel character unchanged	
					}
				}
				return result.toString();
			}
	
			// Method to replace each vowel with the next vowel
			public static String replaceVowelWithNextVowel (String word) {
				StringBuilder result = new StringBuilder();
				for (char ch : word.toCharArray()) {
					// Switch statement to replace each vowel with the next vowel
					switch (Character.toLowerCase(ch)) {
					case 'a': result.append('e');
					break;
					case 'e': result.append('i');
					break;
					case 'i': result.append('o');
					break;
					case 'o': result.append('u');
					break;
					case 'u': result.append('a');
					break;

					default: result.append(ch);	// Keep non-vowel characters unchanged
					}
				}
				return result.toString();
			}
			
//			Method to check if character is vowel or not
			public static boolean isVowel (char ch) {
				ch = Character.toLowerCase(ch);	// Convert character to lowercase
				// Return true if character is a vowel, false otherwise
				return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
			}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input the sentence
		System.out.println("Enter a sentence: ");
		String word = sc.nextLine();
		
		
		// Input the choice
		System.out.println("Choose an option:");
		System.out.println("1. Replace vowel with its next letter.");
		System.out.println("2. Replace vowel with its next vowel.");
		int choice = sc.nextInt();
		sc.close();
		// Variable to hold the result
		String result = "";
		
		// Process the sentence based on the choice
		switch (choice) {
		case 1:
			result = replaceVowelWithNextLetter(word);	// Replace vowels with next letters
			break;
		case 2:
			result = replaceVowelWithNextVowel(word);	// Replace vowels with next vowel
			break;

		default:
			System.out.println("Ivalid Choice!!!");	//Handle Invalid 
			return;	//Exit the program
		}
		// Print the result
		System.out.println("Result: " +result);
		
	}
}

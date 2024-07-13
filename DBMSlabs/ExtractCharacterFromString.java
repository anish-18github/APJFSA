package DBMSlabs;

import java.util.Scanner;

public class ExtractCharacterFromString {

	public static void main(String[] args) {
//		Use a StringBuilder to efficiently build the result string with only characters
		StringBuilder result = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
//		Get input from user as String that contains characters and numbers
		System.out.println("Enter String that contains character and numbers: ");
		String input = sc.nextLine();
		
		sc.close();
		
		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			
			// Get the current character from the input string
			char ch = input.charAt(i);
			
			// Check if the current character is a letter (alphabetic character)
			if (Character.isLetter(ch)) {
				
				// If the character is a letter, append it to the result StringBuilder
				result.append(ch);
			}
		}
		
		// Convert the StringBuilder to a string and print the result
        // This string contains only the alphabetic characters from the input
		System.out.println("Exteractd Characters: " +result.toString());
	}
}

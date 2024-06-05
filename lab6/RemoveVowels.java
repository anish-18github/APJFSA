package labs.lab6;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Initializing an empty string to store the result
        String result = " ";

        // String containing all vowels
        String vowels = "aeiouAEIOU";

        // Removing vowels from the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Checking if the character is not a vowel
            if (vowels.indexOf(ch) == -1) {
                // Adding non-vowel character to the result string
                result += ch;
            }
        }

        // Displaying the result string
        System.out.println("String after removing vowels: " +result);
        sc.close();
    }
}

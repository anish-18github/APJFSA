package labs.lab6;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string that contain 3 words: ");
        String input = sc.nextLine();

        // Splitting the input string into words
        String[] words = input.split(" ");

        // Ensuring there are exactly three words
        if (words.length == 3) {
            // Extracting the first letter of each word and printing the initials
            String initials = "";
            for (String word : words) {
                initials += word.charAt(0) + " ";
            }

            // Printing the initials
            System.out.println("Initials: " + initials.trim());
        } else {
            System.out.println("Please enter a string that contain 3 words!!!!!!");
        }

        sc.close();
    }
}

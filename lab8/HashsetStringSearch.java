package labs.lab8;

import java.util.*;

public class HashsetStringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a HashSet to store unique strings
        Set<String> set1 = new HashSet<String>();

        // Taking the input from the user to enter 10 strings
        System.out.println("Enter 10 String: ");
        for (int i = 0; i < 10; i++) {
            // Prompt for each string
            System.out.println("String " + (i + 1));
            // Read the input string from the user
            String input = sc.nextLine();
            // Add the string to the HashSet (duplicates will be ignored)
            set1.add(input);
        }

        // Taking input the from user to enter a string to search for
        System.out.println("Enter element ti search: ");
        String search = sc.nextLine();

         // Check if the HashSet contains the searched string
        if (set1.contains(search)) {
            // If found, print that the string is found
            System.out.println("String found " +search);

        } else {
            // If not found, print that the string is not found
            System.out.println("String is not found.");
        }
        sc.close();
    }
}

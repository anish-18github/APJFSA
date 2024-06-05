package practice;

import java.util.*;

public class StateCapitalLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5;  //Declare size of an array

           // Define arrays to store states and capitals
        String[] states = new String[size];
        String[] capitals = new String[size];

        // Input states and capitals
        System.out.println("Enter 10 states and there corresponding capitals: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter state " +(i + 1)+ ": ");
            states[i] = sc.nextLine();
            System.out.println("Enter capital for " +states[i]+ ": ");
            capitals[i] = sc.nextLine();
        }

        // Prompt user to search for a state and display its capital
        System.out.println("\nEnter state whoes capital you want to search: ");
        String stateToSearch = sc.nextLine();

        boolean found  = false; // Flag to track if the state is found
         // Compare the state (case-insensitive) with the state to search for
        for (int i = 0; i < size; i++) {   
            if(states[i].toLowerCase().equals(stateToSearch.toLowerCase())){
                 // If state is found, display its capital
                System.out.println("The capital of " +states[i]+ " is " +capitals[i]);
                found = true;   // Update flag to indicate state is found
                break;  // Exit the loop once state is found
            }
        }
         // Display message if state is not found
        if(!found){
            System.out.println("Capital for " +stateToSearch+ "is not found!!, please check your inpit.");
        }
        sc.close(); // Close the Scanner to release resources
    }

}

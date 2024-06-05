package labs.lab6;

import java.util.Scanner;

public class RearrangeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full name: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        if (words.length == 3) {
            String reorderName = words[2] + " " + words[0] + " " + words[1];
            System.out.println("Reordered Name: " +reorderName);
        } else {
            System.out.println("Please enter a string that contain 3 words");
        }
        sc.close();
    }
}

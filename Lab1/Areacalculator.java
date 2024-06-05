import java.util.*;

public class Areacalculator {
    public static void main(String[] args) {
		// Declaring variables
		char choice;
        Scanner input = new Scanner(System.in);

        // Prompting the user to choose a shape
        System.out.println("Enter shape (1 = Square, 2 = Rectangle, 3 = Circle):");
        // Reading the user's choice
        choice = input.next().charAt(0);

        // Variable to store the calculated area
        double area = 0;

        // Switch statement to calculate area based on the user's choice
        switch (choice) {
            case '1':
                // For square: prompting user to enter side length
                System.out.println("Enter side length of square:");
                // Reading side length input
                double side = input.nextDouble();
                // Calculating area of square
                area = side * side;
                break;
            case '2':
                // For rectangle: prompting user to enter length and width
                System.out.println("Enter length and width of rectangle:");
                // Reading length and width inputs
                double length = input.nextDouble();
                double width = input.nextDouble();
                // Calculating area of rectangle
                area = length * width;
                break;
            case '3':
                // For circle: prompting user to enter radius
                System.out.println("Enter radius of circle:");
                // Reading radius input
                double radius = input.nextDouble();
                // Calculating area of circle
                area = Math.PI * radius * radius;
                break;
            default:
                // Handling invalid choice
                System.out.println("Invalid choice!");
        }

        // Displaying the calculated area to the user
        System.out.println("Area: " + area);

       

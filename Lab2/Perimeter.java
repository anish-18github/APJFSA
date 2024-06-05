package basic;
import java.util.Scanner;

public class Perimeter {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        
        // Declaring variable to store user's choice
        int choice;
        
        // Prompting the user to choose a shape
        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        // Reading the user's choice
        choice = sc.nextInt();
        
        // Switch case to handle different shape options
        switch (choice) {
            // Case 1: Square
            case 1:
                // Declaring variable to store side length of square
                float side;
                System.out.println("Enter the side length of the square:");
                // Reading the input for side length
                side = sc.nextFloat();
                // Calculating perimeter of square
                float squarePerimeter = 4 * side;
                System.out.println("Perimeter of the square: " + squarePerimeter);
                break;
                
            // Case 2: Rectangle
            case 2:
                // Declaring variables to store length and width of rectangle
                float length, width;
                System.out.println("Enter the length of the rectangle:");
                // Reading the input for length
                length = sc.nextFloat();
                System.out.println("Enter the width of the rectangle:");
                // Reading the input for width
                width = sc.nextFloat();
                // Calculating perimeter of rectangle
                float rectanglePerimeter = 2 * (length + width);
                // Displaying the perimeter of rectangle
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
                
            // Case 3: Triangle
            case 3:
                // Declaring variables to store sides of triangle
                float side1, side2, side3;
                // Prompting the user to enter length of side 1 of triangle
                System.out.println("Enter the length of side 1 of the triangle:");
                // Reading the input for side 1
                side1 = sc.nextFloat();
                // Prompting the user to enter length of side 2 of triangle
                System.out.println("Enter the length of side 2 of the triangle:");
                // Reading the input for side 2
                side2 = sc.nextFloat();
                // Prompting the user to enter length of side 3 of triangle
                System.out.println("Enter the length of side 3 of the triangle:");
                // Reading the input for side 3
                side3 = sc.nextFloat();
                // Calculating perimeter of triangle
                float trianglePerimeter = side1 + side2 + side3;
                // Displaying the perimeter of triangle
                System.out.println("Perimeter of the triangle: " + trianglePerimeter);
                break;
                
            // Case 4: Circle
            case 4:
                // Declaring variable to store radius of circle
                float radius;
                // Prompting the user to enter radius of circle
                System.out.println("Enter the radius of the circle:");
                // Reading the input for radius
                radius = sc.nextFloat();
                // Calculating perimeter of circle
                double circlePerimeter = 2 * Math.PI * radius;
                // Displaying the perimeter of circle
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;
            
            // Default case for invalid choice
            default:
                System.out.println("Invalid choice!");
        }
        
        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}

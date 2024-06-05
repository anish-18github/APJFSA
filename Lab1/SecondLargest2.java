import java.util.*;

public class SecondLargest2 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
       
        // Prompting the user to enter three numbers
        System.out.println("Enter three numbers:");
        // Reading the three numbers entered by the user
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
       
        // Finding the second largest number among the three numbers
        double secondLargest = Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));
       
        // Displaying the second largest number to the user
        System.out.println("The second largest number is: " + secondLargest);
       
        // Closing the Scanner object to release resources
        input.close();
    }
}

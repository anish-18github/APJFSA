import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Displaying options for temperature conversion
        System.out.println("Choose conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        // Reading user's choice
        int choice = input.nextInt();

        // Variables to store temperature and converted temperature
        double temperature, convertedTemperature;

        // Checking user's choice and performing conversion accordingly
        if (choice == 1) {
            // If user chooses Fahrenheit to Celsius
            System.out.println("Enter temperature in Fahrenheit:");
            // Reading temperature input in Fahrenheit
            temperature = input.nextDouble();
            // Converting Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            // Displaying converted temperature
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else if (choice == 2) {
            // If user chooses Celsius to Fahrenheit
            System.out.println("Enter temperature in Celsius:");
            // Reading temperature input in Celsius
            temperature = input.nextDouble();
            // Converting Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            // Displaying converted temperature
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else {
            // Handling invalid choice
            System.out.println("Invalid choice!");
        }

        // Closing the Scanner object to release resources
        input.close();
    }
}

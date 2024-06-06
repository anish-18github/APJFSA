package labs.lab7;

public class ArethmeticException {
    public static void main(String[] args) {
        int numerator = 10; // Initialize numerator with the value 10
        int denominator = 0;    // Initialize denominator with the value 0, which will cause an arithmetic error

        try{
            // Attempt to divide by zero, which will cause an ArithmeticException
            int result = numerator / denominator;   // This line will not be executed because of the exception
            System.out.println("Result: " + result);    //print the result
        }
        catch(ArithmeticException e){
            // Catch and handle the ArithmeticException
            System.out.println("Arethmetic Exception Caught: " + e.getMessage());   // Print the exception message
        }

        // This line demonstrates that the program continues running after the exception is handled
        System.out.println("Program continue after Exception handling.");
    }
}

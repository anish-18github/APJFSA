package lab;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaring variables to store employee name, income, and tax
        String name;
        double income, tax;
        
        System.out.println("Enter name of employee: ");
        // Reading the input for employee name
        name = sc.nextLine();
        
        System.out.println("Enter your annual income: ");
        // Reading the input for annual income
        income = sc.nextDouble();
        
        System.out.println("Name of the employee: " + name);

        // Calculating tax based on income
        
        // If income is less than or equal to 250,000
        if (income <= 250000) {
            System.out.println("No tax");
        }
        // If income is between 250,001 and 500,000
        else if (income >= 250001 && income <= 500000) {
            tax = 0.1 * (income - 250000);
            System.out.println("Income tax: ₹" + tax);
        }
        // If income is between 500,001 and 1,000,000
        else if (income >= 500001 && income <= 1000000) {
            tax = 30000 + 0.2 * (income - 500000);
            System.out.println("Income tax: ₹" + tax);
        }
        // If income is greater than 1,000,000
        else {
            tax = 50000 + 0.3 * (income - 1000000);
            System.out.println("Income tax: ₹" + tax);
        }
        
        sc.close();
        
        // Displaying the name of the employee
//        System.out.println("Name of the employee: " + name);
        
    }
}

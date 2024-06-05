package labs;
import java.util.*;
public class GCDLCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LCM: ");
        int num1 =  sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        if (b > a)         // Ensure a is always the larger number
        {
            int temp = a;
            a = b;
            b = temp;
        }

        // Calculate GCD using the continued division method
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        // Calculate LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = (num1 * num2) / gcd;

        // Display the result
        System.out.println("LCM of " +num1+ " and "+num2+" is: "+lcm);
        sc.close();
    }
    
}

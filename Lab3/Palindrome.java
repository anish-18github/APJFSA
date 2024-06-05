package labs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp, r, sum=0;		// Declaring variables to store intermediate and final values
		
		temp = num;	// Storing the original number in a temporary variable
		while(num>0)
		{
			r = num%10;	// Extracting the last digit of the number
			sum = (sum*10)+r;	 // Building the reversed number
			num = num/10;	 // Removing the last digit from the original number
		}
		
		 // Checking if the reversed number is equal to the original number
		if(temp==sum)
		{
			System.out.println(temp+ " is palindrome");
		}
		else
		{
			System.out.println(temp+ " is not palindrome");
		}
		sc.close();
	}

}

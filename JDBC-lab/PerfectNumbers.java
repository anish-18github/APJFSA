//Q.2 1. Display all perfect numbers between 1 to 1000.
package DBMSlabs;

public class PerfectNumbers {

	public static void main(String[] args) {

		System.out.println("Perfect Numbers between 1 to 1000 is: ");
		
		// Loop through numbers from 1 to 1000
		for (int number = 1; number < 1000; number++) {
			int sum = 0;
			
			// Find the sum of all factors of the number (excluding the number itself)
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}
			
			// A number is perfect if the sum of its factors equals the number itself
			if (sum == number && number != 0) {
				System.out.println(number);
			}
		}
	}

}

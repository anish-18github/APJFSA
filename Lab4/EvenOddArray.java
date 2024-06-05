package practice;
import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Declare arrays to store integers, even numbers, and odd numbers
        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Input 20 integers from the user
        System.out.println("Enter 20 integers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            // Check if the current number is even or odd
            if(arr[i] % 2 == 0)
            {
                // Store even number in the 'even' array and update the even count
                even[evenCount] = arr[i];
                evenCount++;
            }
            else
            {
                // Store odd number in the 'odd' array and update the odd count
                odd[oddCount] = arr[i];
                oddCount++;
            }
        }

         // Display even numbers
        System.out.println("Even Numbers: ");
        for(int j = 0; j<evenCount; j++){
            System.out.print(even[j]+ " ");
        }
        System.out.println();

        // Display odd numbers
        System.out.println("Odd Numbers: ");
        for(int k = 0; k<oddCount; k++){
            System.out.print(odd[k]+ " ");
        }
        System.out.println();

        sc.close(); // Close the Scanner to release resources

    }
}

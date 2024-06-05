package labs;
import java.util.*;
public class HighestArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, temp; // Declaring variables for array size and temporary swap

        int [] arr = new int[5];    // Declaring an array of size 5 to store integers
        size = arr.length;   // Storing the length of the array in 'size' variable

        System.out.println("Enter a array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");   // Displaying the elements of the array
        }
        System.out.println();

        // Sorting the array in ascending order using bubble sort
        for (int i = 0; i<size; i++){
            for(int j = i + 1; j<size; j++)
            {
                if(arr[i]>arr[j])
                {
                    // Swapping elements if the current element is greater than the next element
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Displaying the second highest element (second last element after sorting)
        System.out.println("This is " +arr[size-2]);
        sc.close();

    }
}
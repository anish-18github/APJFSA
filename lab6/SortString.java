package labs.lab6;

public class SortString {
    public static void main(String[] args) {
        // Creating an array of strings
        String[] arr = {"apple", "orange", "banana", "kiwi", "grape" };
        
        // Printing array before sorting  
        System.out.println("Before sorting: ");
        for (String str : arr) {
            System.out.println(str);
        }

        // Sorting the array in ascending order using bubble sort
         // Outer loop iterates over the array elements
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop performs the comparison and swapping
            for (int j = 0; j < arr.length - 1 - i; j++) {
                 // Compare adjacent elements
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1] if they are in the wrong order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Printing the array after sorting
        System.out.println("\nAfter sorting: ");
        for (String str : arr) {
            System.out.println(str);
        }

    }
}

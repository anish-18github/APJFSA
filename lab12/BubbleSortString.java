package lab12;

public class BubbleSortString {

	public class BubbleSortStrings {
	    public static void main(String[] args) {
	        // Define an array of strings to be sorted
	        String[] arr = {"pear", "apple", "orange", "banana", "grape"};
	        int n = arr.length; // Get the length of the array
	        
	        // Bubble sort algorithm
	        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
	            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparing adjacent elements
	                // Compare adjacent strings using compareTo
	                if (arr[j].compareTo(arr[j + 1]) > 0) {
	                    // If arr[j] is greater than arr[j + 1], swap them
	                    String temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print the sorted array
	        for (String str : arr) {
	            System.out.println(str);
	        }
	    }
	}
}

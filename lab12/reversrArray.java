package lab12;

public class reversrArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};	//Create integer array
		
//		print original array
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");	// Print each element followed by a space
		}
		System.out.println();
		
		// Initialize pointers for the left and right ends of the array
		int left = 0;
		int right = arr.length -1;
		
		// Loop to reverse the array in place
		while(left < right) {
			
			// Swap elements at left and right indices
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			// Move the left pointer to the right
			left++;
			// Move the right pointer to the left
			right--;
			
	}
		// Print the reversed array
		System.out.println("Rverse Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
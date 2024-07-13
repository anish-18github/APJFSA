package lab12;

public class FindFirstAndLastOccurance {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 1, 5, 8, 1}; 
		int target = 1;	// Element to find
		
		int firstIndex = -1;
		int lastIndex = -1;
		
		// Single iteration to find first and last occurrence
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				
				if (firstIndex == -1) {
					firstIndex = i;	// Set first occurrence
					
				}
				lastIndex = i;	// Update last occurrence
			} 	
			
		}
		
		// Print the results
		System.out.println("First occurrence of element " + target + ": " + firstIndex);
        System.out.println("Last occurrence of element " + target + ": " + lastIndex);
		
	}

}

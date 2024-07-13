package lab12;

public class NastedForLoopDemo {

	public static void main(String[] args) {
		
		// Array to store days of the week
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
//		Implementing Nasted for loop
		// Outer loop for week
		for (int week = 1; week <= 3; week++) {
			System.out.println("Week: " +week);
			
			// Inner loop for day
			for (int i = 0; i < days.length; i++) {	  //Instead of provided for loop condition you can use: for (String day : days) {...}
				System.out.println("	" +days[i]);
			}
			
			System.out.println();	// Print a blank line for better readability
		}

	}

}

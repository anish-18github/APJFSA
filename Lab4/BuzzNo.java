package practice;
import java.util.*;;
public class BuzzNo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    //Creates a Scanner object for user input    
      
    int num;  // Declares an integer variable 'num' to store user input

    System.out.println("Enter a number: ");
    num = sc.nextInt(); // Reads an integer input from the user and stores it in 'num'
    
    // Checks if the entered number is a Buzz number
    if(num % 10 == 7 && num % 7 == 0){
        System.out.println("Entered number is Buzz.");  // Prints message if number is Buzz
    }
    else{
        System.out.println("Entered number is Not Buzz.");  // Prints message if number is not Buzz
    }
    sc.close(); // Closes the Scanner to release system resources
    
    }
}

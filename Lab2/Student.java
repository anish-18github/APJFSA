package lab;
import java.util.*;

public class Student {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks of English subject");
        // Reading the input for English marks
        int eng = sc.nextInt();
        
        System.out.println("Enter marks of Maths subject");
        // Reading the input for Maths marks
        int maths = sc.nextInt();
        
        System.out.println("Enter marks of Science subject");
        // Reading the input for Science marks
        int sci = sc.nextInt();
        
        // Checking conditions to allot stream based on marks
        
        // If average of all subjects is greater than or equal to 80
        if ((eng+maths+sci)/3 >= 80) {
            System.out.println("Stream Allotted: Pure Science");
        } 
        // If average of English and Science is greater than or equal to 80 and Maths is greater than or equal to 60
        else if ((eng+sci)/2 >= 80 && maths >= 60) {
            System.out.println("Stream Allotted: Bio. Science");
        } 
        // If average of all subjects is greater than or equal to 60
        else if ((eng+maths+sci)/3 >= 60) {
            System.out.println("Stream Allotted: Commerce");
        } 
        // If none of the above conditions are met
        else {
            System.out.println("No Stream Allotted");
        }
        
        sc.close();        // Closing the Scanner object to prevent resource leak

    }
}

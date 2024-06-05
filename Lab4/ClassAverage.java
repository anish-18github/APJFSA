package practice;

import java.util.*;

public class ClassAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Define the number of students
    int numverOfStudents = 40;

     // Declare arrays to store subject marks for each student
    int[] englishMarks = new int[numverOfStudents];
    int[] mathshMarks = new int[numverOfStudents];
    int[] sciencehMarks = new int[numverOfStudents];

    // Input marks for each student
    for (int i = 0; i < numverOfStudents; i++) {
      System.out.println("Enter marks for Student " + (i + 1) + ":");
      System.out.print("English: ");
      englishMarks[i] = sc.nextInt();

      System.out.print("Science: ");
      sciencehMarks[i] = sc.nextInt();

      System.out.print("Maths: ");
      mathshMarks[i] = sc.nextInt();
    }

    // Calculate and print average marks secured by each student
    System.out.println("\n*********************** Average Marks Secure by Student ***************************");
    for (int i = 0; i < numverOfStudents; i++) {
      int averageMarks = (englishMarks[i] + sciencehMarks[i] + mathshMarks[i]) / 3;
      System.out.println("Student " + (i + 1) + ": " + averageMarks);
    }

    // Calculate and print class average in each subject
    System.out.println(
        "\n******************************* Class Average in each Student **************************************");
    int sumEnglish = 0;
    int sumScience = 0;
    int sumMaths = 0;

    // Calculate the sum of marks for each subject across all students
    for (int i = 0; i < numverOfStudents; i++) {
      sumEnglish += englishMarks[i];
      sumScience += sciencehMarks[i];
      sumMaths += mathshMarks[i];
    }

    // Calculate class average for each subject
    double englishClassAverage = (double) sumEnglish / numverOfStudents;
    double scienceClassAverage = (double) sumScience / numverOfStudents;
    double mathsClassAverage = (double) sumMaths / numverOfStudents;

    // Print class average for each subject
    System.out.println("English: " + englishClassAverage);
    System.out.println("Science: " + scienceClassAverage);
    System.out.println("Maths: " + mathsClassAverage);

    sc.close(); // Close the Scanner to release resources
  }

}

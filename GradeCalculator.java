import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] subjects = {"Math", "Science", "Filipino", "English", "Araling Panlipunan"};
    int[] grades = new int[5];
    
    for(int i = 0; i < grades.length; i++) {
        while(true) {
            try {
                System.out.print("Enter " + subjects[i] + " Grade: ");
                grades[i] = scan.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("Please enter a valid number (e.g., 100).");
                scan.next();
            }
        }
    }
    
    double finalGrade = calculateGrade(grades);
    System.out.println("\nFinal Grade: " + finalGrade);
  }
  
  public static double calculateGrade(int[] grades) {
    double sum = 0;
    
    for(int grade : grades) {
      sum += grade;
    }
    return sum / grades.length;
  }
}
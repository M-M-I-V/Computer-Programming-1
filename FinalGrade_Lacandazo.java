import java.util.Scanner;

public class FinalGrade_Lacandazo {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Name: ");
    String name = scan.nextLine();
    
    System.out.print("Course: ");
    String course = scan.nextLine();
    
    System.out.print("Quiz Grade: ");
    int quiz = scan.nextInt();
    
    System.out.print("Seatwork Grade: ");
    int seatwork = scan.nextInt();
    
    System.out.print("Laboratory Exercises Grade: ");
    int labExercises = scan.nextInt();
    
    System.out.print("Assignment Grade: ");
    int assignment = scan.nextInt();
    
    System.out.print("Prelim Exam Grade: ");
    int prelimExam = scan.nextInt();
    
    double finalGrade = (quiz * 0.25) + (seatwork * 0.10) + (labExercises * 0.20) + (assignment * 0.05) + (prelimExam * 0.40);
    System.out.println("Final Grade: " + finalGrade);
      
    System.out.println("\nPrepared By: " + name);
  }
}
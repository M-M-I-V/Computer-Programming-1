import java.util.Scanner;

public class SemGrade {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Prelim Grade: ");
    double prelimGrade = scan.nextDouble();
    
    System.out.print("Midterm Grade: ");
    double midtermGrade = scan.nextDouble();
    
    System.out.print("Final Grade: ");
    double finalGrade = scan.nextDouble();
    
    double semGrade = (prelimGrade * 0.25) + (midtermGrade * 0.25) + (finalGrade * 0.5);
    
    String remarks;
    double pointEquivalent;
    
    if(semGrade >= 75) {
      remarks = "Passed";
      
    } else {
      remarks = "Failed";
    }
    
    if(semGrade == 100) {
      pointEquivalent = 1.00;
      
    } else if(semGrade >= 95) {
      pointEquivalent = 1.50;
      
    } else if(semGrade >= 90) {
      pointEquivalent = 2.00;
      
    } else if(semGrade >= 85) {
      pointEquivalent = 2.50;
      
    } else if(semGrade >= 80) {
      pointEquivalent = 3.00;
      
    } else if(semGrade >= 75) {
      pointEquivalent = 3.50;
      
    } else {
      pointEquivalent = 5.00;
    }
    
    System.out.println("\nSemestral Grade: " + semGrade);
    System.out.println("Point Equivalent: " + pointEquivalent);
    System.out.println("Remarks: " + remarks);
    
    System.out.println("\nPrepared By: ");
}
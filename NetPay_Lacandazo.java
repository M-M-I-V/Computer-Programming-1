import java.util.Scanner;

public class NetPay_Lacandazo {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Number: ");
    String number = scan.nextLine();
    
    System.out.print("Last Name: ");
    String lastName = scan.nextLine();
    
    System.out.print("First Name: ");
    String firstName = scan.nextLine();
    
    System.out.print("Rate Per Hour: ");
    int ratePerHr = scan.nextInt();
    
    System.out.print("Rate Per Hour: ");
    int numOfHrsWorked = scan.nextInt();
    
    double grossPay = ratePerHr * numOfHrsWorked;
    System.out.println("\nGross Pay: " + grossPay);
    
    double sssDeduction = grossPay * 0.05;
    System.out.println("SSS Deduction: " + sssDeduction);
    
    double taxWithhold = grossPay * 0.10;
    System.out.println("Tax Withhold: " + taxWithhold);
    
    double totalDeduction = sssDeduction + taxWithhold;
    System.out.println("Total Deduction: " + totalDeduction);
    
    double netPay = grossPay - totalDeduction;
    System.out.println("Net Pay: " + netPay);
      
    System.out.println("\n\nPrepared By: Neil Jay Lacandazo");
  }
}
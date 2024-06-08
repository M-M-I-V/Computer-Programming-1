import java.util.Scanner;

public class CaseStudyThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Recipient's Name: ");
        String recipientName = scan.nextLine();

        System.out.println("\n\tRegions\n" +
                "NCR\n" + "CAR\n" + "I\n" + "II\n" + "III\n" + "IV-A\n" + "IV-B\n" + "V\n" + "VI\n" + "VII\n" + "VIII\n" + "IX\n" + "X\n" + "XI\n" + "XII\n" + "CARAGA\n" + "BARMM\n");

        System.out.print("Recipient's Region: ");
        String recipientRegion = scan.nextLine().toUpperCase();

        String questionResponse;  

        do {
            System.out.print("4Ps Recipient? (Y/N): ");
            questionResponse = scan.nextLine().toUpperCase();

        } while (!questionResponse.equals("Y") && !questionResponse.equals("N"));

        double ameliorationAmount = 0;

        if (recipientRegion.equals("NCR")) {
            ameliorationAmount = questionResponse.equals("N") ? 8000.00 : 6650.00;

        } else if (recipientRegion.equals("CAR") || recipientRegion.equals("I") || recipientRegion.equals("II")) {
            ameliorationAmount = questionResponse.equals("N") ? 5500.00 : 4150.00;

        } else if (recipientRegion.equals("III") || recipientRegion.equals("IV-A") || recipientRegion.equals("VII")) {
            ameliorationAmount = questionResponse.equals("N") ? 6500.00 : 5150.00;

        } else if (recipientRegion.equals("IV-B") || recipientRegion.equals("V") || recipientRegion.equals("VIII") || recipientRegion.equals("IX") || recipientRegion.equals("XII") || recipientRegion.equals("CARAGA") || recipientRegion.equals("BARMM")) {
            ameliorationAmount = questionResponse.equals("N") ? 5000.00 : 3650.00;

        } else if (recipientRegion.equals("VI") || recipientRegion.equals("X") || recipientRegion.equals("XI")) {
            ameliorationAmount = questionResponse.equals("N") ? 6000.00 : 4650.00;

        } else {
            throw new RuntimeException("Please Enter a Valid Region");
        }

        System.out.println("Amelioration Amount: " + ameliorationAmount);
    }
}
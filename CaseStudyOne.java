import javax.swing.JOptionPane;

public class CaseStudyOne {
    public static void main(String[] args) {
      
        String recipientName = JOptionPane.showInputDialog("Recipient's Name: ");
        String recipientRegion = JOptionPane.showInputDialog("Region: ").toUpperCase();

        do {
            String questionResponse = JOptionPane.showInputDialog("4Ps Recipient? (Y/N): ").toUpperCase();

            if (!questionResponse.equals("Y") && !questionResponse.equals("N")) {
                System.out.println("Please enter a valid response.");
            }
            
        } while (!questionResponse.equals("Y") && !questionResponse.equals("N"));

        double ameliorationAmount = 0;

        if (recipientRegion.equals("NCR")) {
            ameliorationAmount = questionResponse.equals("N") ? 8000.00 : 6650.00;

        } else if (recipientRegion.equals("CAR")) {
            ameliorationAmount = questionResponse.equals("N") ? 5500.00 : 4150.00;

        } else if (recipientRegion.equals("I") || recipientRegion.equals("II")) {
            ameliorationAmount = questionResponse.equalsIgnoreCase("N") ? 5500.00 : 4150.00;

        } else if (recipientRegion.equals("III") || recipientRegion.equals("IV-A")) {
            ameliorationAmount = questionResponse.equals("N") ? 6500.00 : 5150.00;

        } else if (recipientRegion.equals("IV-B") || recipientRegion.equals("V") || recipientRegion.equals("VI") || recipientRegion.equals("VII")) {
            ameliorationAmount = questionResponse.equals("N") ? 5000.00 : 3650.00;

        } else if (recipientRegion.equals("VIII") || recipientRegion.equals("IX") || recipientRegion.equals("X") || recipientRegion.equals("XI") || recipientRegion.equals("XII") || recipientRegion.equals("CARAGA") || recipientRegion.equals("BARMM")) {
            ameliorationAmount = questionResponse.equals("N") ? 6000.00 : 4650.00;

       } else {
            throw new RuntimeException("Please Enter a Valid Region");
       }

	   	JOptionPane.showMessageDialog(null,
                "Recipient's Name: " + recipientName + "\nRegion: " + recipientRegion + "\nAmelioration Amount: " + ameliorationAmount,
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
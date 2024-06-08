import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseStudyTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Recipient's Name: ");
        String name = reader.readLine();

        int minWage = 0;

        while (true) {
            try {
                System.out.print("Recipient's Region Minimum Wage: ");
                minWage = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (e.g., 500).");
            }
        }

        String questionResponse;
        
        do {
            System.out.print("4Ps Recipient? (Y/N): ");
            questionResponse = reader.readLine().toUpperCase();
            
        } while (!questionResponse.equals("Y") && !questionResponse.equals("N"));

        double ameliorationAmount = 0;

        if (minWage >= 500) ameliorationAmount = questionResponse.equals("N") ? 8000.00 : 6650.00;
        else if (minWage >= 460) ameliorationAmount = questionResponse.equals("N") ? 7500.00 : 6150.00;
        else if (minWage >= 430) ameliorationAmount = questionResponse.equals("N") ? 7000.00 : 5650.00;
        else if (minWage >= 400) ameliorationAmount = questionResponse.equals("N") ? 6500.00 : 5150.00;
        else if (minWage >= 360) ameliorationAmount = questionResponse.equals("N") ? 6000.00 : 4650.00;
        else if (minWage >= 330) ameliorationAmount = questionResponse.equals("N") ? 5500.00 : 4150.00;
        else ameliorationAmount = questionResponse.equals("N") ? 5000.00 : 3650.00;

        System.out.println("Amelioration Amount: " + ameliorationAmount);
    }
}
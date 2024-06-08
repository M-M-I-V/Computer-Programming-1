import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InchesFoot_Lacandazo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inches(in): ");
        String inches = reader.readLine();

        double feet = Double.parseDouble(inches) / 12;
        System.out.println("Measure in Feet(ft): " + feet);
        
        System.out.println("\nPrepared By: Neil Jay Lacandazo");
    }
}
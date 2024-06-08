import javax.swing.*;

public class SquareCube_Lacandazo {
    public static void main(String[] args) {
        
        String Num = JOptionPane.showInputDialog("Enter a number:");
        
        double num = Double.parseDouble(Num);
        
        double numSquare = Math.pow(num, 2);
        double numCube = Math.pow(num, 3);
        
        JOptionPane.showMessageDialog(null,
                "Number: " + num + "\nSquare: " + numSquare + "\nCube: " + numCube,
                "Results", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Prepared By: Neil Jay Lacandazo");
    }
}
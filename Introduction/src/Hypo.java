import javax.swing.*;
import javax.swing.plaf.metal.MetalTheme;

public class Hypo {
    public static void main(String[] args) {
        double side1  = Double.parseDouble(JOptionPane.showInputDialog("Enter side 1 : "));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Side 2  : "));
        double hypo = Math.sqrt((side2 * side2) + (side1*side1));
        JOptionPane.showMessageDialog(null , "The Hypotenuse is : " +hypo);
    }
}

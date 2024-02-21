package Window;

import javax.swing.*;
import javax.swing.JOptionPane;

public class BasicDialogueWindow {


    public class Main {
        public static void main(String[] args) {
            String nm = JOptionPane.showInputDialog("Enter Your Name ");
            JOptionPane.showMessageDialog(null , "Hey there " + nm);

            int age  = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
            JOptionPane.showMessageDialog(null , "Your Age is "+age);

            double height = Double.parseDouble(JOptionPane.showInputDialog("Whats your height?"));
            JOptionPane.showMessageDialog(null,"your height is " + height);


        }

    }
}

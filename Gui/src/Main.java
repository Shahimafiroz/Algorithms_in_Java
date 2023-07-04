import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
        String nm = JOptionPane.showInputDialog("Enter Your Name ");
        JOptionPane.showMessageDialog(null , "Hey there " + nm);
    }

}
package Window;

import javax.swing.*;
import java.awt.Color;


public class MyJframe extends JFrame {
    MyJframe(){
        JFrame frame = new JFrame();
        this.setTitle("Shahima ");
        this.setSize(1000, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true); // Set after icon loading
        this.getContentPane().setBackground(new Color(123 ,50, 250)); // rgb vals

    }
}

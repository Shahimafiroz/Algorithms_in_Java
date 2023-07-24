/*
Syntax :-
  if(condition){
    code block
    }else if (condition 2){
    code block 2
    }else{
    default code block
    }
 */
import  javax.swing.JOptionPane;
public class Condi_if_elseif_else {
    public static void main(String[] args) {
       double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter your salary : "));
       double bonus;
       if(salary >= 50000 ){
           bonus = 0.1 * salary;
           salary = salary + bonus;
        JOptionPane.showMessageDialog(null , "Your salary for this month is " +salary+" and the bonus is " +bonus+ " . ");
       }else if(salary >= 100000){
           bonus = 0.2 *salary;
           salary = salary+bonus;
            JOptionPane.showMessageDialog(null , "Your salary for this month is " +salary+" and the bonus is " +bonus+ " .");
        }else{
           bonus = 0.3 *salary;
           salary = salary+bonus;
           JOptionPane.showMessageDialog(null , "Your salary for this month is " +salary+" and the bonus is " +bonus+ " .");
        }

    }
}
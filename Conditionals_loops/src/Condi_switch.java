/*
syntax :-

switch(parameter of comparison){
case "comparison condition" : code to be executde;
  break;
 case "comparison condition" : code to be executde;
  break;
 case "comparison condition" : code to be executde;
  break;
}

 */

import  javax.swing.JOptionPane;
public class Condi_switch {
    public static void main(String[] args) {
      String day = JOptionPane.showInputDialog("Enter the day of the week today  : ");
      switch (day){
          case "monday" : JOptionPane.showMessageDialog(null, "Hey Good luck for a new hectic week");
            break;
          case "tuesday" : JOptionPane.showMessageDialog(null, "Chill! 4 more days for an holiday");
            break;
          case "wednesday" : JOptionPane.showMessageDialog(null, "Seriously bro ? 3 more days");
            break;
          case "thursday" : JOptionPane.showMessageDialog(null, "Keep moving ahead. 2 more days");
              break;
          case "friday" : JOptionPane.showMessageDialog(null, "One more day");
              break;
          case "saturday" : JOptionPane.showMessageDialog(null, "Welcome back home !! enjoy your holiday tomorrow.");
              break;
          case "sunday" : JOptionPane.showMessageDialog(null, "Relax dude! and prepare for tomorrow");
              break;
      }
        // new and neater syntax of SWITCH statemnet
        //OLD
    /*    switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                JOptionPane.showMessageDialog(null, "WEEKDAY! KEEP WORKING");
                break;
            case "STAURDAY":
            case "SUNDAY":
                JOptionPane.showMessageDialog(null, "WEEKEND WOOOHOO !! RELAX ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pls enter a valid input ");
                break;
        }

     */
        ///// NEW !!!!!!
        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                    JOptionPane.showMessageDialog(null, "WEEKDAY! KEEP WORKING");
            case "STAURDAY", "SUNDAY" -> JOptionPane.showMessageDialog(null, "WEEKEND WOOOHOO !! RELAX ");
            default -> JOptionPane.showMessageDialog(null, "Pls enter a valid input ");
        }

        //////// NESTED SWITCH STATEMENT
        













    }
}


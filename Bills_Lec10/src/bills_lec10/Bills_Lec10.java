
package bills_lec10;
import javax.swing.*;

public class Bills_Lec10 {

    
    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customers name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the minutes talked"));
         double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the cost per minute"));
         
         //send variables to constructor in the bill class
         bill b = new bill(strName, dblMinutesTalked, dblCostPerMinute);
         
         JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " +
                 b.getName().toUpperCase() + "\n" +
                 "Total Due: R " + b.getTotalBills());
         
         
    }
    
}

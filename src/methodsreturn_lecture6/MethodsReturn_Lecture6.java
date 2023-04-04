
package methodsreturn_lecture6;
import javax.swing.JOptionPane;


public class MethodsReturn_Lecture6 {

    public static double dblVat = 0.15;
    
    public static void main(String[] args) {
        String strProduct = JOptionPane.showInputDialog(null, "Please enter product name");
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price for "
        + strProduct));
        int IntAmt = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of products"));
        double dblTotal_Discount = amount_due(dblPrice,IntAmt);
        
    JOptionPane.showMessageDialog(null,
               "PRODUCT: " + strProduct + "\n" +
                "PRICE: R "  + dblPrice + "\n" +
                 "TOTAL: " + (dblPrice*IntAmt) + "\n" +
                  "DISCOUNTED_TOTAL: R " + dblTotal_Discount);
        
    }

    private static double amount_due(double dblPrice, int IntAmt) {
        double dblTotal = (dblPrice * IntAmt);
        double dblDiscount = (dblTotal * dblVat);
        double dblTotal_Discount = (dblTotal - dblDiscount);
        return dblTotal_Discount;
    }
    
}

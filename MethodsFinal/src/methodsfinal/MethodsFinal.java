/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsfinal;
import javax.swing.JOptionPane;


public class MethodsFinal {
public static  final double dblVat= 0.14;
    
    public static void main(String[] args) {
       String strProduct = JOptionPane.showInputDialog(null, "Please enter the product name");
       double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price for "
       + strProduct));
       int IntAmt = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount of products"
       ));
       double dblTotal = (dblPrice * IntAmt);
       double dblVat_Amt = calculate_vat(dblTotal, dblVat);
       double dblGrandTotal = calculate_grand_total(dblTotal, dblVat_Amt);
       print_invoice(strProduct, dblGrandTotal, dblVat_Amt, dblTotal);
    }

    private static double calculate_vat(double dblTotal, double dblVat) {
       double dblVat_Amt = (dblTotal * dblVat);
       return dblVat_Amt;
    }

    private static double calculate_grand_total(double dblTotal, double dblVat_Amt) {
        double dblGrand_Total = (dblTotal + dblVat_Amt);
        return dblGrand_Total;
    }

    private static void print_invoice(String strProduct, double dblGrandTotal, double dblTax, double dblBeforeTax)
    {
       JOptionPane.showMessageDialog(null,
               "PRODUCT: " + strProduct + "\n" +
                "EX VAT: R "  + dblBeforeTax + "\n" +
                 "VAT AMOUNT: " + dblTax + "\n" +
                  "TOTAL INCLUDING VAT: R " + dblGrandTotal);
    }
    
}

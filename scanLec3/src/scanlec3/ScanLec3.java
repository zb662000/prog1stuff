/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanlec3;
import java.util.Scanner;
/**
 * * @author Zahra
 */
public class ScanLec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //Prompt user for data entries        
        System.out.print("Enter Customer Name");
        String strCustomer = scan.nextLine();
        
         System.out.print("Enter Product Name");
        String strProduct = scan.nextLine();
        
         System.out.print("Enter Address");
        String strAddress = scan.nextLine();
        
        //Code to produce delivery report
        System.out.println("DELIVERY REPORT");
        System.out.println("---------------");
        System.out.println("CUSTOMER: \t " + strCustomer);
        System.out.println("PRODUCT: \t " + strProduct);
        System.out.println("ADDRESS: \t " + strAddress);
        
    }
    
}

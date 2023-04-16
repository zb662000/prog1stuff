/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseex4;
import java.util.Scanner;

/**
 *
 * @author Zahra
 */
public class IfElseEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a grade");
        int n = scan.nextInt();
        
        if(n >= 90 && n <= 100){
            System.out.println("A");
        }
        else if (n >= 80 && n < 90){
            System.out.println("B");
        }
         else if (n >= 70 && n < 80){
            System.out.println("C");
        }
         else if (n >= 65 && n < 70){
            System.out.println("D");
        }
        else if (n >= 50 && n < 65){
            System.out.println("E");
        }
        else{
            System.out.println("F");
            
        }
    }
    
}

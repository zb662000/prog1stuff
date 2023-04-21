/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopex3;
import java.util.Scanner;

/**
 *
 * @author Zahra
 */
public class WhileloopEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean Run = true;
        while (Run == true){
            System.out.println("Please enter 1");
            Scanner keyboard = new Scanner(System.in);
            String userInput = keyboard.next();
            
            if(userInput.equals("1")){
                System.out.println("Thank you for entering 1");
                Run = false;
            }
            else{
                System.out.println("Please enter the correct option");
                Run = true;
            }
            System.out.println("Thank you, goodbye");
        }
    }
    
}

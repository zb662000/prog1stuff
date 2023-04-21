/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhilemeaningful;
import java.util.Scanner;

/**
 *
 * @author Zahra
 */
public class LoopWhileMeaningful {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
String name = "";

while(name.isEmpty()){
System.out.print("Enter your name:    ");
name = scan.nextLine();

}

System.out.println("Hello " + name);
    }
    
}

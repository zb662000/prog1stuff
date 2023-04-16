/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseex2;

/**
 *
 * @author Zahra
 */
public class IfElseEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int age = 25;
     
     if (age >= 75){
         System.out.println("You are a senior citizen!");
     }
     else if ( age >= 18){
         System.out.println("You are an adult!");
     }
     else {
         System.out.println("You are NOT an adult!");     
    }
    
}

}
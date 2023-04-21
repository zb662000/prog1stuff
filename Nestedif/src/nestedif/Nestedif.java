/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

/**
 *
 * @author Zahra
 */
public class Nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int instatement = 11;
      
      
      if (instatement <= 15){
          
          if (instatement <= 10) {
              System.out.println(instatement - 1);
          }
          else{
              System.out.println(instatement - 2);
          }
          
      //Author: w3schools
      //Date: 13 November 2013
      //Website: https://www.w3schools.com/java/java_conditions.asp
      //Date of Access: 17th April 2023
      
      }
      else 
      {
          System.out.println(instatement - 1);
      }
    }
    
}

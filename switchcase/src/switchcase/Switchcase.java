/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author Zahra
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = 9;
        
      switch(day){
          case 1:
              System.out.println("Sunday");
              break;
          case 2:
              System.out.println("Monday");
              break;
          case 3: 
              System.out.println("Tuesday");
              break;
              case 4:
              System.out.println("Wednesday");
              break;
          case 5:
              System.out.println("Thursday");
              break;
          case 6: 
              System.out.println("Friday");
              break;
          case 7: 
              System.out.println("Saturday");
              break;
          default:
              System.out.println("Not valid range");
      }
        }
    }
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsex3;

/**
 *
 * @author Zahra
 */
public class IfElsEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isMale = false;
        boolean isTall = true;
        
        if (isMale && isTall){
            System.out.println("You are a tall male");
        }
        else if (isMale && !isTall) {
            System.out.println("You are a short male");
            
            
        }
         else if (!isMale && isTall) {
            System.out.println("You are not a male but you are tall");
            
        }
        else{
              System.out.println("You are not a male");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_lec9v2;

/**
 *
 * @author Zahra
 */
public class Calculations {
    private int num1, num2;
    
    public Calculations (int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
        
    }
    public int getAddition(){
        return (num1 + num2);
    }
    
     public int getSubtraction(){
        return (num1 - num2);
    }
     
       public int getMultiply(){
        return (num1 * num2);
    }
       
          public int getDivision(){
        return (num1 / num2);
    }
}


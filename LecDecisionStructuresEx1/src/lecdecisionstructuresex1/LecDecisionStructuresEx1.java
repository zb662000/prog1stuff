/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecdecisionstructuresex1;

/**
 *
 * @author Zahra
 */
public class LecDecisionStructuresEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        double a, b, c;
        
        x = 3;
        y = 4;
        
        if ( x < y) System.out.println("x is less than y");
        if (x == y) System.out.println("x is equal to y");
        
        a = 3.45;
        b = 4.25;
        c = 3.45;
        
        if (a ==c )System.out.println("a is equal to c");
        if (b >= a) System.out.println("b is greater than or equal to a");
        if (a != b) System.out.println("a is not equal to b");
        
        //              == is equal to
		// != is not equal to
		// <= less than or equal to
		// < less than
		// > greater than
		// >= greater than or equal to
    }
    
}

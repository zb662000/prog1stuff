
package parse;

public class Parse {

   
    public static void main(String[] args) {
        // Parse
        
        String input = "123";
        
        int number = Integer.parseInt(input);
        System.out.println("The number is: " + number);
        
        String str = "42";
        int myInt = Integer.parseInt(str);
        System.out.println("The value of myInt is: " + myInt);
        
        String str2 = "3.14";
        double myDouble = Double.parseDouble(str2);
        System.out.println("The value of myDouble is: " + myDouble);
        
    }
    
}

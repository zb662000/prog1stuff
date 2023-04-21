
package swicthdog;


public class SwicthDog {

    
    public static void main(String[] args) {
        String dog = "great dane";
        
        switch(dog){
            case "jack russel":
                System.out.println("small dog");
                break;
            case "great dane":
                System.out.println("large dog");
                break;
            default:
                System.out.println("try a different dog breed");
         
        }
        
    }
    
}

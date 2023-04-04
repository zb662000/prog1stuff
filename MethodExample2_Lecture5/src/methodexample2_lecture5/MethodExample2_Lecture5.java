
package methodexample2_lecture5;
import javax.swing.JOptionPane;

public class MethodExample2_Lecture5 {

    
    public static void main(String[] args) {
        // user enters data 
        String strName = JOptionPane.showInputDialog(null,"Please enter your name");
           String strDOB = JOptionPane.showInputDialog(null,"Please enter your date of birth");
            String strTel = JOptionPane.showInputDialog(null,"Please enter your phone number");
            String strID = JOptionPane.showInputDialog(null,"Please enter your ID number");
            
            print_details(strName, strDOB, strTel, strID);
            exit_application();
    }
    
    private static void print_details(String strName, String strDOB, String strTel, String
            strID){
        
         JOptionPane.showMessageDialog(null,"NAME: " + strName + "\n" +
                 "DATE OF BIRTH: " + strDOB + "\n" +
                 "CONTACT: " + strTel + "\n" +
                 "ID: " + strID);
    }

    private static void exit_application() {
       JOptionPane.showMessageDialog(null, "Thank you for using the application");
       System.exit(0);
    }
    
}

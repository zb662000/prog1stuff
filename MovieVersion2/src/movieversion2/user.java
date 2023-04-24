
package movieversion2;
import javax.swing.JOptionPane;


public class user {
    public void checkMovieTitle() {
        String title = JOptionPane.showInputDialog("Enter the title of the movie (no more than 20 characters):");
        if (title.length() > 20) {
            JOptionPane.showMessageDialog(null, "Movie title must be no more than 20 characters.");
        } else {
            JOptionPane.showMessageDialog(null, "Movie entered into database.");
        }
    }
    //, \d is a metacharacter that matches any digit from 0 to 9.
    public void checkMovieCode() {
        String code = JOptionPane.showInputDialog("Enter the movie code (at least 4 characters, containing a capital letter, "
                + "an underscore, and a number):");
        if (code.length() < 4 || !code.matches(".*[A-Z].*") || !code.matches(".*_.*") || !code.matches(".*\\d+.*")) {
            JOptionPane.showMessageDialog(null, "Movie code must be at least 4 characters, contain a capital letter, "
                    + "an underscore, and a number.");
        } else {
            JOptionPane.showMessageDialog(null, "Movie code saved.");
        }
    }
    
    
}

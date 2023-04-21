
package movie;
import javax.swing.JOptionPane;

public class Movie {

   
    public static void main(String[] args) {
      // Prompt the user to enter the movie title
        String title = JOptionPane.showInputDialog("Enter the movie title (no more than 20 characters):");

        // Check if the title is too long
        if (title.length() > 20) {
            JOptionPane.showMessageDialog(null, "Error: Movie title cannot be more than 20 characters.");
            return;
        }

        // Prompt the user to enter the movie code
        String code = JOptionPane.showInputDialog("Enter the movie code (at least 4 characters with a capital letter "
                + "and a number):");

        // Check if the code is formatted properly
        if (!code.matches("[A-Z].*[0-9].*") || code.length() < 4) {
            JOptionPane.showMessageDialog(null, "Error: Incorrect movie code formatting.");
            return;
        }

        // Check if the title is exactly 20 characters long
        if (title.length() == 20) {
            JOptionPane.showMessageDialog(null, "Movie entered into database.");
        } else {
            JOptionPane.showMessageDialog(null, "Movie title saved.");
        }

        // Check if the code is correctly formatted
        JOptionPane.showMessageDialog(null, "Movie code saved.");
    }
    
}


package bookcapturingapp;
import javax.swing.JOptionPane;
/**
 *
 * @author Zahra
 */
public class BookCapturingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Display welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Book Capturing App!");

        // Loop until the user chooses to quit
        int choice = 0; // initialize choice to a valid value
        while (choice != 3) { // loop until user chooses to quit
            // Display the menu and prompt the user to choose an option
            String input = JOptionPane.showInputDialog("Menu:\n1. Add Book\n2. Book List\n3. Quit\nEnter your choice:");

            // Validate that the user has entered a valid input
            while (!input.matches("[1-3]")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid choice (1-3).");
                input = JOptionPane.showInputDialog("Menu:\n1. Add Book\n2. Book List\n3. Quit\nEnter your choice:");
            }

            // Convert the input string to an integer
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    // Create a new Book object with the captured details
                    Book.createFromUserInput();

                    break;

                case 2:
                    Book.displayBookList();
                    break;

                case 3:
                    // Display goodbye message
                    JOptionPane.showMessageDialog(null, "Thank you for using the Book Capturing App!");
                    break;

                default:
                    // Display error message for invalid choice
                    JOptionPane.showMessageDialog(null, "Please enter a valid choice (1-3).");
                    break;
            }
        }
    }
}

 

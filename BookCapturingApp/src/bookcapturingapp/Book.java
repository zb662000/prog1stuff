
package bookcapturingapp;
import javax.swing.JOptionPane;
/**
 *
 * @author Zahra
 */
public class Book {
    private String id;
    private String name;
    private String author;
    private String genre;
    private int numPages;
    private String category;

    public Book(String name, String author, String genre, int numPages, String category) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
        this.category = category;

        // Generate the book ID using a substring of the name and author
        String namePrefix = name.substring(0, 3).toUpperCase();
        String authorPrefix = author.substring(0, 3).toUpperCase();
        this.id = namePrefix + authorPrefix + String.format("%03d", hashCode() % 1000);
    }

    public static void createFromUserInput() {
        // Prompt the user for book details
        String name = JOptionPane.showInputDialog("Enter book name:");
        String author = JOptionPane.showInputDialog("Enter author name:");
        String genre = JOptionPane.showInputDialog("Enter genre:");
        String input = JOptionPane.showInputDialog("Enter number of pages:");
        int numPages = 0;
        
        while (!input.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
            input = JOptionPane.showInputDialog("Enter number of pages:");
        }
        numPages = Integer.parseInt(input);
        String category = JOptionPane.showInputDialog("Enter category:");

        // Create a new Book object with the captured details
        Book book = new Book(name, author, genre, numPages, category);

        // Display success message and book details
        JOptionPane.showMessageDialog(null, "Book added:\n" + book.toString());
    }

    public static void displayBookList() {
        JOptionPane.showMessageDialog(null, "Coming soon!");
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAuthor: " + author + "\nGenre: " + genre + "\nNumber of Pages: " + numPages
                + "\nCategory: " + category;
    }
}


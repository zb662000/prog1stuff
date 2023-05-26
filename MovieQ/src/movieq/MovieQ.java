
package movieq;
import javax.swing.JOptionPane;

public class MovieQ {
private static Movie movie;
   
    public static void main(String[] args) {
      
        showWelcomeScreen();
        showMenu();
    }

    public static void showWelcomeScreen() {
        JOptionPane.showMessageDialog(null, "Welcome to the Movie Capturing App!");
    }

    public static void showMenu() {
        while (true) {
            String option = JOptionPane.showInputDialog(null, "Please choose an option:\n" +
                    "1. Add new movie\n" +
                    "2. View movie list\n" +
                    "3. Quit");

            switch (option) {
                case "1":
                    addNewMovie();
                    break;
                case "2":
                    viewMovieList();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Exiting the Movie Capturing App. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose a valid option.");
            }
        }
    }

    public static void addNewMovie() {
        String movieName = JOptionPane.showInputDialog("Enter the movie name:");
        String genre = JOptionPane.showInputDialog("Enter the genre:");
        String favoriteQuote = JOptionPane.showInputDialog("Enter your favorite quote from the movie:");

        movie = new Movie(movieName, genre, favoriteQuote);

        JOptionPane.showMessageDialog(null, "Movie details added successfully!");
    }

    public static void viewMovieList() {
        if (movie == null) {
            JOptionPane.showMessageDialog(null, "No movies added yet.");
            return;
        }

        StringBuilder message = new StringBuilder();
        message.append("Movie Name: ").append(movie.getName()).append("\n")
                .append("Genre: ").append(movie.getGenre()).append("\n")
                .append("Favorite Quote: ").append(movie.getFavoriteQuote());

        JOptionPane.showMessageDialog(null, message.toString());
    }
}
    

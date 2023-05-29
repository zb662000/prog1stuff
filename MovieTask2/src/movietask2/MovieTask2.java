
package movietask2;
import javax.swing.JOptionPane;

public class MovieTask2 {

   
    public static void main(String[] args) {
               int numMovies = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of movies:"));
        int totalHours = 0;

        for (int i = 1; i <= numMovies; i++) {
            String description = JOptionPane.showInputDialog("Enter the description for movie " + i + ":");
            while (description.length() > 100) {
                description = JOptionPane.showInputDialog("The description must be less than 100 characters. Enter again:");
            }

            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration in minutes for movie " + i + ":"));
            totalHours += duration / 60; // Accumulate the hours

            Movie movie = new Movie(description, duration);
            JOptionPane.showMessageDialog(null, "Movie added:\n\n"
                    + "Movie ID: " + movie.getMovieId() + "\n"
                    + "Description: " + movie.getDescription() + "\n"
                    + "Duration: " + movie.getDuration() + " minutes");
        }

        JOptionPane.showMessageDialog(null, "Total hours across all movies: " + totalHours);
    }
    }
    

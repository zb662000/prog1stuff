
package studentmarkprogram;
import javax.swing.JOptionPane;


public class StudentMarkProgram {

   
    public static void main(String[] args) {
        String[] studentNames = new String[10];
        double[] studentMarks = new double[10];

        for (int i = 0; i < studentNames.length; i++) {
            String name = JOptionPane.showInputDialog("Enter student name #" + (i + 1) + ":");
            studentNames[i] = name;

            String marksStr = JOptionPane.showInputDialog("Enter marks for " + name + ":");
            double marks = Double.parseDouble(marksStr);
            studentMarks[i] = marks;
        }

        StringBuilder output = new StringBuilder("Student Average Marks:\n");
        for (int i = 0; i < studentNames.length; i++) {
            output.append(studentNames[i]).append(": ").append(studentMarks[i]).append("\n");
        }

        double average = calculateAverage(studentMarks);
        output.append("\nOverall Average Marks: ").append(average);

        JOptionPane.showMessageDialog(null, output.toString());
    }

    public static double calculateAverage(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    
}

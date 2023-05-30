
package students;
import javax.swing.JOptionPane;

public class Students {

    
    public static void main(String[] args) {
        int studentCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students:"));
        Student[] students = new Student[studentCount];
        double totalHours = 0;

        for (int i = 0; i < studentCount; i++) {
            String name = JOptionPane.showInputDialog("Enter the name of student " + (i + 1) + ":");
            String surname = JOptionPane.showInputDialog("Enter the surname of student " + (i + 1) + ":");
            int assignmentMark = Integer.parseInt(JOptionPane.showInputDialog("Enter the assignment mark of student " + (i + 1) + ":"));
            int timeStudiedMinutes = Integer.parseInt(JOptionPane.showInputDialog("Enter the time studied (in minutes) by student " + (i + 1) + ":"));

            Student student = new Student(name, surname, assignmentMark, timeStudiedMinutes);
            students[i] = student;

            totalHours += student.getTimeStudiedHours();
        }

        StringBuilder message = new StringBuilder();
        for (Student student : students) {
            message.append("Name: ").append(student.getName()).append("\nSurname: ").append(student.getSurname())
                    .append("\nAssignment Mark: ").append(student.getAssignmentMark())
                    .append("\nTime Studied: ").append(student.getTimeStudiedHours()).append(" hours\n\n");
        }

        JOptionPane.showMessageDialog(null, message.toString());
        JOptionPane.showMessageDialog(null, "Total hours studied by all students: " + totalHours + " hours");
    }
}
    
    


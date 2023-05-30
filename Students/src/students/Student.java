
package students;


public class Student {
  private String name;
    private String surname;
    private int assignmentMark;
    private int timeStudiedMinutes;

    //constructor to add student objects
    public Student(String name, String surname, int assignmentMark, int timeStudiedMinutes) {
        this.name = name;
        this.surname = surname;
        this.assignmentMark = assignmentMark;
        this.timeStudiedMinutes = timeStudiedMinutes;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAssignmentMark() {
        return assignmentMark;
    }

    public int getTimeStudiedMinutes() {
        return timeStudiedMinutes;
    }

    public double getTimeStudiedHours() {
        return timeStudiedMinutes / 60.0;
    }
}  


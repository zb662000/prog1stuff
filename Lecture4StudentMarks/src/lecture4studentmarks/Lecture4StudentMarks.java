/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4studentmarks;
import java.util.Scanner;

/**
 *
 * @author Zahra
 */
public class Lecture4StudentMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaring the scanner class
        Scanner scan = new Scanner(System.in);
        //Variable declaration
        String strStudentNumber = "", strName ="";
        double dblTest = 0.0, dblAssignment = 0.0, 
                dblExam = 0.0, dblAverage;
        
        //prompt user for data entries
        System.out.print("Please enter the student number: ");
        strStudentNumber = scan.nextLine();
        
          System.out.print("Please enter the student name: ");
        strName = scan.nextLine();
        
        System.out.print("Please enter the test mark: ");
        dblTest = scan.nextDouble();
        
        System.out.print("Please enter the assignment mark: ");
        dblAssignment = scan.nextDouble();
        
        System.out.print("Please enter the exam mark: ");
        dblExam = scan.nextDouble();
        
        dblAverage = (dblTest + dblAssignment + dblExam) / 3;
        
        //Student report
        
        System.out.println("STUDENT ACADEMIC RECORD");
        System.out.println("------------------------");
        System.out.println("STUDENT NUMBER \t\t" + strStudentNumber);
          System.out.println("STUDENT NAME \t\t" + strName);
          System.out.println("TEST RESULT \t\t" + dblTest + "%");
           System.out.println("ASSIGNMENT RESULT \t" + dblAssignment + "%");
           System.out.println("EXAM RESULT \t\t" + dblExam + "%");
            System.out.println("AVERAGE RESULT \t\t" + dblAverage + "%");
             System.out.println("------------------------");
    }
    
}

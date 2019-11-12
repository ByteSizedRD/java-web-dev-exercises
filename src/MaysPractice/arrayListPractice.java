package MaysPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students(Or ENTER to finish):");

        //Get student names with a do-while loop and an imbedded if statement, add new student to students ArrayList
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while (!newStudent.equals(""));

        //Get student grade with a for loop, adding new grade to the grades ArrayList
        for(String student: students) {
            System.out.println("Grade for " + student + ":");
            double grade = input.nextDouble();
            grades.add(grade);
        }
// remember that \n is used for new lines.
        System.out.println("\nClass Roster: ");

        //initalizing a base sum of 0
        double sum = 0.0;

        //using a for loop to print out single grades and add grades to base sum variable
        for  (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum/students.size();
        System.out.println("Average grade: " + avg);
    }
}

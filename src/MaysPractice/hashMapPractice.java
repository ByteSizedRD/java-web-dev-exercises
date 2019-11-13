package MaysPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                input.nextLine();

            }

        } while(!newStudent.equals(""));
        System.out.println("\nClass Roster");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}

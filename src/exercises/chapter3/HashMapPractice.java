package exercises.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> studentRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int studentIDNumber;



        System.out.println("Please enter student ID number or enter 0 to finish: ");

        do {
            System.out.println("Student ID #: ");
            studentIDNumber = input.nextInt();

            if (studentIDNumber != 0) {


                System.out.println("Please enter student name: ");
                studentName = input.next();

                studentRoster.put(studentIDNumber, studentName);

                input.nextLine();
            }

        }while (studentIDNumber != 0);

        System.out.println("\nClass Roster");
        for (Map.Entry<Integer, String> students : studentRoster.entrySet()) {
            System.out.println(students.getKey() + " (" + students.getValue() + ")");

        }


    }
}

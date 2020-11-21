package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();
        Integer studentId = null;

        System.out.println("Enter your students (or ENTER 0 to finish)");

        // get student id and grade
        do{
            System.out.println("Student ID - ");
            studentId = input.nextInt();

            if (studentId != 0){
                System.out.println("Student Name - ");
                String studentName = input.next();

                students.put(studentId, studentName);
            }


            // Read in the newline before looping back
            input.nextLine();
        } while (studentId != 0);

        System.out.println("Class Roster");

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }
}

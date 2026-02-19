package lab.lab1.provlem4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name:");
        String name = scanner.nextLine();

        System.out.println("Enter description:");
        String description = scanner.nextLine();

        System.out.println("Enter credits:");
        int credits = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter prerequisite:");
        String prerequisite = scanner.nextLine();

        Course course = new Course(name, description, credits, prerequisite);

        System.out.println("How many students?");
        int n = scanner.nextInt();
        scanner.nextLine();

        GradeBook gradeBook = new GradeBook(course, n);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();

            System.out.println("Enter student id:");
            int id = scanner.nextInt();

            System.out.println("Enter study year:");
            int year = scanner.nextInt();

            System.out.println("Enter grade (0-100):");
            int grade = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(studentName, id, year);
            gradeBook.addStudent(student, grade);
        }

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();

        scanner.close();
    }
}

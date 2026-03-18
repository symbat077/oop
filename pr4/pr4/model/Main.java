package problem4.main;

import problem4.model.Student;
import problem4.service.NameComparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPROBLEM 4");
        System.out.println("==========");
        
        List<Student> students = Arrays.asList(
            new Student("Alice", 3.8),
            new Student("Bob", 3.5),
            new Student("Charlie", 3.9),
            new Student("Diana", 3.7)
        );
        
        System.out.println("\nOriginal: " + students);
        
        Collections.sort(students);
        System.out.println("Sorted by GPA: " + students);
        
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name: " + students);
    }
}

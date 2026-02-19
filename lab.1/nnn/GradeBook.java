package lab.lab1.problem4;

import practice2.Student;

public class GradeBook {

    private Course course;
    private Student[] students;
    private int[] grades;
    private int count;

    public GradeBook(Course course, int capacity) {
        this.course = course;
        students = new Student[capacity];
        grades = new int[capacity];
        count = 0;
    }

    public void addStudent(Student student, int grade) {
        if (count < students.length) {
            students[count] = student;
            grades[count] = grade;
            count++;
        }
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book!");
        System.out.println("Course: " + course);
    }

    public double determineClassAverage() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return (count == 0) ? 0 : (double) sum / count;
    }

    public int getMaximum() {
        int max = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] > max)
                max = grades[i];
        }
        return max;
    }

    public int getMinimum() {
        int min = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] < min)
                min = grades[i];
        }
        return min;
    }

    public void outputBarChart() {
        System.out.println("\nGrade distribution:");
        int[] frequency = new int[11];

        for (int i = 0; i < count; i++) {
            frequency[grades[i] / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10)
                System.out.print(" 100: ");
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void displayGradeReport() {
        System.out.println("\nGrade Report:");
        System.out.println("Average: " + determineClassAverage());
        System.out.println("Maximum: " + getMaximum());
        System.out.println("Minimum: " + getMinimum());
        outputBarChart();
    }
}

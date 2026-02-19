public class Student {
    private String name;
    private int id;
    private double grade;
    private static int nextId = 1;
    
    public Student() {
        this.name = "Unknown";
        this.id = nextId++;
        this.grade = 0;
    }
    
    public Student(String name) {
        this.name = name;
        this.id = nextId++;
        this.grade = 0;
    }
    
    public Student(String name, double grade) {
        this.name = name;
        this.id = nextId++;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return name + " (ID: " + id + ", Grade: " + grade + ")";
    }
}

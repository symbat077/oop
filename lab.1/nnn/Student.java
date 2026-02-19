package lab.lab1.provlem4;

public class Student {

    private String name;
    private int id;
    private int year;

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        year++;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Year: " + year + ")";
    }
}

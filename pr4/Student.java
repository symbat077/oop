package problem2.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
    @Override
    public void eatPizza() {
        System.out.println("Student is eating pizza");
    }
    
    @Override
    public void retakeExam() {
        System.out.println("Student is retaking exam");
    }
    
    @Override
    public void move() {
        System.out.println("Student is moving");
    }
}

package problem2.main;

import problem2.model.*;
import problem2.service.Restaurant;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROBLEM 2");
        System.out.println("==========");
        
        Restaurant restaurant = new Restaurant();
        
        Cat cat = new Cat();
        Student student = new Student();
        
        System.out.println("\n1. Serving Cat:");
        restaurant.servePizza(cat);
        
        System.out.println("\n2. Serving Student:");
        restaurant.servePizza(student);
    }
}

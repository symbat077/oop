package problem3.main;

import problem3.model.*;
import problem3.service.App;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPROBLEM 3");
        System.out.println("==========");
        
        App app = new App();
        
        System.out.println("\nLogicGame:");
        app.getStatistics(new LogicGame());
        
        System.out.println("\nMemoryGame:");
        app.getStatistics(new MemoryGame());
        
        System.out.println("\niPhone:");
        iPhone iphone = new iPhone();
        iphone.sell();
        iphone.plug();
    }
}

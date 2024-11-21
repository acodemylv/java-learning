package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        // Encapsulation (Getters, Setters)
        // Inheritance
        // Polymorphism
        // Abstraction

        Car audi = new Car("Blue", "RS6");
        audi.start();
        System.out.println(audi);

//        audi.color = "Blue";
//        audi.model = "RS6";
        audi.setColor("Blue");
        audi.setModel("RS6");
        System.out.println(audi);

        // Create BMW object
        // Start your BMW
        // Set color and mode
        // Print object

        Car bemochka = new Car();
        bemochka.setColor("Red");
        bemochka.setModel("X5");
        bemochka.start();
        System.out.println(bemochka);

        // Print text: My car model is %s, and color is: %s

        System.out.println(String.format("My car model is %s, and color is: %s", bemochka.getModel(), bemochka.getColor()));
        System.out.println("My car model is: " + bemochka.getModel() + " and color is: " + bemochka.getColor());

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();


    }
}
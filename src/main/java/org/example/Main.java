package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle v1 = new Vehicle(2, "Blue", 1.2f, "Gasoline");

        // Test getters
        System.out.println("Vehicle wheels: " + v1.getNumberOfWheels());
        System.out.println("Vehicle color: " + v1.getColor());
        System.out.println("Vehicle engine size: " + v1.getEngineSize());
        System.out.println("Vehicle fuel type: " + v1.getFuelType());

        // Test setters
        v1.setColor("Red");
        v1.setEngineSize(1.5f);
        System.out.println("Updated vehicle color: " + v1.getColor());
        System.out.println("Updated vehicle engine size: " + v1.getEngineSize());

        System.out.println();

        // Create a Car object
        Car c1 = new Car(4, "Black", 2.0f, "Gasoline", "Toyota");

        // Test Car methods
        c1.honk();
        c1.displayInfo();

        System.out.println();

        // Test inherited setters/getters on Car
        c1.setFuelType("Hybrid");
        c1.setColor("Silver");
        System.out.println("After updates:");
        c1.displayInfo();
    }
}
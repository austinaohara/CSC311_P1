package org.example;

public class Car extends Vehicle {
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("numberOfWheels: " + getNumberOfWheels() +
                "\ncolor: " + getColor() +
                "\nengineSize: " + getEngineSize() +
                "\nfuelType: " +getFuelType() +
                "\nbrand: " + brand);
    }
}

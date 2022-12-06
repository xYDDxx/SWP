package at.ydd.learning.objectOrientation.car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1. fuelComsumption = 5;
        c1.fuelAmount = 60;
        c1.serialNumber = "BMW1234";

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }
}

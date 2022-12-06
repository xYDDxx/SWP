package at.ydd.learning.objectOrientation.car;

public class Car {
    public int fuelComsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelComsumption;
        System.out.println("I am driving");
    }
}

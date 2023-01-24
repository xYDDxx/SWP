package at.ydd.learning.objectOrientation.car;

public class Car {
    private Engine engine;
    private int fuelComsumption;
    private int tankVolume;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;


    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelComsumption;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        if (this.fuelAmount > this.tankVolume * 0.1) {
            System.out.println("SuperBoostMode!");
        } else {
            System.out.println("Not enough fuel to go SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

    public void getRemainingRange() {
        int remainingRange = fuelAmount / fuelComsumption;
        System.out.println("Your remaining range is " + remainingRange + "km");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelComsumption(int fuelComsumption) {
        this.fuelComsumption = fuelComsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelComsumption() {
        return fuelComsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}




package at.ydd.learning.objectOrientation.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private Tank tank;
    private int fuelComsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private int speed;
    private List<RearMirror> mirrors;
    private List<Tire> tires;


    public Car(Engine engine, Tank tank, int fuelComsumption, String brand, String serialNumber, String color) {
        this.engine = engine;
        this.tank = tank;
        this.fuelComsumption = fuelComsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void drive() {
        tank.fuelAmount = tank.fuelAmount - fuelComsumption;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        if (tank.fuelAmount > tank.tankVolume * 0.1) {
            System.out.println("SuperBoostMode!");
        } else {
            System.out.println("Not enough fuel to go SuperBoostMode");
        }
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addTire(Tire tire){this.tires.add(tire);}

    public List<Tire> getTires() {
        return tires;
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

    public void getRemainingRange() {
        int remainingRange = tank.fuelAmount / fuelComsumption;
        System.out.println("Your remaining range is " + remainingRange + "km");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public int getFuelComsumption() {
        return fuelComsumption;
    }

    public void setFuelComsumption(int fuelComsumption) {
        this.fuelComsumption = fuelComsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}






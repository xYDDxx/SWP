package at.ydd.learning.objectOrientation.car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setColor("Pink");
        c1.setFuelAmount(40);
        c1.setFuelComsumption(7);
        c1.setSerialNumber("A1234");
        c1.setTankVolume(70);

        Engine e1 = new Engine(120, Engine.TYPE.GAS);

    }
}



package at.ydd.learning.basics.objectOrientation.remote;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);
        Remote r1 = new Remote();
        r1.addBattery(b1);
        r1.addBattery(b2);


        r1.getStatus();
        r1.turnOn();
        r1.turnOff();
    }
}

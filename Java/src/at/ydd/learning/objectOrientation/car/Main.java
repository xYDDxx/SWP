package at.ydd.learning.objectOrientation.car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(120, Engine.TYPE.GAS);
        Tank t1 = new Tank(50,20);
        t1.setTankVolume(70);
        t1.setFuelAmount(40);

        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-10);

        Tire tr1 = new Tire(20, 10);
        Tire tr2 = new Tire(20, -10);
        Tire tr3 = new Tire(22, 0);
        Tire tr4 = new Tire(22, 0);


        Car c1 = new Car(e1, t1, 7, "audi", "A1234", "gray");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.setSpeed(90);

        c1.addTire(tr1);
        c1.addTire(tr2);
        c1.addTire(tr3);
        c1.addTire(tr4);

        System.out.println(c1.getTires().get(0).getlocation());

    }
}
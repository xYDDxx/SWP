package at.ydd.learning.basics.objectOrientation.cars;


public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(600, Engine.TYPE.Gas);
        Producer p1 = new Producer("Audi", "Germany", 0.1);
        Car c1 = new Car("black", 250, 249000, 5,e1,p1);

    }

}

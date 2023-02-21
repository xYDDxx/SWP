package at.ydd.learning.objectOrientation.car;

public class Engine {
    public int horsePower;

    public enum TYPE {DIESEL, GAS}

    public TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

}

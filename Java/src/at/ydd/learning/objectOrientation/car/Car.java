package at.ydd.learning.objectOrientation.car;

public class Car {
    public int fuelComsumption;
    public int tankVolume;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public Car(int fuelComsumption, int tankVolume, int fuelAmount, String brand, String serialNumber){
        this.fuelComsumption = fuelComsumption;
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelComsumption;
        System.out.println("I am driving");
    }

    public void brake(){
        System.out.println("I am breaking");
    }

    public void turboBoost(){
        if (this.fuelAmount>this.tankVolume*0.1){
            System.out.println("SuperBoostMode!");
        }else{
            System.out.println("Not enough fuel to go SuperBoostMode");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut!");
        }
    }

    public void getRemainingRange(){
        int remainingRange = fuelAmount/fuelComsumption;
        System.out.println("Your remaining range is " + remainingRange + "km");
    }

}

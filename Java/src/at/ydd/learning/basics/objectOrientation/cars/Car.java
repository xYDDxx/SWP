package at.ydd.learning.basics.objectOrientation.cars;

public class Car {
    private String Color;
    private int maxspeed;
    private double baseprice;
    private double baseconsumption;
    private Engine engine;
    private Producer producer;
    private int mileage;
    private double consumption;

    public Car(String color, int maxspeed, double baseprice, double baseconsumption, Engine engine, Producer producer, int mileage) {
        Color = color;
        this.maxspeed = maxspeed;
        this.baseprice = baseprice;
        this.baseconsumption = baseconsumption;
        this.engine = engine;
        this.producer = producer;
        this.mileage = mileage;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }

    public double getBaseconsumption() {
        return baseconsumption;
    }

    public void setBaseconsumption(int baseconsumption) {
        this.baseconsumption = baseconsumption;
    }

    public void price() {
        double price = this.baseprice - baseprice * this.producer.getDiscount();
        System.out.println(price + "€");
    }

    public void consumption() {
        if (this.mileage <= 50000) {
            consumption = this.baseconsumption;
        } else if (this.mileage > 50000) {
            consumption = this.baseconsumption + this.baseconsumption * 0.098;
        }
        System.out.println("Dein Verbrauch bei " + this.mileage + "km beträgt: " + consumption + " l/km");

    }
}

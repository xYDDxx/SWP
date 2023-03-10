package at.ydd.learning.basics.objectOrientation.cars;

public class Car {
        private String Color;
        private int maxspeed;
        private double baseprice;
        private int baseconsumption;
        private Engine engine;
        private Producer producer;

        public Car(String color, int maxspeed, double baseprice, int baseconsumption, Engine engine, Producer producer) {
            Color = color;
            this.maxspeed = maxspeed;
            this.baseprice = baseprice;
            this.baseconsumption = baseconsumption;
            this.engine = engine;
            this.producer = producer;
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

    public int getBaseconsumption() {
        return baseconsumption;
    }

    public void setBaseconsumption(int baseconsumption) {
        this.baseconsumption = baseconsumption;
    }

    public void price(){
            double price = this.baseprice - baseprice * this.producer.getDiscount();
    }
}

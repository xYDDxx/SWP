package at.ydd.learning.basics.objectOrientation.cars;

public class Producer {
    private String name;
    private String origincountry;
    private double discount;

    public Producer(String name, String origincountry, double discount) {
        this.name = name;
        this.origincountry = origincountry;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}


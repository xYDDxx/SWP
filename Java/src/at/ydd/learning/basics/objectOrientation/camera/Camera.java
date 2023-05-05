package at.ydd.learning.basics.objectOrientation.camera;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int weight;
    private String color;
    private Manufacturer manufacturer;
    private List<Lens> lenses;
    private List<SDCard> sdCards;

    public enum Resolution {Small, Medium, Large}

    public Resolution resolution;
    private int SDCardCounter = -1;

    public Camera(int weight, String color, Manufacturer manufacturer, Resolution resolution) {
        this.weight = weight;
        this.color = color;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.lenses = new ArrayList<>();
        this.sdCards = new ArrayList<>();
    }

    public void takePicture(String name, String date) {
        int size = 0;
        if (this.resolution == Resolution.Small) {
            size = 2;
        } else if (this.resolution == Resolution.Medium) {
            size = 4;
        } else if (this.resolution == Resolution.Large) {
            size = 6;
        }

        if (this.sdCards.get(SDCardCounter).getCapacity() < 6) {
            System.out.println("WARNING: Almost no storage left on SD-Card" + SDCardCounter);
        }
        if (size <= this.sdCards.get(SDCardCounter).getCapacity()) {
            Picture P = new Picture(name, date, size);
            this.sdCards.get(SDCardCounter).setCapacity(this.sdCards.get(SDCardCounter).getCapacity() - size);
            this.sdCards.get(SDCardCounter).savePic(P);
        } else {
            System.out.println("ERROR: Not enough capacity available on SD-Card" + SDCardCounter + ", add another SD-Card!");
        }
    }


    public void addLens(Lens lens) {
        this.lenses.add(lens);
    }

    public void addSDCard(SDCard sdCard) {
        this.sdCards.add(sdCard);
        this.SDCardCounter += 1;
        System.out.println("SDCard" + SDCardCounter + " added!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Lens> getLenses() {
        return lenses;
    }

    public void setLenses(List<Lens> lenses) {
        this.lenses = lenses;
    }

    public List<SDCard> getSdCards() {
        return sdCards;
    }

    public void setSdCards(List<SDCard> sdCards) {
        this.sdCards = sdCards;
    }
}

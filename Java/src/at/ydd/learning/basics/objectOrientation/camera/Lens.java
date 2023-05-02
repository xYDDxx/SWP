package at.ydd.learning.basics.objectOrientation.camera;

public class Lens {
    private String manufacturer;
    private int focalLength;

    public Lens(String manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }
}

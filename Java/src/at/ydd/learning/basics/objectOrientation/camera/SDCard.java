package at.ydd.learning.basics.objectOrientation.camera;


import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Picture> pictures;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void savePic(Picture picture) {
        System.out.println("Saving Picture...");
        this.pictures.add(picture);
        System.out.println("Picture Saved!");
    }

    public void checkCapacity() {
        System.out.println(this.getCapacity() + "MB Capacity left!");
    }
}

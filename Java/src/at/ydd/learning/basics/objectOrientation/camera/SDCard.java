package at.ydd.learning.basics.objectOrientation.camera;

import at.ydd.learning.basics.objectOrientation.phone.PhoneFile;

import java.util.List;

public class SDCard {
    private int capacity;
    private List<Picture> pictures;

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void savePic(Picture picture) {
        this.pictures.add(picture);
        System.out.println("Picture Saved!");
    }

    public void checkCapacity(){
        System.out.println(this.getCapacity() + "MB Capacity left!");
    }
}

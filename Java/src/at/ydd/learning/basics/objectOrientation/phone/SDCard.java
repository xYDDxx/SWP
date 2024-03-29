package at.ydd.learning.basics.objectOrientation.phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public void saveFile(PhoneFile file) {
        this.files.add(file);
        System.out.println("File Saved!");
        System.out.println(this.getCapacity() + "MB Capacity left!");
    }

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void printCapacity() {
        System.out.println("Your capacity is: " + capacity + "MB");
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getAllFiles() {
        for (int i = 0; i < files.size(); i++) {
            this.files.get(i).getInfo();
        }
    }

    public void getFreeCapacity(int freeSpace) {
        setCapacity(getCapacity() + freeSpace);
        System.out.println("Your new capacity is: " + this.getCapacity() + "MB");
    }

}

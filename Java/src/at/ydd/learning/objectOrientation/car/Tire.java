package at.ydd.learning.objectOrientation.car;

public class Tire {
    private int size;
    private int location;

    public Tire(int size, int location) {
        this.size = size;
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getlocation() {
        return location;
    }

    public void setlocation(int location) {
        this.location = location;
    }
}


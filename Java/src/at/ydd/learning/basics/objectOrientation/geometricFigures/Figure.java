package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Figure {
    private String name;
    private float length;

    public Figure(String name, float length) {
        this.name = name;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void getName(){
        System.out.println(name);
    }
}

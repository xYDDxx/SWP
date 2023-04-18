package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Dice extends Figure {
    public Dice(String name, float length) {
        super(name, length);
    }

    public void getArea(){
        System.out.println(getLength()*getLength()*6);
    }
}

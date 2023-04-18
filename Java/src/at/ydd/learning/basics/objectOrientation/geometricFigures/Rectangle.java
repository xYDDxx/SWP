package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Rectangle extends Figure {
    private float width;
    public Rectangle(String name, float length, float width) {
        super(name, length);
        this.width = width;
    }

    public void getArea(){
        System.out.println(getLength()*width);
    }
}

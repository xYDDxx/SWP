package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Square extends Figure {

    public Square(String name, float length) {
        super(name, length);
    }

    public void getArea(){
        System.out.println(getLength()*getLength());
    }

}

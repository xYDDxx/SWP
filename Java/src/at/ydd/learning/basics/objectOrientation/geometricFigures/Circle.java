package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Circle extends Figure{
    float pi = (float) 3.141592;
    public Circle(String name, float length) {
        super(name, length);
    }

    public void getArea(){
        System.out.println(getLength()/4*pi);
    }
}

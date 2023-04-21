package at.ydd.learning.basics.objectOrientation.geometricFigures;

public class Main {
    public static void main(String[] args) {

        Figure F1 = new Figure("Float1",8);
        Circle C1 = new Circle("Circle1",4);
        Rectangle Re1 = new Rectangle("Rectangle1",4,12);
        Square S1 = new Square("Square1",6);
        Dice D1 = new Dice("Dice1",5);

        C1.getArea();
        Re1.getArea();
        S1.getArea();
        D1.getArea();
    }
}

package at.ydd.learning.basics.objectOrientation.calculator;

public class ScienceCalculator extends Calculator{

    public ScienceCalculator(double a, double b) {
        super(a, b);
    }

    private double result;

    public void Sin(){
        result = Math.sin(getA());
        System.out.println("Sinus von a ist: " + result);
        result = Math.sin(getB());
        System.out.println("Sinus von b ist: " + result);
    }

    public void Cos(){
        result = Math.cos(getA());
        System.out.println("Cosinus von a ist: " + result);
        result = Math.cos(getB());
        System.out.println("Cosinus von b ist: " + result);
    }
}

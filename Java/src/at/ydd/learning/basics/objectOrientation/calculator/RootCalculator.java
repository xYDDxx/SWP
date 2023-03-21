package at.ydd.learning.basics.objectOrientation.calculator;

public class RootCalculator extends Calculator{
    public RootCalculator(double a, double b) {
        super(a, b);
    }

    private double result;

    public void SquareRoot(){
        result = Math.sqrt(getA());
        System.out.println("Wurzel von a ist: " + result);
        result = Math.sqrt(getB());
        System.out.println("Wurzel von b ist: " + result);
    }
}

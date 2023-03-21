package at.ydd.learning.basics.objectOrientation.calculator;

public class Calculator {
    private double a;
    private double b;
    private double result;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void addition(){
        result = a + b;
        System.out.println(result);
    }

    public void subtraction(){
        result = a - b;
        System.out.println(result);
    }

    public void multiplication(){
        result = a * b;
        System.out.println(result);
    }

    public void division(){
        result = a / b;
        System.out.println(result);
    }
}

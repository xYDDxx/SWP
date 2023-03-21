package at.ydd.learning.basics.objectOrientation.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10,2);
        c1.addition();
        c1.subtraction();
        c1.multiplication();
        c1.division();

        ScienceCalculator sc1 = new ScienceCalculator(5,10);
        sc1.Cos();
        sc1.Sin();

        RootCalculator rc1 = new RootCalculator(4,6);
        rc1.SquareRoot();
    }
}

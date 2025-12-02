package ch.samt;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}

package ch.samt;

import ch.samt.Calculator;

public class CalculatorService {

    private Calculator calculator = new Calculator();

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }


    public int addAndMultiplyByTwo(int a, int b) {
        return calculator.add(a, b) * 2;
    }


    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}

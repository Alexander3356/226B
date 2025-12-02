package ch.samt;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void testAdd(){
        // given
        Calculator calculator = new Calculator();
        // when
        int result = calculator.add(1, 2);
        // then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testDiv(){
        // given
        Calculator calculator = new Calculator();
        // when
        double result = calculator.div(4, 2);
        // then
        Assert.assertEquals(2, result, 0);
    }



}

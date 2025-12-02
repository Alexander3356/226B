package ch.samt;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {

    @Test
    public void mockedTestAddAndMultiplyByTwo(){
        // given
        Calculator mockCalculator = mock(Calculator.class);
        when(mockCalculator.add(1, 2)).thenReturn(3);
        CalculatorService service = new CalculatorService(mockCalculator);
        // when
        int result = service.addAndMultiplyByTwo(1, 2);
        // then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testAddAndMultiplyByTwo(){
        // given
        CalculatorService service = new CalculatorService(new Calculator());
        // when
        int result = service.addAndMultiplyByTwo(1, 2);
        // then
        Assert.assertEquals(6, result);
    }


}

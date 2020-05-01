package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addition() {
        int a = 1;
        int b = 2;

        Calculator calculator = new Calculator();
        int result = calculator.addition(a,b);
        assertEquals(3, result);
    }
}
package com.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addition() {
        assertEquals("1 + 2 = 3",3, calculator.addition(1,2));
    }

    @Test
    public void subtraction() {
        assertEquals("2 - 1 = 1", 1, calculator.subtraction(2,1));
    }

    @Test
    public void isPositive() {

        assertTrue("0 is a positive number", calculator.isPositive(0));

        assertFalse("-2 is not a positive number", calculator.isPositive(-2));

    }

    @Test
    public void isNegative() {

        assertTrue("-1 is a negative number", calculator.isNegative(-1));

        assertFalse("0 is not a negative number", calculator.isNegative(0));

    }

}
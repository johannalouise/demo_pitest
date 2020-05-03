package demo.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addition() {
        // GIVEN
        int a = 1;
        int b = 2;

        // WHEN
        int result = calculator.addition(a,b);

        // THEN
        assertEquals("1 + 2 = 3",3, result);
    }

    @Test
    public void subtraction() {
        // GIVEN
        int a = 2;
        int b = 1;

        // WHEN
        int result = calculator.subtraction(a,b);

        // THEN
        assertEquals("2 - 1 = 1", 1, result);
    }

    @Test
    public void isPositive() {
        // GIVEN
        int a = 2;

        // WHEN
        boolean resultTrue = calculator.isPositive(a);

        // THEN
        assertTrue("2 is a positive number", resultTrue);

        // GIVEN
        int b = -2;

        // WHEN
        boolean resultFalse = calculator.isPositive(b);

        // THEN
        assertFalse("-2 is not a positive number", resultFalse);

    }

    @Test
    public void isNegative() {
        // GIVEN
        int a = -1;

        // WHEN
        boolean resultTrue = calculator.isNegative(a);

        // THEN
        assertTrue("-1 is a negative number", resultTrue);

        // GIVEN
        int b = 0;

        // WHEN
        boolean resultFalse = calculator.isNegative(b);

        // THEN
        assertFalse("0 is not a negative number", resultFalse);

    }

}
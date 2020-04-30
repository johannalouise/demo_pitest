import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        int a = 1;
        int b = 2;

        Calculator calculator = new Calculator();
        int result = calculator.addition(a,b);
        assertEquals(3, result);
    }
}
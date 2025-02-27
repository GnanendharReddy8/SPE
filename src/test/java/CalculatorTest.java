import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSqrtPositive() {
        assertEquals(3.0, calculator.sqrt(9), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSqrtNegative() {
        calculator.sqrt(-1);
    }

    @Test
    public void testFactorialValid() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }

    @Test
    public void testLnValid() {
        assertEquals(0.0, calculator.ln(1), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnZero() {
        calculator.ln(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLnNegative() {
        calculator.ln(-1);
    }

    @Test
    public void testPowerValid() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
    }
}

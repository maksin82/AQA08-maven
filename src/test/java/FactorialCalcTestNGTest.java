import org.junit.jupiter.api.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalcTestNGTest {
    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalc.calcFactorial(0), 1);
    }


    @Test
    public void testFactorialOfNumber() {
        Assert.assertEquals(FactorialCalc.calcFactorial(5), 120);
    }


    @Test(expectedExceptions = IllegalArgumentException.class, description = "отрицательное число")
    public void testNegativeNumber() {
        FactorialCalc.calcFactorial(-1);
    }


    @Test
    public void testFactorialOfMaxInt() {
        try {
            FactorialCalc.calcFactorial(Integer.MAX_VALUE);
            Assert.fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getClass(), ArithmeticException.class);
        }
    }


    @Test
    public void testFactorialOfBigInt() {
        Assert.assertThrows(ArithmeticException.class, () -> FactorialCalc.calcFactorial(120));
    }
}


import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalcTestNGTest {
    @Test(expectedExceptions = IllegalArgumentException.class, description = "отрицательное число")
    public void testNegativeNumber() {
        FactorialCalc.calcFactorial(-1);
    }


    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalc.calcFactorial(0), 1);
    }


    @Test
    public void testFactorialOfNumber() {
        Assert.assertEquals(FactorialCalc.calcFactorial(1), 1);
    }


    @Test
    public void testFactorialSmallNumber() {
        Assert.assertEquals(FactorialCalc.calcFactorial(2), 2);
    }


    @Test
    public void testFactorialBigNumber() {
        Assert.assertEquals(FactorialCalc.calcFactorial(11), 39916800);
    }


    @Test
    public void testFactorialOnBoundary() {
        Assert.assertEquals(FactorialCalc.calcFactorial(12), 479001600);
    }


    @Test
    public void testFactorialBeyondBoundary() {
        Assert.assertThrows(ArithmeticException.class, () -> FactorialCalc.calcFactorial(13));
    }
}


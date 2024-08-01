import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FactorialCalcJUnitTest {
    @DisplayName("отрицательное число")
    @Test
    void testFactorialOfNegativeNumber() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                FactorialCalc.calcFactorial(-1);
            }
        };
        assertThrows(IllegalArgumentException.class, executable);
    }


    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalc.calcFactorial(0));
    }


    @Test
    void testFactorialOfNumber() {
        assertEquals(1, FactorialCalc.calcFactorial(1));
    }


    @Test
    void testFactorialSmallNumber() {
        assertEquals(2, FactorialCalc.calcFactorial(2));
    }


    @Test
    void testFactorialBigNumber() {
        assertEquals(39916800, FactorialCalc.calcFactorial(11));
    }


    @Test
    void testFactorialOnBoundary() {
        assertEquals(479001600, FactorialCalc.calcFactorial(12));
    }


    @Test
    void testFactorialBeyondBoundary() {
        Executable executable = () -> FactorialCalc.calcFactorial(13);

        assertThrows(ArithmeticException.class, executable);
    }
}

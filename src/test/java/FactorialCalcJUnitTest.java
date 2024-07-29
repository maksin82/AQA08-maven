import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FactorialCalcJUnitTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalc.calcFactorial(0));
    }


    @Test
    void testFactorialOfNumber() {
        assertEquals(120, FactorialCalc.calcFactorial(5));
    }


    @DisplayName("отрицательное число")
    @Test
    void testFactorialOfNegativeNumber() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                FactorialCalc.calcFactorial(-5);
            }
        };
        assertThrows(IllegalArgumentException.class, executable);
    }


    @Test
    void testFactorialOfMaxInt() {
        Executable executable = () -> FactorialCalc.calcFactorial(Integer.MAX_VALUE);

        assertThrows(ArithmeticException.class, executable);
    }
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FactorialTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calcFactorial(0));
    }

    @Test
    void testFactorialOfNumber() {
        assertEquals(120, Factorial.calcFactorial(5));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                Factorial.calcFactorial(-5);
            }
        };

        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testFactorialOfMaxInt() {
        Executable executable = () -> Factorial.calcFactorial(Integer.MAX_VALUE);

        assertThrows(ArithmeticException.class, executable);
    }
}

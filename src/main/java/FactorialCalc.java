public class FactorialCalc {
    static int calcFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть натуральным числом");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            long temp = (long) result * i;
            if (temp > Integer.MAX_VALUE) {
                throw new ArithmeticException("слишком большое число");
            }
            result = (int) temp;
        }
        return result;
    }
}

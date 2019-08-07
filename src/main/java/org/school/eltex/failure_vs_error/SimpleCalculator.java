package org.school.eltex.failure_vs_error;

public class SimpleCalculator {

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return dividend / divisor;
    }

    public static int sum(double left, double right) {
        return (int) (left + right);
    }
}

public class FinancialCalculator {

    // recursive method
    public static double calculate(double value, double rate, int yearsLeft) {
        if (yearsLeft == 0) {
            return value;
        }
        return calculate(value, rate, yearsLeft - 1) * (1 + rate);
    }
}
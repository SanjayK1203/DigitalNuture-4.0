public class Finance {
    private double initialValue;
    private double growthRate;
    private int years;

    public Finance(double initialValue, double growthRate, int years) {
        this.initialValue = initialValue;
        this.growthRate = growthRate;
        this.years = years;
    }

    public double calculateFutureValue() {
        return FinancialCalculator.calculate(initialValue, growthRate, years);
    }
}
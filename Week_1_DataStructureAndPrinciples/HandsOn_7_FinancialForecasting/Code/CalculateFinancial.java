package Week_1_DataStructureAndPrinciples.HandsOn_7_FinancialForecasting.Code;

public class CalculateFinancial {
    private double amount;
    private double rate;
    private int years;

    public CalculateFinancial(Financial data) {
        this.amount = data.getInitialAmount();
        this.rate = data.getGrowthRate() / 100;
        this.years = data.getDuration();
    }

    public void calculateAndPrint() {
        double result = calculate(amount, rate, years);
        System.out.printf("Estimated Future Value: %.2f\n ", result);
    }

    private double calculate(double amt, double r, int y) {
        if (y == 0) return amt;
        return calculate(amt * (1 + r), r, y - 1);
    }
}

package week_1.engineering_concept.design_patterns_and_principle.financialforecast;
public class ForecastCalculator {
    private final ForecastStrategy strategy;

    // Constructor takes abstraction (strategy)
    public ForecastCalculator(ForecastStrategy strategy) {
        this.strategy = strategy;
    }

    public double getForecast(int years, double initialValue, double growthRate) {
        return strategy.calculate(years, initialValue, growthRate);
    }
}
package week_1.engineering_concept.design_patterns_and_principle.financialforecast;


public class RecursiveForecast implements ForecastStrategy {

    @Override
    public double calculate(int years, double initialValue, double growthRate) {
        if (years == 0) {
            return initialValue;
        }
        return calculate(years - 1, initialValue, growthRate) * (1 + growthRate);
    }
}

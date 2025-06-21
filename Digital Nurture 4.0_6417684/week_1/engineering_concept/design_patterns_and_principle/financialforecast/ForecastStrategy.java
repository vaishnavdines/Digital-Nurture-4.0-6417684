package week_1.engineering_concept.design_patterns_and_principle.financialforecast;

public interface ForecastStrategy {
    double calculate(int years, double initialValue, double growthRate);
}
package week_1.engineering_concept.design_patterns_and_principle.financialforecast;

import java.util.Scanner;

public class ForecastApp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Financial Forecasting Tool ----");

        System.out.print("Enter initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.1 for 10%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        // Use recursive strategy
        ForecastStrategy strategy = new RecursiveForecast();
        ForecastCalculator calculator = new ForecastCalculator(strategy);

        double result = calculator.getForecast(years, initialValue, growthRate);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, result);
    }
}
package Week_1_DataStructureAndPrinciples.HandsOn_7_FinancialForecasting.Code;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial investment: ");
        double investment = sc.nextDouble();
        System.out.print("Enter annual growth rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        Financial data = new Financial.FinancialBuilder(investment)
                .setGrowthRate(rate)
                .setDuration(years)
                .build();

        CalculateFinancial calculator = new CalculateFinancial(data);
        calculator.calculateAndPrint();
        sc.close();
    }
}

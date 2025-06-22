package Week_1_DataStructureAndPrinciples.HandsOn_7_FinancialForecasting.Code;

public class Financial {
    private double initialAmount;
    private double growthRate;
    private int duration;

    public Financial(FinancialBuilder builder) {
        this.initialAmount = builder.initialAmount;
        this.growthRate = builder.growthRate;
        this.duration = builder.duration;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public int getDuration() {
        return duration;
    }

    public static class FinancialBuilder {
        private double initialAmount;
        private double growthRate;
        private int duration;

        public FinancialBuilder(double initialAmount) {
            this.initialAmount = initialAmount;
        }

        public FinancialBuilder setGrowthRate(double growthRate) {
            this.growthRate = growthRate;
            return this;
        }

        public FinancialBuilder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Financial build() {
            return new Financial(this);
        }
    }
}

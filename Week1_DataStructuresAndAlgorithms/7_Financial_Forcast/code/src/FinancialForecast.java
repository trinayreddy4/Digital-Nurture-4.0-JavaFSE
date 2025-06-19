public class FinancialForecast {

    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }

        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }
}
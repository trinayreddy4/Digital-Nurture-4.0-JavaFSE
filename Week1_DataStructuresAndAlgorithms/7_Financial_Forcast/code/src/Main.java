public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.07;
        int years = 5;

        double result = FinancialForecast.futureValue(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: $%.2f\n", years, result);
    }
}
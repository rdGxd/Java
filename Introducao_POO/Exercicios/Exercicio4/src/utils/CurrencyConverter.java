package utils;

public class CurrencyConverter {
  public static double IOF = 6.00;

  public static double calculator(double amount, double dollarPrice) {
    double value = dollarPrice * amount;
    return value + (value * IOF / 100);
  }
}

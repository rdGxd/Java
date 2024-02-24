package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();

    System.err.println();
    System.out.print("How many dollars will be bought? ");
    double amount = sc.nextDouble();

    System.err.println();
    double result = CurrencyConverter.calculator(amount, dollarPrice);
    System.out.printf("Amount to be paid in reais = %.2f", result);

    sc.close();
  }
}

package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class Program {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = sc.nextDouble();

    double c = Calculator.circumFerence(radius);
    double v = Calculator.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", Calculator.PI);

    sc.close();
  }

}
